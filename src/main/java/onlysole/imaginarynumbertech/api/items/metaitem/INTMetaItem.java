package onlysole.imaginarynumbertech.api.items.metaitem;

import com.enderio.core.common.interfaces.IOverlayRenderAware;

import gregtech.api.capability.GregtechCapabilities;
import gregtech.api.capability.IElectricItem;
import gregtech.api.capability.impl.ElectricItem;
import gregtech.api.gui.ModularUI;
import gregtech.api.items.OreDictNames;
import gregtech.api.items.gui.ItemUIFactory;
import gregtech.api.items.gui.PlayerInventoryHolder;
import gregtech.api.items.metaitem.DefaultSubItemHandler;
import gregtech.api.items.metaitem.FoodUseManager;
import gregtech.api.items.metaitem.stats.*;
import gregtech.api.recipes.ingredients.IntCircuitIngredient;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.material.Material;
import gregtech.api.util.GTUtility;
import gregtech.api.util.Mods;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import it.unimi.dsi.fastutil.shorts.Short2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.relauncher.Side;

import onlysole.imaginarynumbertech.client.utils.ToolChargeBarRenderer;
import onlysole.imaginarynumbertech.common.CommonProxy;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.*;


@Optional.Interface(
        modid = Mods.Names.ENDER_CORE,
        iface = "com.enderio.core.common.interfaces.IOverlayRenderAware")
public abstract class INTMetaItem<T extends INTMetaItem<?>.MetaValueItem> extends Item
        implements ItemUIFactory, IOverlayRenderAware {

    private final Map<String, T> names = new Object2ObjectOpenHashMap<>();
    protected final Short2ObjectMap<T> metaItems = new Short2ObjectLinkedOpenHashMap<>();
    protected final Short2ObjectMap<ModelResourceLocation> metaItemsModels = new Short2ObjectOpenHashMap<>();
    protected final Short2ObjectMap<ModelResourceLocation[]> specialItemsModels = new Short2ObjectOpenHashMap<>();
    protected static final ModelResourceLocation MISSING_LOCATION = new ModelResourceLocation("builtin/missing",
            "inventory");
    private static final List<INTMetaItem<?>> META_ITEMS = new ArrayList<>();
    private CreativeTabs[] defaultCreativeTabs = new CreativeTabs[] {CommonProxy.IMAGINARY_TAB};
    private final Set<CreativeTabs> additionalCreativeTabs = new ObjectArraySet<>();
    public static List<INTMetaItem<?>> getMetaItems() {
        return Collections.unmodifiableList(META_ITEMS);
    }

    protected final short metaItemOffset;
    private String translationKey = "metaitem";

    public INTMetaItem(short metaItemOffset) {
        setHasSubtypes(true);
        this.metaItemOffset = metaItemOffset;
        META_ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        for (short itemMetaKey : metaItems.keySet()) {
            T metaValueItem = metaItems.get(itemMetaKey);
            int numberOfModels = metaValueItem.getModelAmount();
            if (numberOfModels > 1) {
                ModelResourceLocation[] resourceLocations = new ModelResourceLocation[numberOfModels];
                for (int i = 0; i < resourceLocations.length; i++) {
                    ResourceLocation resourceLocation = createItemModelPath(metaValueItem, "/" + (i + 1));
                    ModelBakery.registerItemVariants(this, resourceLocation);
                    resourceLocations[i] = new ModelResourceLocation(resourceLocation, "inventory");
                }
                specialItemsModels.put((short) (metaItemOffset + itemMetaKey), resourceLocations);
                continue;
            }
            ResourceLocation resourceLocation = createItemModelPath(metaValueItem, "");
            if (numberOfModels > 0) {
                ModelBakery.registerItemVariants(this, resourceLocation);
            }
            metaItemsModels.put((short) (metaItemOffset + itemMetaKey),
                    new ModelResourceLocation(resourceLocation, "inventory"));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerTextureMesh() {
        ModelLoader.setCustomMeshDefinition(this, itemStack -> {
            short itemDamage = formatRawItemDamage((short) itemStack.getItemDamage());
            if (specialItemsModels.containsKey(itemDamage)) {
                int modelIndex = getModelIndex(itemStack);
                return specialItemsModels.get(itemDamage)[modelIndex];
            }
            if (metaItemsModels.containsKey(itemDamage)) {
                return metaItemsModels.get(itemDamage);
            }
            return MISSING_LOCATION;
        });
    }

    public ResourceLocation createItemModelPath(T metaValueItem, String postfix) {
        return GTUtility.gregtechId(formatModelPath(metaValueItem) + postfix);
    }
    protected String formatModelPath(T metaValueItem) {
        return "metaitems/" + metaValueItem.unlocalizedName;
    }
    protected int getModelIndex(ItemStack itemStack) {
        T metaValueItem = getItem(String.valueOf(itemStack));

        // Electric Items
        IElectricItem electricItem = itemStack.getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
        if (electricItem != null) {
            return (int) Math.min(((electricItem.getCharge() / (electricItem.getMaxCharge() * 1.0)) * 7), 7);
        }

        // Integrated (Config) Circuit
        if (metaValueItem != null) {
            return IntCircuitIngredient.getCircuitConfiguration(itemStack);
        }
        return 0;
    }

    protected abstract T constructMetaValueItem(short metaValue, String unlocalizedName);
    public final T addItem(int metaValue, String unlocalizedName) {
        Validate.inclusiveBetween(0, Short.MAX_VALUE - 1, metaValue + metaItemOffset,
                "MetaItem ID should be in range from 0 to Short.MAX_VALUE-1");
        T metaValueItem = constructMetaValueItem((short) metaValue, unlocalizedName);
        if (metaItems.containsKey((short) metaValue)) {
            T registeredItem = metaItems.get((short) metaValue);
            throw new IllegalArgumentException(
                    String.format("MetaId %d is already occupied by item %s (requested by item %s)", metaValue,
                            registeredItem.unlocalizedName, unlocalizedName));
        }
        metaItems.put((short) metaValue, metaValueItem);
        names.put(unlocalizedName, metaValueItem);
        return metaValueItem;
    }

    @Nullable
    public final T getItem(short metaValue) {
        return metaItems.get(formatRawItemDamage(metaValue));
    }
    public final T getItem(String valueName) {
        return names.get(valueName);
    }
    protected short formatRawItemDamage(short metaValue) {
        return metaValue;
    }
    @NotNull
    @Override
    public INTMetaItem<T> setTranslationKey(@NotNull String key) {
        this.translationKey = Objects.requireNonNull(key, "key == null");
        return this;
    }
    @NotNull
    @Override
    public String getTranslationKey() {
        return getTranslationKey((T) null);
    }

    @NotNull
    @Override
    public String getTranslationKey(@NotNull ItemStack stack) {
        return getTranslationKey(getItem(String.valueOf(stack)));
    }
    @NotNull
    protected String getTranslationKey(@Nullable T metaValueItem) {
        return metaValueItem == null ? this.translationKey : this.translationKey + "." + metaValueItem.unlocalizedName;
    }

    @NotNull
    @Override
    public CreativeTabs @NotNull [] getCreativeTabs() {
        if (additionalCreativeTabs.isEmpty()) return defaultCreativeTabs; // short circuit
        Set<CreativeTabs> tabs = new ObjectArraySet<>(additionalCreativeTabs);
        tabs.addAll(Arrays.asList(defaultCreativeTabs));
        return tabs.toArray(new CreativeTabs[0]);
    }
    @NotNull
    @Override
    public INTMetaItem<T> setCreativeTab(@NotNull CreativeTabs tab) {
        this.defaultCreativeTabs = new CreativeTabs[] { tab };
        return this;
    }
    public void registerSubItems() {}
    @NotNull
    public INTMetaItem<T> setCreativeTabs(@NotNull CreativeTabs @NotNull... tabs) {
        this.defaultCreativeTabs = tabs;
        return this;
    }
    public void addAdditionalCreativeTabs(@NotNull CreativeTabs @NotNull... tabs) {
        for (CreativeTabs tab : tabs) {
            if (!ArrayUtils.contains(defaultCreativeTabs, tab) && tab != CreativeTabs.SEARCH) {
                additionalCreativeTabs.add(tab);
            }
        }
    }
    @Override
    protected boolean isInCreativeTab(@NotNull CreativeTabs tab) {
        return tab == CreativeTabs.SEARCH ||
                ArrayUtils.contains(defaultCreativeTabs, tab) ||
                additionalCreativeTabs.contains(tab);
    }
    @Override
    public void getSubItems(@NotNull CreativeTabs tab, @NotNull NonNullList<ItemStack> subItems) {
        if (!isInCreativeTab(tab)) return;
        for (T item : metaItems.values()) {
            if (!item.isInCreativeTab(tab)) continue;
            item.getSubItemHandler().getSubItems(item.getStackForm(), tab, subItems);
        }
    }
    @Override
    public ModularUI createUI(PlayerInventoryHolder holder, EntityPlayer entityPlayer) {
        ItemStack itemStack = holder.getCurrentItem();
        T metaValueItem = getItem(String.valueOf(itemStack));
        ItemUIFactory uiFactory = metaValueItem == null ? null : metaValueItem.getUIManager();
        return uiFactory == null ? null : uiFactory.createUI(holder, entityPlayer);
    }
    @Override
    public void renderItemOverlayIntoGUI(@NotNull ItemStack stack, int xPosition, int yPosition) {
        ToolChargeBarRenderer.renderBarsItem(this, stack, xPosition, yPosition);
    }


    public class MetaValueItem {

        public INTMetaItem<T> getMetaItem() {
            return INTMetaItem.this;
        }

        public final int metaValue;

        public final String unlocalizedName;
        private IItemNameProvider nameProvider;
        private IItemMaxStackSizeProvider stackSizeProvider;
        private IItemContainerItemProvider containerItemProvider;
        private ISubItemHandler subItemHandler = DefaultSubItemHandler.INSTANCE;

        private final List<IItemComponent> allStats = new ArrayList<>();
        private final List<IItemBehaviour> behaviours = new ArrayList<>();
        private IItemUseManager useManager;
        private ItemUIFactory uiManager;
        //private IFilter.Factory filterBehavior;
        private IItemColorProvider colorProvider;
        private IItemDurabilityManager durabilityManager;
        private IEnchantabilityHelper enchantabilityHelper;
        private EnumRarity rarity;

        private int burnValue = 0;
        private int maxStackSize = 64;
        private int modelAmount = 1;

        @Nullable
        private CreativeTabs[] creativeTabsOverride;

        protected MetaValueItem(int metaValue, String unlocalizedName) {
            this.metaValue = metaValue;
            this.unlocalizedName = unlocalizedName;
        }

        public INTMetaItem.MetaValueItem setMaterialInfo(ItemMaterialInfo materialInfo) {
            if (materialInfo == null) {
                throw new IllegalArgumentException("Cannot add null ItemMaterialInfo.");
            }
            OreDictUnifier.registerOre(getStackForm(), materialInfo);
            return this;
        }
//
        public INTMetaItem.MetaValueItem setUnificationData(OrePrefix prefix, @Nullable Material material) {
            if (prefix == null) {
                throw new IllegalArgumentException("Cannot add null OrePrefix.");
            }
            OreDictUnifier.registerOre(getStackForm(), prefix, material);
            return this;
        }
//
        public INTMetaItem.MetaValueItem addOreDict(String oreDictName) {
            if (oreDictName == null) {
                throw new IllegalArgumentException("Cannot add null OreDictName.");
            }
            OreDictionary.registerOre(oreDictName, getStackForm());
            return this;
        }
//
        public INTMetaItem.MetaValueItem addOreDict(OreDictNames oreDictName) {
            if (oreDictName == null) {
                throw new IllegalArgumentException("Cannot add null OreDictName.");
            }
            OreDictionary.registerOre(oreDictName.name(), getStackForm());
            return this;
        }
//
        public INTMetaItem.MetaValueItem setCreativeTabs(CreativeTabs... tabs) {
            this.creativeTabsOverride = tabs;
            INTMetaItem.this.addAdditionalCreativeTabs(tabs);
            return this;
        }
//
        public INTMetaItem.MetaValueItem setInvisibleIf(boolean hide) {
            if (hide) this.creativeTabsOverride = new CreativeTabs[0];
            return this;
        }
//
        public INTMetaItem.MetaValueItem setInvisible() {
            this.creativeTabsOverride = new CreativeTabs[0];
            return this;
        }
//
        public INTMetaItem.MetaValueItem setMaxStackSize(int maxStackSize) {
            if (maxStackSize <= 0) {
                throw new IllegalArgumentException("Cannot set Max Stack Size to negative or zero value.");
            }
            this.maxStackSize = maxStackSize;
            return this;
        }
//
        public INTMetaItem.MetaValueItem setBurnValue(int burnValue) {
            if (burnValue <= 0) {
                throw new IllegalArgumentException("Cannot set Burn Value to negative or zero number.");
            }
            this.burnValue = burnValue;
            return this;
        }
//
        public INTMetaItem.MetaValueItem disableModelLoading() {
            this.modelAmount = 0;
            return this;
        }
//
        public INTMetaItem.MetaValueItem setModelAmount(int modelAmount) {
            if (modelAmount <= 0) {
                throw new IllegalArgumentException("Cannot set amount of models to negative or zero number.");
            }
            this.modelAmount = modelAmount;
            return this;
        }
//
        public INTMetaItem.MetaValueItem setRarity(EnumRarity rarity) {
            this.rarity = rarity;
            return this;
        }
//
        public INTMetaItem.MetaValueItem addComponents(IItemComponent... stats) {
            addItemComponentsInternal(stats);
            return this;
        }

        protected void addItemComponentsInternal(IItemComponent... stats) {
            for (IItemComponent itemComponent : stats) {
                if (itemComponent instanceof IItemNameProvider) {
                    this.nameProvider = (IItemNameProvider) itemComponent;
                }
                if (itemComponent instanceof IItemMaxStackSizeProvider) {
                    this.stackSizeProvider = (IItemMaxStackSizeProvider) itemComponent;
                }
                if (itemComponent instanceof ISubItemHandler) {
                    this.subItemHandler = (ISubItemHandler) itemComponent;
                }
                if (itemComponent instanceof IItemContainerItemProvider) {
                    this.containerItemProvider = (IItemContainerItemProvider) itemComponent;
                }
                if (itemComponent instanceof IItemDurabilityManager) {
                    this.durabilityManager = (IItemDurabilityManager) itemComponent;
                }
                if (itemComponent instanceof IItemUseManager) {
                    this.useManager = (IItemUseManager) itemComponent;
                }
                if (itemComponent instanceof IFoodBehavior) {
                    this.useManager = new FoodUseManager((IFoodBehavior) itemComponent);
                }
                if (itemComponent instanceof ItemUIFactory) {
                    this.uiManager = (ItemUIFactory) itemComponent;
                }
//                if (itemComponent instanceof IFilter.Factory) {
//                    this.filterBehavior = (IFilter.Factory) itemComponent;
//                }
                if (itemComponent instanceof IItemColorProvider) {
                    this.colorProvider = (IItemColorProvider) itemComponent;
                }
                if (itemComponent instanceof IItemBehaviour) {
                    this.behaviours.add((IItemBehaviour) itemComponent);
                    ((IItemBehaviour) itemComponent).addPropertyOverride(getMetaItem());
                }
                if (itemComponent instanceof IEnchantabilityHelper) {
                    this.enchantabilityHelper = (IEnchantabilityHelper) itemComponent;
                }
                this.allStats.add(itemComponent);
            }
        }

        public int getMetaValue() {
            return metaValue;
        }
//
        public List<IItemComponent> getAllStats() {
            return Collections.unmodifiableList(allStats);
        }
//
        public List<IItemBehaviour> getBehaviours() {
            return Collections.unmodifiableList(behaviours);
        }

        public ISubItemHandler getSubItemHandler() {
            return subItemHandler;
        }

        @Nullable
        public IItemDurabilityManager getDurabilityManager() {
            return durabilityManager;
        }
//
        @Nullable
        public IItemUseManager getUseManager() {
            return useManager;
        }
//
        @Nullable
        public ItemUIFactory getUIManager() {
            return uiManager;
        }

//        @Nullable
//        public IFilter.Factory getFilterFactory() {
//            return filterBehavior;
//        }

        @Nullable
        public IItemColorProvider getColorProvider() {
            return colorProvider;
        }
//
        @Nullable
        public IItemNameProvider getNameProvider() {
            return nameProvider;
        }
//
        @Nullable
        public IItemContainerItemProvider getContainerItemProvider() {
            return containerItemProvider;
        }
//
        @Nullable
        public IEnchantabilityHelper getEnchantabilityHelper() {
            return enchantabilityHelper;
        }

        public int getBurnValue() {
            return burnValue;
        }

        public int getMaxStackSize(ItemStack stack) {
            return stackSizeProvider == null ? maxStackSize : stackSizeProvider.getMaxStackSize(stack, maxStackSize);
        }
//
        public boolean isVisible() {
            return creativeTabsOverride == null || creativeTabsOverride.length > 0;
        }

        public int getModelAmount() {
            return modelAmount;
        }

        public EnumRarity getRarity() {
            return rarity;
        }

        public ItemStack getStackForm(int amount) {
            return new ItemStack(INTMetaItem.this, amount, metaItemOffset + metaValue);
        }

        public boolean isItemEqual(ItemStack itemStack) {
            return itemStack.getItem() == INTMetaItem.this && itemStack.getItemDamage() == (metaItemOffset + metaValue);
        }

        public ItemStack getStackForm() {
            return getStackForm(1);
        }

        /**
         * Attempts to get an fully charged variant of this electric item
         *
         * @param chargeAmount amount of charge
         * @return charged electric item stack
         * @throws java.lang.IllegalStateException if this item is not electric item
         */
        public ItemStack getChargedStack(long chargeAmount) {
            ItemStack itemStack = getStackForm(1);
            IElectricItem electricItem = itemStack.getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
            if (electricItem == null) {
                throw new IllegalStateException("Not an electric item.");
            }
            electricItem.charge(chargeAmount, Integer.MAX_VALUE, true, false);
            return itemStack;
        }
//
        public ItemStack getInfiniteChargedStack() {
            ItemStack itemStack = getStackForm(1);
            IElectricItem electricItem = itemStack.getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
            if (!(electricItem instanceof ElectricItem)) {
                throw new IllegalStateException("Not a supported electric item.");
            }
            ((ElectricItem) electricItem).setInfiniteCharge(true);
            return itemStack;
        }

        /**
         * Attempts to get an electric item variant with override of max charge
         *
         * @param maxCharge new max charge of this electric item
         * @return item stack with given max charge
         * @throws java.lang.IllegalStateException if this item is not electric item or uses custom implementation
         */
        public ItemStack getMaxChargeOverrideStack(long maxCharge) {
            ItemStack itemStack = getStackForm(1);
            IElectricItem electricItem = itemStack.getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
            if (electricItem == null) {
                throw new IllegalStateException("Not an electric item.");
            }
            if (!(electricItem instanceof ElectricItem)) {
                throw new IllegalStateException(
                        "Only standard ElectricItem implementation supported, but this item uses " +
                                electricItem.getClass());
            }
            ((ElectricItem) electricItem).setMaxChargeOverride(maxCharge);
            return itemStack;
        }

        public ItemStack getChargedStackWithOverride(IElectricItem source) {
            ItemStack itemStack = getStackForm(1);
            IElectricItem electricItem = itemStack.getCapability(GregtechCapabilities.CAPABILITY_ELECTRIC_ITEM, null);
            if (electricItem == null) {
                throw new IllegalStateException("Not an electric item.");
            }
            if (!(electricItem instanceof ElectricItem)) {
                throw new IllegalStateException(
                        "Only standard ElectricItem implementation supported, but this item uses " +
                                electricItem.getClass());
            }
            ((ElectricItem) electricItem).setMaxChargeOverride(source.getMaxCharge());
            long charge = source.discharge(Long.MAX_VALUE, Integer.MAX_VALUE, true, false, true);
            electricItem.charge(charge, Integer.MAX_VALUE, true, false);
            return itemStack;
        }

        public boolean isInCreativeTab(CreativeTabs tab) {
            CreativeTabs[] tabs = this.creativeTabsOverride != null ? this.creativeTabsOverride :
                    INTMetaItem.this.defaultCreativeTabs;
            return tabs.length > 0 && (tab == CreativeTabs.SEARCH || ArrayUtils.contains(tabs, tab));
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this)
                    .append("metaValue", metaValue)
                    .append("unlocalizedName", unlocalizedName)
                    .toString();
        }
    }
}

