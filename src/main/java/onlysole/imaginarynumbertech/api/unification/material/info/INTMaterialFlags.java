package onlysole.imaginarynumbertech.api.unification.material.info;

import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.info.MaterialFlags;
import onlysole.imaginarynumbertech.api.unification.material.properties.INTPropertyKey;

public class INTMaterialFlags {
    public static final MaterialFlag GENERATE_CURVED_PLATE = new MaterialFlag.Builder("generate_curved_plate")
            .requireFlags(MaterialFlags.GENERATE_PLATE)
            .build();

    public static final MaterialFlag GENERATE_NANITES = new MaterialFlag.Builder("nanites")
            .requireProps(INTPropertyKey.NANITES)
            .build();

    public static final MaterialFlag NO_CASING_SMALL = new MaterialFlag.Builder("no_casing_small")

            .build();
}
