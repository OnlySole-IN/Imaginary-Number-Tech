package onlysole.imaginarynumbertech.common;

import gregtech.api.GregTechAPI;
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
}
