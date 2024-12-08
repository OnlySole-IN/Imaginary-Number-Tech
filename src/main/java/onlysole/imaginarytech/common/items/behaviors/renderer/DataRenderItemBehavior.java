package onlysole.imaginarytech.common.items.behaviors.renderer;

import codechicken.lib.model.ModelRegistryHelper;
import codechicken.lib.util.TransformUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import onlysole.imaginarytech.api.items.metaitem.stats.renderer.IItemRendererManager;
import onlysole.imaginarytech.client.renderer.handler.DataItemRenderer;

public class DataRenderItemBehavior implements IItemRendererManager {//todo null
    @Override
    public void onRendererRegistry(ResourceLocation location) {
        ModelRegistryHelper.register(new ModelResourceLocation(location, "inventory"), new DataItemRenderer(TransformUtils.DEFAULT_ITEM, modelRegistry -> modelRegistry.getObject(new ModelResourceLocation(location, "inventory"))));
    }
}
