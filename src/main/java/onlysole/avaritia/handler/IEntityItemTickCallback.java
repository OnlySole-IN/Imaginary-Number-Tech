package onlysole.avaritia.handler;

import net.minecraft.entity.item.EntityItem;

public interface IEntityItemTickCallback {
    void onEntityTick(EntityItem item);
}
