package onlysole.imaginarynumbertech.api.unification.material.info;

import gregtech.api.unification.material.info.*;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.common.blocks.MetaBlocks;
import onlysole.imaginarynumbertech.api.unification.material.properties.INTPropertyKey;

import static gregtech.api.unification.material.info.MaterialFlags.*;

public class INTMaterialFlags {
    public static final MaterialFlag GENERATE_CURVED_PLATE = new MaterialFlag.Builder("generate_curved_plate")
            .requireFlags(MaterialFlags.GENERATE_PLATE)
            .build();

    public static final MaterialFlag GENERATE_NANITES = new MaterialFlag.Builder("generate_nanites")
            .requireProps(INTPropertyKey.NANITES)
            .build();

    public static final MaterialFlag NO_CASING_SMALL = new MaterialFlag.Builder("no_casing_small")
            .build();

    public static final MaterialFlag NO_PLATE_SUPERDENSE = new MaterialFlag.Builder("no_plate_superdense")
           .build();

    public static final MaterialFlag NO_GENERATE_BLOCK = new MaterialFlag.Builder("no_generate_block")
            .build();
}
