package onlysole.imaginarynumbertech.api.unification.material.info;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.info.MaterialIconSet;
import onlysole.avaritia.api.MaterialIconSetWithRenderer;
import onlysole.avaritia.behavior.CosmicRenderItemBehavior;
import onlysole.avaritia.behavior.DataRenderItemBehavior;
import onlysole.avaritia.behavior.HaloRenderItemBehavior;
import onlysole.imaginarynumbertech.client.renderer.texture.INTTextures;

@ZenRegister
public class INTMaterialIconSet {
    public static final MaterialIconSet CUSTOM_MHCSM = new MaterialIconSet(
            "mhcsm", null, true);

    public static final MaterialIconSet CUSTOM_CN = new MaterialIconSetWithRenderer(//TODO
            "cosmic_neutronium", null, true,new DataRenderItemBehavior());

    public static final MaterialIconSet CUSTOM_SPACETIME = new MaterialIconSet(
            "spacetime", null, true);

    public static final MaterialIconSet CUSTOM_WWM = new MaterialIconSet(
            "whited_warf_matter", null, true);

    public static final MaterialIconSet CUSTOM_DEGENERATE_RHENIUM = new MaterialIconSet(
            "degenerate_rhenium", null, true);

    public static final MaterialIconSet CUSTOM_HYPOGEN = new MaterialIconSet(
            "hypogen", null, true);

    public static final MaterialIconSet CUSTOM_LEGENDARIUM = new MaterialIconSet(
            "legendarium", null, true);

    public static final MaterialIconSet BEDROCKIUM = new MaterialIconSet(
            "bedrockium", null, true);

    public static final MaterialIconSet PSEUDO_STABILITY_PROTO_HALALHA_STEEL = new MaterialIconSet(
            "pseudo_stability_proto_halalha_steel", null, true);

    public static final MaterialIconSet CUSTOM_PROTO_HALALHA_STEEL = new MaterialIconSet(
            "proto_halalha_steel", null, true);




    public static final MaterialIconSetWithRenderer MAGMATTER = new MaterialIconSetWithRenderer(
            "Magmatter", null, true,
            new HaloRenderItemBehavior(10, 0xFF000000, () -> INTTextures.HALO, true));

    public static final MaterialIconSetWithRenderer CUSTOM_ETERNITY = new MaterialIconSetWithRenderer(
            "eternity", null, true,
            new HaloRenderItemBehavior(10, 0xFF000000, () -> INTTextures.HALO, true));

    public static final MaterialIconSetWithRenderer CUSTOM_INFINITY = new MaterialIconSetWithRenderer(
            "infinity", null, true,
            new HaloRenderItemBehavior(10, 0xFF000000, () -> INTTextures.HALO, true));

    public static final MaterialIconSetWithRenderer PSEUDO_STABILITY_EXO_HALALHA_STEEL = new MaterialIconSetWithRenderer(
            "pseudo_stability_exo_halalha_steel", null, true,
            new HaloRenderItemBehavior(10, 0xFF000000, () -> INTTextures.HALO, true));

    public static final MaterialIconSetWithRenderer CUSTOM_EXO_HALALHA_STEEL = new MaterialIconSetWithRenderer(
            "exo_halalha_steel", null, true,
            new HaloRenderItemBehavior(10, 0xFF000000, () -> INTTextures.HALO, true));




    public static final MaterialIconSetWithRenderer CUSTOM_UNIVERSIUM = new MaterialIconSetWithRenderer(
            "universium", null, true,
            new CosmicRenderItemBehavior(() -> INTTextures.HALO, 1));


}
