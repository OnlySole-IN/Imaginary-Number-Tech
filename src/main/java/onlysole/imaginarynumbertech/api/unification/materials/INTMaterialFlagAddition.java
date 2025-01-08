package onlysole.imaginarynumbertech.api.unification.materials;

import gregtech.api.unification.material.Materials;

import static onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialFlags.*;

public class INTMaterialFlagAddition {

    private INTMaterialFlagAddition() {}

    public static void init() {
        //Materials..addFlags();
        Materials.Carbon.addFlags(GENERATE_NANITES);
        Materials.Iron.addFlags(GENERATE_NANITES);
        Materials.Copper.addFlags(GENERATE_NANITES);
        Materials.Silver.addFlags(GENERATE_NANITES);
        Materials.Gold.addFlags(GENERATE_NANITES);
        Materials.Neutronium.addFlags(GENERATE_NANITES);
        Materials.Glowstone.addFlags(GENERATE_NANITES);

    }

    public static void initLate() {

    }
}
