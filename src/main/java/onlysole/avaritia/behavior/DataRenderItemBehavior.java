package onlysole.avaritia.behavior;

import codechicken.lib.model.ModelRegistryHelper;
import codechicken.lib.util.TransformUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import onlysole.avaritia.api.IItemRendererManager;
import onlysole.avaritia.renderer.onlysole.DataItemRenderer;

public class DataRenderItemBehavior implements IItemRendererManager {//todo null
    @Override
    public void onRendererRegistry(ResourceLocation location) {
        ModelRegistryHelper.register(new ModelResourceLocation(location, "inventory"), new DataItemRenderer(TransformUtils.DEFAULT_ITEM, modelRegistry -> modelRegistry.getObject(new ModelResourceLocation(location, "inventory"))));
    }
}
