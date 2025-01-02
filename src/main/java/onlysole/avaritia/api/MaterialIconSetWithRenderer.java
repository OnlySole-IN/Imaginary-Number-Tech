package onlysole.avaritia.api;

import gregtech.api.unification.material.info.MaterialIconSet;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MaterialIconSetWithRenderer extends MaterialIconSet implements IRenderer, IItemRendererManager {
    private final IItemRendererManager rendererManager;

    /**
     * 构造函数，用于初始化 MaterialIconSetWithRenderer 对象
     * @param name 图标的名称
     * @param rendererManager 渲染器管理器
     */
    public MaterialIconSetWithRenderer(@Nonnull String name, IItemRendererManager rendererManager) {
        super(name);
        this.rendererManager = rendererManager;
    }

    /**
     * 构造函数，用于初始化 MaterialIconSetWithRenderer 对象，并指定父图标集
     * @param name 图标的名称
     * @param parentIconset 父图标集
     * @param rendererManager 渲染器管理器
     */
    public MaterialIconSetWithRenderer(@Nonnull String name, @Nonnull MaterialIconSet parentIconset, IItemRendererManager rendererManager) {
        super(name, parentIconset);
        this.rendererManager = rendererManager;
    }

    /**
     * 构造函数，用于初始化 MaterialIconSetWithRenderer 对象，并指定父图标集和是否为根图标集
     * @param name 图标的名称
     * @param parentIconset 父图标集
     * @param isRootIconset 是否为根图标集
     * @param rendererManager 渲染器管理器
     */
    public MaterialIconSetWithRenderer(@Nonnull String name, @Nullable MaterialIconSet parentIconset, boolean isRootIconset, IItemRendererManager rendererManager) {
        super(name, parentIconset, isRootIconset);
        this.rendererManager = rendererManager;
    }

    /**
     * 获取渲染器管理器
     * @return 渲染器管理器
     */
    @Override
    public IItemRendererManager getRendererManager() {
        return rendererManager;
    }

    /**
     * 当渲染器注册时调用此方法
     * @param location 资源位置
     */
    @Override
    public void onRendererRegistry(ResourceLocation location) {
        rendererManager.onRendererRegistry(location);
    }
}

