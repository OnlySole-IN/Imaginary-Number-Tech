package onlysole.imaginarynumbertech.client.renderer.texture;

import codechicken.lib.texture.TextureUtils;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import onlysole.imaginarynumbertech.api.utils.INTUtils;
import onlysole.imaginarynumbertech.client.renderer.texture.custom.IsaMillRenderer;

public class INTTextures {
//public static final OrientedOverlayRenderer ;
/*
SimpleSidedCubeRenderer
SimpleOverlayRenderer
OrientedOverlayRenderer
*/
    //imaginarynumbertech-

    //-casings
    public static INTOverlayRenderer PACKAGING_LINE =
            new INTOverlayRenderer("casings/solid/machine_packaging_line");
    public static INTOverlayRenderer ADVANCED_ASSEMBLY_LINE =
            new INTOverlayRenderer("casings/solid/advanced_assembly_line");
    public static INTOverlayRenderer QUANTUM_CONSTRAINT_CASING =
            new INTOverlayRenderer("casings/quantum_force_transformer_casing/quantum_constraint_casing");
    public static INTOverlayRenderer ADVANCED_INVAR_CASING =
            new INTOverlayRenderer("casings/solid/advanced_invar_casing");
    public static INTOverlayRenderer ADVANCED_ALUMINIUM_CASING =
            new INTOverlayRenderer("casings/solid/advanced_aluminium_casing");
    public static INTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK1 =
            new INTOverlayRenderer("casings/solid/precise_assembler_casing_mk1");
    public static INTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK2 =
            new INTOverlayRenderer("casings/solid/precise_assembler_casing_mk2");
    public static INTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK3 =
            new INTOverlayRenderer("casings/solid/precise_assembler_casing_mk3");
    public static INTOverlayRenderer IRIDIUM_CASING =
            new INTOverlayRenderer("casings/solid/advanced_assembly_line");
    public static INTOverlayRenderer FLOTATION_CASING =
            new INTOverlayRenderer("casings/solid/flotation_casing");
    public static INTOverlayRenderer ISA_MILL_CASING =
            new INTOverlayRenderer("casings/solid/isa_mill_casing");

    //-multiparts
    public static INTOverlayRenderer MULTIPART_CATALYST_HATCH =
            new INTOverlayRenderer("multiparts/overlay_catalyst_hatch");
    public static INTOverlayRenderer MULTIPART_BUFFER_HATCH =
            new INTOverlayRenderer("multiparts/overlay_buffer_hatch");
    public static INTOverlayRenderer INF_WATER =
            new INTOverlayRenderer("multiparts/overlay_water");

    public static final SimpleOverlayRenderer RESEARCH_DATA_ACCESS_HATCH =
            new SimpleOverlayRenderer("overlay/machine/overlay_data_hatch_optical");


    //gregtech-
    public static OrientedOverlayRenderer ISA_MILL_OVERLAY =
            new OrientedOverlayRenderer("multiblock/isa_mill");
    public static OrientedOverlayRenderer CRYOGENIC_REACTOR_OVERLAY =
            new OrientedOverlayRenderer("multiblock/cryogenic_reactor");
    public static OrientedOverlayRenderer CVD_UNIT_OVERLAY =
            new OrientedOverlayRenderer("multiblock/cvd_unit");
    public static OrientedOverlayRenderer CHEMICAL_PLANT_OVERLAY =
            new OrientedOverlayRenderer("multiblock/chemical_plant");



    public static IsaMillRenderer ISA_MILL = new IsaMillRenderer();

    public static TextureAtlasSprite HALO;
    public static TextureAtlasSprite HALO_NOISE;

    public static TextureAtlasSprite MASK_INGOT;
    public static TextureAtlasSprite ETERNAL_SINGULARITY;
    public static TextureAtlasSprite COMBINED_SINGULARITY;
    public static TextureAtlasSprite SUPRA_DIMENSION_RESEARCH_DATA_CARD_HALO;


    public static TextureAtlasSprite[] COSMIC;
    public static TextureAtlasSprite COSMIC_0;
    public static TextureAtlasSprite COSMIC_1;
    public static TextureAtlasSprite COSMIC_2;
    public static TextureAtlasSprite COSMIC_3;
    public static TextureAtlasSprite COSMIC_4;
    public static TextureAtlasSprite COSMIC_5;
    public static TextureAtlasSprite COSMIC_6;
    public static TextureAtlasSprite COSMIC_7;
    public static TextureAtlasSprite COSMIC_8;
    public static TextureAtlasSprite COSMIC_9;

    public static TextureAtlasSprite FORCE_FIELD;


    public static TextureAtlasSprite RESEARCH_PIPE_IN;
    public static TextureAtlasSprite RESEARCH_PIPE_SIDE;
    public static TextureAtlasSprite RESEARCH_PIPE_SIDE_OVERLAY;
    public static TextureAtlasSprite RESEARCH_PIPE_SIDE_OVERLAY_ACTIVE;

    public INTTextures() {}

    public static void register(TextureMap textureMap) {

        HALO = textureMap.registerSprite(INTUtils.intId("items/halo"));
        HALO_NOISE = textureMap.registerSprite(INTUtils.intId("items/halo_noise"));

        SUPRA_DIMENSION_RESEARCH_DATA_CARD_HALO = textureMap.registerSprite(INTUtils.intId("items/supra_dimension_research_data_card_halo"));

        MASK_INGOT = textureMap.registerSprite(INTUtils.intId( "items/mask_ingot"));

        ETERNAL_SINGULARITY = textureMap.registerSprite(INTUtils.intId( "items/eternal_singularity_mask"));
        COMBINED_SINGULARITY = textureMap.registerSprite(INTUtils.intId( "items/combined_singularity_mask"));

        COSMIC_0 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_0"));
        COSMIC_1 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_1"));
        COSMIC_2 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_2"));
        COSMIC_3 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_3"));
        COSMIC_4 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_4"));
        COSMIC_5 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_5"));
        COSMIC_6 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_6"));
        COSMIC_7 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_7"));
        COSMIC_8 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_8"));
        COSMIC_9 = textureMap.registerSprite(INTUtils.intId("shader/cosmic_9"));

        FORCE_FIELD = textureMap.registerSprite(INTUtils.intId("blocks/force_field"));

        COSMIC = new TextureAtlasSprite[] {
                COSMIC_0,
                COSMIC_1,
                COSMIC_2,
                COSMIC_3,
                COSMIC_4,
                COSMIC_5,
                COSMIC_6,
                COSMIC_7,
                COSMIC_8,
                COSMIC_9
        };

        //TODO 材质
        RESEARCH_PIPE_IN = textureMap.registerSprite(INTUtils.intId("blocks/pipe/pipe_research_in"));
        RESEARCH_PIPE_SIDE = textureMap.registerSprite(INTUtils.intId("blocks/pipe/pipe_research_side"));
        RESEARCH_PIPE_SIDE_OVERLAY = textureMap.registerSprite(INTUtils.intId("blocks/pipe/pipe_research_side_overlay"));
        RESEARCH_PIPE_SIDE_OVERLAY_ACTIVE = textureMap.registerSprite(INTUtils.intId("blocks/pipe/pipe_research_side_overlay_active"));
    }
    public static void preInit() {TextureUtils.addIconRegister(INTTextures::register);}

}
