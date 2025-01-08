package onlysole.imaginarynumbertech.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import net.minecraft.client.resources.I18n;
import onlysole.imaginarynumbertech.api.unification.INTElements;

import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.properties.BlastProperty.GasTier.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static onlysole.imaginarynumbertech.api.unification.INTMaterials.*;
import static onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialFlags.*;
import static onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialIconSet.*;

//24000-25000
public class VoidMaterials {
    private static int startId = 28001;
    private static final int END_ID = startId + 1000;

    public static void register() { //TODO
        Quantium = new Material.Builder(getMaterialsId(), gregtechId("quantium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0x0F0F0F)
                .iconSet(SHINY)
                .element(INTElements.Quantium)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_FINE_WIRE, NO_UNIFICATION)
                .build();

        BlackdWarfMatter = new Material.Builder(getMaterialsId(),gregtechId("blackd_warf_matter"))
                .ingot(11)
                .liquid(new FluidBuilder()
                )
                .color(0x000000).iconSet(METALLIC)
                .flags(NONTM, GENERATE_NANITES)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
                .build();

        WhitedWarfMatter = new Material.Builder(getMaterialsId(), gregtechId("whited_warf_matter"))
                .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
                .iconSet(CUSTOM_WWM)
                .flags(DIMENSION, GENERATE_NANITES)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
                .build();

        Infinity = new Material.Builder(getMaterialsId(), gregtechId("infinity"))
                .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
                .iconSet(CUSTOM_INFINITY)
                .flags(DIMENSION)
                .element(INTElements.If)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
                .build();

        CosmicNeutronium = new Material.Builder(getMaterialsId(), gregtechId("cosmic_neutronium"))
                .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
                .element(INTElements.CoNe)
                .color(0x323232)
                .iconSet(CUSTOM_CN)
                .flags(DIMENSION, NO_CASING_SMALL, NO_PLATE_SUPERDENSE)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
                .build();

        Spacetime = new Material.Builder(getMaterialsId(), gregtechId("spacetime"))
                .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
                .iconSet(CUSTOM_SPACETIME)
                .flags(DIMENSION)
                .element(INTElements.SpTi)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
                .build();

        Eternity = new Material.Builder(getMaterialsId(), gregtechId("eternity"))
                .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
                .iconSet(CUSTOM_ETERNITY)
                .flags(DIMENSION, GENERATE_NANITES)
                .element(INTElements.Et)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
                .build();

        MagnetohydrodynamicallyConstrainedStarMatter = new Material.Builder(getMaterialsId(), gregtechId("magneto_hydrodynamically_constrained_star_matter"))
                .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
                .iconSet(CUSTOM_MHCSM)
                .flags(NONTM, GENERATE_FRAME, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_RING)
                .element(INTElements.MaCoStMa)
                .blast(b -> b .temp(120000, HIGH))
                .build();

        Universium = new Material.Builder(getMaterialsId(), gregtechId("universium"))
                .ingot().fluid()
                .color(0x25324D)
                .element(INTElements.Un)
                .iconSet(CUSTOM_UNIVERSIUM)
                .flags(DIMENSION, GENERATE_NANITES)
                .build()
                .setFormula(I18n.format("gregtech.material.universium.tooltip"), true);


        TranscendentMetal = new Material.Builder(getMaterialsId(), gregtechId("transcendent_metal"))
                .fluid()
                .iconSet(METALLIC)
                .build();

        CrystalMatrix = new Material.Builder(getMaterialsId(), gregtechId("crystal_matrix"))
                .ingot()
                .liquid(new FluidBuilder()
                        .temperature(6604)
                )
                .color(0x70ecff)
                .iconSet(BRIGHT)
                .flags(NO_UNIFICATION)
                .element(INTElements.CrystalMatrix)
                .build();

        Magmatter = new Material.Builder(getMaterialsId(), gregtechId("magmatter"))
               .ingot()
                .liquid(new FluidBuilder()
                        .customStill()
                )
               .iconSet(MAGMATTER)
               .flags(DIMENSION, GENERATE_NANITES)
               .element(INTElements.Magmatter)
                .blast(b -> b
                        .temp(120000, HIGH)
                )
               .build();

        Bedrockium = new Material.Builder(getMaterialsId(), gregtechId("bedrockium"))
               .ingot()
                .plasma(new FluidBuilder()
                        .customStill()
                )
               .liquid(new FluidBuilder()
                       .customStill()
                )
               .iconSet(BEDROCKIUM)
               .flags(DIMENSION)
               .build();

        ProtoHalalhaSteel = new Material.Builder(getMaterialsId(), gregtechId("proto_halalha_steel"))
              .ingot()
              .iconSet(CUSTOM_PROTO_HALALHA_STEEL)
              .flags(HALALHA_STEEL)
              .build();


        ExoHalalhaSteel = new Material.Builder(getMaterialsId(), gregtechId("exo_halalha_steel"))
             .ingot()
             .iconSet(CUSTOM_EXO_HALALHA_STEEL)
             .flags(EXO_HALALHA_STEEL, GENERATE_LENS)
             .build();






    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
