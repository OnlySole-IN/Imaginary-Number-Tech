package onlysole.imaginarynumbertech.api.items.metaitem;


import gregtech.api.gui.ModularUI;
import gregtech.api.items.gui.PlayerInventoryHolder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public abstract class INTStandardMetaItem extends INTMetaItem<INTMetaItem<?>.MetaValueItem> {

    public INTStandardMetaItem() {
        super((short) 0);
    }

    public INTStandardMetaItem(short metaItemOffset) {
        super(metaItemOffset);
    }

    @Override
    protected MetaValueItem constructMetaValueItem(short metaValue, String unlocalizedName) {
        return new MetaValueItem(metaValue, unlocalizedName);
    }

    public abstract void registerSubItems();
}
