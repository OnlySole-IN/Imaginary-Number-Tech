package onlysole.imaginarynumbertech.client;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import onlysole.imaginarynumbertech.client.event.INTClientEventHandler;
import onlysole.imaginarynumbertech.client.renderer.texture.INTTextures;
import onlysole.imaginarynumbertech.client.utils.ShaderHelper;
import onlysole.imaginarynumbertech.common.CommonProxy;

@Mod.EventBusSubscriber({Side.CLIENT})
public class ClientProxy extends CommonProxy {

    public void preLoad()
    {
        super.preLoad();
        MinecraftForge.EVENT_BUS.register(new INTClientEventHandler());
        ShaderHelper.initShaders();
        INTTextures.preInit();
//
//        ResearchPipeRenderer.INSTANCE.preInit();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
//        INTMetaBlocks.registerStateMappers();
//        INTMetaBlocks.registerItemModels();
    }

}