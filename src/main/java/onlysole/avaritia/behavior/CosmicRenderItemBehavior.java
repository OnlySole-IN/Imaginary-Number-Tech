package onlysole.avaritia.behavior;

import codechicken.lib.model.ModelRegistryHelper;
import codechicken.lib.util.TransformUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import onlysole.avaritia.api.ICosmicRenderBehavior;
import onlysole.avaritia.renderer.CosmicItemRender;

import javax.annotation.Nullable;
import java.util.function.Supplier;
//宇宙
public class CosmicRenderItemBehavior implements ICosmicRenderBehavior {

    private final Supplier<TextureAtlasSprite> supplier;
    private final int maskOpacity;

    public CosmicRenderItemBehavior(Supplier<TextureAtlasSprite> supplier, int maskOpacity) {
        this.supplier = supplier;
        this.maskOpacity = maskOpacity;
    }

    @Override
    public TextureAtlasSprite getMaskTexture(ItemStack stack, @Nullable EntityLivingBase player) {
        return supplier.get();
    }

    @Override
    public float getMaskOpacity(ItemStack stack, @Nullable EntityLivingBase player) {
        return maskOpacity;
    }

    @Override
    public void onRendererRegistry(ResourceLocation location) {
        ModelRegistryHelper.register(new ModelResourceLocation(location, "inventory"),
                new CosmicItemRender(TransformUtils.DEFAULT_ITEM, modelRegistry ->
                        modelRegistry.getObject(new ModelResourceLocation(location, "inventory"))
                )
        );
    }
}
