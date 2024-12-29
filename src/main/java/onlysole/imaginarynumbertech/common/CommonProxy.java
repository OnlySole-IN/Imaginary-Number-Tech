package onlysole.imaginarynumbertech.common;

import gregtech.api.GregTechAPI;
import gregtech.api.block.VariantItemBlock;
import gregtech.api.cover.CoverDefinition;
import gregtech.api.recipes.recipeproperties.FusionEUToStartProperty;
import gregtech.loaders.recipe.CraftingComponent;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import onlysole.imaginarynumbertech.api.INTValues;
import onlysole.imaginarynumbertech.api.items.metaitem.INTMetaItem;
import onlysole.imaginarynumbertech.api.utils.INTLog;
import onlysole.imaginarynumbertech.common.items.INTMetaItems;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.function.Function;

import static onlysole.imaginarynumbertech.common.block.INTMetaBlocks.*;

@Mod.EventBusSubscriber(modid = INTValues.MOD_ID)
public class CommonProxy {

        public static final CreativeTabs IMAGINARY_TAB = new CreativeTabs("ImaginaryNumberTech") {
        @Nonnull
        @Override
        public ItemStack createIcon() {
            return INTMetaItems.ENERGISED_TESSERACT.getStackForm();
        }
    };

    public void preLoad() {}

    @SubscribeEvent
    public static void syncConfigValues(ConfigChangedEvent.OnConfigChangedEvent event) {}

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        INTLog.logger.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();

        registry.register(NT_WIRE_COIL);
        registry.register(BORON_SILICATE_GLASS_CASING);
        registry.register(CONTROL_CASING);
        registry.register(MACHINE_CASING);
        registry.register(PACKAGING_LINE);
        registry.register(COMPONENT_ASSEMBLY_LINE_CASING);
        registry.register(ADVANCED_ASSEMBLY_LINE_CASING);
        registry.register(PIPELINE_CASING);
        registry.register(ACTIVE_MULTIBLOCK_CASING);
        registry.register(QUANTUM_FORCE_TRANSFORMER_CASING);
        registry.register(QUANTUM_FORCE_TRANSFORMER_GLASS_CASING);
        registry.register(MACHINE_CASING_A);
        registry.register(MACHINE_CASING_B);
        registry.register(PCB_FACTORY_CASING);
        registry.register(DIMENSION_CASING);
        registry.register(ADV_FACTORY_CASING);
        registry.register(DHPCA_FACTORY_CASING);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        INTLog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();

        for (INTMetaItem<?> item : INTMetaItems.INT_ITEMS) {
            registry.register(item);
            item.registerSubItems();
        }

        registry.register(createItemBlock(NT_WIRE_COIL, VariantItemBlock::new));
        registry.register(createItemBlock(BORON_SILICATE_GLASS_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(CONTROL_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(MACHINE_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(PACKAGING_LINE, VariantItemBlock::new));
        registry.register(createItemBlock(COMPONENT_ASSEMBLY_LINE_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(ADVANCED_ASSEMBLY_LINE_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(PIPELINE_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(ACTIVE_MULTIBLOCK_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(QUANTUM_FORCE_TRANSFORMER_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(QUANTUM_FORCE_TRANSFORMER_GLASS_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(MACHINE_CASING_A, VariantItemBlock::new));
        registry.register(createItemBlock(MACHINE_CASING_B, VariantItemBlock::new));
        registry.register(createItemBlock(PCB_FACTORY_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(DIMENSION_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(ADV_FACTORY_CASING, VariantItemBlock::new));
        registry.register(createItemBlock(DHPCA_FACTORY_CASING, VariantItemBlock::new));

    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    //  Cover Behavior Event
    @SubscribeEvent
    public static void registerCoverBehavior(GregTechAPI.RegisterEvent<CoverDefinition> event) {
        /*INTCoverBehavior.init();

        for (BlockWireCoil.CoilType type : BlockWireCoil.CoilType.values()) {
            HEATING_COILS.put(NT_WIRE_COIL.getState(type), type);
        }*/
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        FusionEUToStartProperty.registerFusionTier(9, "(MK4)");
        FusionEUToStartProperty.registerFusionTier(10, "(MK5)");

        INTLog.logger.info("Registering recipes...");

        INTMetaItems.registerOreDict();
    }

    @SubscribeEvent
    public static void registerRecipeHandlers(RegistryEvent.Register<IRecipe> event) {

    }

    //  Crafting Component Event
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void initComponents(GregTechAPI.RegisterEvent<CraftingComponent> event) {
        //MaterialComponents.init();
    }

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void load() {
        //GTDataFixers.init();
    }
}
