package onlysole.imaginarynumbertech.api.unification;

import gregtech.common.items.MetaItems;

import static onlysole.imaginarynumbertech.api.unification.ore.INTOrePrefix.*;

public class OrePrefixAdditions {
    public static void init() {
        MetaItems.addOrePrefix(nanites);
        MetaItems.addOrePrefix(plateCurved);
        MetaItems.addOrePrefix(milled);
        wrap.setMarkerPrefix(true);
        wrapCircuit.setMarkerPrefix(true);
        MetaItems.addOrePrefix(casingSmall);
        MetaItems.addOrePrefix(plateSuperdense);
    }
}
