package onlysole.imaginarynumbertech.api.unification.ore;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.info.MaterialFlags;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import net.minecraft.client.resources.I18n;
import onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialFlags;
import onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialIconType;
import stanhebben.zenscript.annotations.ZenClass;

import java.util.Collections;

import static gregtech.api.GTValues.M;
import static gregtech.api.unification.ore.OrePrefix.Conditions.hasIngotProperty;
import static gregtech.api.unification.ore.OrePrefix.Conditions.hasOreProperty;
import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION;

@ZenClass("mods.imaginarynumbertech.ore.INTOrePrefix")
@ZenRegister
public class INTOrePrefix {

    public static final OrePrefix plateCurved = new OrePrefix("plateCurved", M, null, INTMaterialIconType.plateCurved, ENABLE_UNIFICATION,
            (material -> material.hasFlag(MaterialFlags.GENERATE_PLATE) && material.hasFlag(INTMaterialFlags.GENERATE_CURVED_PLATE)));
    public static final OrePrefix milled = new OrePrefix("milled", -1, null, INTMaterialIconType.milled, ENABLE_UNIFICATION,
            hasOreProperty, mat -> Collections.singletonList(I18n.format("metaitem.milled.tooltip.flotation")));
    public static final OrePrefix nanites = new OrePrefix("nanites", -1, null, INTMaterialIconType.nanites, ENABLE_UNIFICATION,
            (material -> material.hasFlag(INTMaterialFlags.GENERATE_NANITES)));
    public static final OrePrefix casingSmall = new OrePrefix("casingSmall", M, null, INTMaterialIconType.casingSmall, ENABLE_UNIFICATION,
            hasIngotProperty);
    public static final OrePrefix wrapCircuit = new OrePrefix("wrapCircuit", -1, null, INTMaterialIconType.wrapCircuit, ENABLE_UNIFICATION,
            null);
    public static final OrePrefix wrap = new OrePrefix("wrap", -1, null, INTMaterialIconType.wrap, ENABLE_UNIFICATION,
            null);
    public static void init() {
        milled.addSecondaryMaterial(new MaterialStack(Materials.Stone, OrePrefix.stone.getMaterialAmount(Materials.Stone)));
    }

}
