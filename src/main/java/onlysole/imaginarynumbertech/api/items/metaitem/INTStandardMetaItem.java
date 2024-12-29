package onlysole.imaginarynumbertech.api.items.metaitem;

//2024-12-29
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
