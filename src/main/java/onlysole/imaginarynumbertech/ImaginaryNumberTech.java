package onlysole.imaginarynumbertech;

import gregtech.api.worldgen.config.WorldGenRegistry;
import gregtech.common.ConfigHolder;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import onlysole.imaginarynumbertech.api.utils.INTLog;
import onlysole.imaginarynumbertech.common.CommonProxy;
import onlysole.imaginarynumbertech.common.block.INTMetaBlocks;
import onlysole.imaginarynumbertech.common.items.INTMetaItems;

import java.io.IOException;

import static onlysole.imaginarynumbertech.api.INTValues.*;

@Mod(modid = MOD_ID,
        name = MOD_NAME,
        acceptedMinecraftVersions = "[1.12.2,1.13)",
        version = VERSION,
        dependencies = "required-after:gregtech@[2.8.10-beta,);")
public class ImaginaryNumberTech {

    @SidedProxy(
            modId = MOD_ID,
            clientSide = "onlysole.imaginarynumbertech.client.ClientProxy",
            serverSide = "onlysole.imaginarynumbertech.common.CommonProxy"
    )
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void onConstruction(FMLConstructionEvent event)
    {
        ConfigHolder.machines.highTierContent = true;
    }
    @Mod.EventHandler
    public void onpreInit(FMLPreInitializationEvent event) {
        INTLog.init(event.getModLog());
        ConfigHolder.machines.highTierContent = true;
        //Facade showPlacementPreview TODO
        INTLog.logger.info("Enabled GregTechCEu highTierContent");
        INTMetaItems.init();
        INTMetaBlocks.init();
        //INTAPI.APIBlockInit();
        //MetaTileEntities.init();
        //INTWorldGenRegistry.init();

        //CapabilityManager.INSTANCE.register(IPollution.class, new PollutionProvider.Storage(), PollutionProvider.Impl::new);
        proxy.preLoad();
        proxy.preInit(event);

    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        //INTWorldGenRegistry.override();
        try {
            WorldGenRegistry.INSTANCE.reinitializeRegisteredVeins();
        } catch (IOException | RuntimeException exception) {
            INTLog.logger.fatal("Failed to initialize worldgen registry.", exception);
        }
        proxy.load();
    }
}
