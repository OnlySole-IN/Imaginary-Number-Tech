package onlysole.imaginarynumbertech.common.items;

import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import onlysole.imaginarynumbertech.api.items.metaitem.INTStandardMetaItem;

import static onlysole.imaginarynumbertech.common.items.INTMetaItems.*;
public class INTMetaItem2 extends INTStandardMetaItem {
    public INTMetaItem2() {
        super();
    }

    @Override
    public void registerSubItems() {
    GOOWARE_PROCESSOR_I =this.addItem(0,"gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
    }
}
