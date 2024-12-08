package onlysole.imaginarytech.client;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import onlysole.imaginarytech.client.event.ITClientEventHandler;
import onlysole.imaginarytech.client.renderer.texture.ITTextures;
import onlysole.imaginarytech.client.utils.ShaderHelper;
import onlysole.imaginarytech.common.CommonProxy;

@Mod.EventBusSubscriber({Side.CLIENT})
public class ClientProxy extends CommonProxy {

    public ClientProxy() {
    }
    public void preLoad()
    {
        super.preLoad();
        MinecraftForge.EVENT_BUS.register(new ITClientEventHandler());
        ShaderHelper.initShaders();
        ITTextures.preInit();
//
//        ResearchPipeRenderer.INSTANCE.preInit();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
//        ITMetaBlocks.registerStateMappers();
//        ITMetaBlocks.registerItemModels();
    }

}