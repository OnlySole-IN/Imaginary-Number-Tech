package onlysole.imaginarytech.mixin.gregtech;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.stats.IItemComponent;
import onlysole.imaginarytech.api.items.metaitem.IRenderer;
import onlysole.imaginarytech.api.items.metaitem.stats.renderer.IItemRendererManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value = MetaItem.MetaValueItem.class, remap = false)
public abstract class MixinMetaValueItem implements IRenderer {

    private IItemRendererManager rendererManager;

    @Override
    public IItemRendererManager getRendererManager() {
        return rendererManager;
    }

    @Inject(
            method = "addItemComponentsInternal([Lgregtech/api/items/metaitem/stats/IItemComponent;)V",
            at = @At(
                    value = "FIELD",
                    target = "Lgregtech/api/items/metaitem/MetaItem$MetaValueItem;allStats:Ljava/util/List;"
            ),
            locals = LocalCapture.CAPTURE_FAILHARD
    )
    private void addItemComponentsInternal(IItemComponent[] stats, CallbackInfo ci, IItemComponent[] var2, int var3, int var4, IItemComponent itemComponent) {
        // Java 8 不支持在 instanceof 中使用模式匹配，因此需要分开写
        if (itemComponent instanceof IItemRendererManager) {
            IItemRendererManager rendererManager = (IItemRendererManager) itemComponent;
            this.rendererManager = rendererManager;
        }
    }
}
