package onlysole.imaginarynumbertech.mixin.gregtech;

import gregtech.api.items.materialitem.MetaPrefixItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.info.MaterialIconSet;
import it.unimi.dsi.fastutil.shorts.ShortIterator;
import net.minecraft.util.ResourceLocation;
import onlysole.imaginarynumbertech.api.items.metaitem.IRenderer;
import onlysole.imaginarynumbertech.api.items.metaitem.stats.renderer.IItemRendererManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Map;

@Mixin(value = MetaPrefixItem.class, remap = false)
public abstract class MixinMetaPrefixItem extends StandardMetaItem {

    @Inject(
            method = "registerModels()V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/renderer/block/model/ModelBakery;registerItemVariants(Lnet/minecraft/item/Item;[Lnet/minecraft/util/ResourceLocation;)V",
                    ordinal = 0
            ),
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void registerModels(CallbackInfo ci, Map alreadyRegistered, ShortIterator var2, short metaItem, MaterialIconSet materialIconSet, short registrationKey, ResourceLocation resourceLocation) {
        // Java 8 不支持在 instanceof 中使用模式匹配，因此需要分开写
        if (materialIconSet instanceof IItemRendererManager) {
            IItemRendererManager rendererManager = (IItemRendererManager) materialIconSet;
            rendererManager.onRendererRegistry(resourceLocation);
            metaItems.get(metaItem).addComponents(((IRenderer)materialIconSet).getRendererManager());
        }
    }
}
