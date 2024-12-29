package onlysole.imaginarynumbertech.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.ToolProperty;
import onlysole.imaginarynumbertech.api.unification.INTElements;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.properties.BlastProperty.GasTier.HIGHER;
import static gregtech.api.unification.material.properties.BlastProperty.GasTier.HIGHEST;
import static gregtech.api.util.GTUtility.gregtechId;
import static onlysole.imaginarynumbertech.api.unification.INTMaterials.*;
import static onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialIconSet.*;

public class AlloyMaterials {
    private static int startId = 25001;
    private static final int END_ID = startId + 1000;

    public static void register() {
        QuantumAlloy = new Material.Builder(getMaterialsId(), gregtechId("quantum_alloy"))
                .ingot()
                .fluid()
                .color(0x0F0F0F)
                .iconSet(SHINY)
                .blast(b -> b .temp(10800, HIGHEST).blastStats(VA[UHV], 1600))
                .cableProperties(V[UHV], 24, 0, true)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_FINE_WIRE, NO_UNIFICATION)
                .build();

        MARM200Steel = new Material.Builder(getMaterialsId(), gregtechId("mar_m_200_steel"))
                .ingot()
                .fluid()
                .color(0x515151)
                .iconSet(SHINY)
                .blast(b -> b .temp(5000, HIGHER).blastStats(VA[IV], 200))
                .components(Niobium, 2, Chrome, 9, Aluminium, 5, Titanium, 2, Cobalt, 10, Tungsten, 13, Nickel, 18)
                .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_ROD, GENERATE_FRAME, NO_UNIFICATION)
                .build();

        ElectrumFlux = new Material.Builder(getMaterialsId(), gregtechId("electrum_flux"))
                .iconSet(METALLIC)
                .build()
                .setFormula("(CuAu₄)(AuMa*)(CuAu₄ZnCu₃(Fe₅₀C)₂(NiAuAgCu₃(Fe₅₀C)₃)₄)(Ag₂FeMa)((CuAg₄)(Nq₂KeC)(Sn₉Sb)(CuAg₄BiZnCu₃(Fe₅₀C)₂(NiAuAgCu₃(Fe₅₀C)₃)₄)", true);

        Shirabon = new Material.Builder(getMaterialsId(), gregtechId("shirabon"))
                .ingot(13)
                .liquid(new FluidBuilder().temperature(26000))
                .color(0xBE125C).iconSet(METALLIC)
                .flags(NONTM)
                .element(INTElements.Shir)
                .build();

        Lumium = new Material.Builder(getMaterialsId(), gregtechId("lumium"))
                .build();

        Enderium = new Material.Builder(getMaterialsId(), gregtechId("enderium"))
                .build();

        Signalum = new Material.Builder(getMaterialsId(), gregtechId("signalum"))
                .build();

        Mithril = new Material.Builder(getMaterialsId(), gregtechId("mithril"))
                .ingot()
                .liquid(new FluidBuilder())
                .plasma()
                .color(0x428fdb)
                .iconSet(DULL)
                .blast(b -> b .temp(10900, HIGHEST).blastStats(VA[UHV]))
                .element(INTElements.Mithril)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_FINE_WIRE, NO_UNIFICATION)
                .build();

        AstralTitanium = new Material.Builder(getMaterialsId(), gregtechId("astral_titanium"))
                .ingot(9)
                .liquid(new FluidBuilder().temperature(6900))
                .color(0xE5ABF6).iconSet(METALLIC)
                .flags(NONTM)
                .element(INTElements.AsTi)
                .build();

        CelestialTungsten = new Material.Builder(getMaterialsId(), gregtechId("celestial_tungsten"))
                .ingot(10)
                .liquid(new FluidBuilder().temperature(8700))
                .color(0x303030).iconSet(METALLIC)
                .flags(NONTM)
                .element(INTElements.CeTu)
                .build();

        Rhugnor = new Material.Builder(getMaterialsId(), gregtechId("rhugnor"))
                .fluid()
                .color(0xBE00FF).iconSet(METALLIC)
                .element(INTElements.Rhugnor)
                .build();

        Hypogen = new Material.Builder(getMaterialsId(), gregtechId("hypogen"))
                .ingot()
                .fluid()
                .plasma()
                .element(INTElements.Hypogen)
                .color(0xDC784B)
                .iconSet(CUSTOM_HYPOGEN)
                .toolStats(ToolProperty.Builder.of(20.0F, 200.0F, 2000000, 200).unbreakable().enchantability(33).magnetic().build())
                .flags(GENERATE_PLATE, NO_UNIFICATION)
                .build();

        DegenerateRhenium = new Material.Builder(getMaterialsId(), gregtechId("degenerate_rhenium"))
                .dust()
                .fluid()
                .color(0x6666FF)
                .iconSet(CUSTOM_DEGENERATE_RHENIUM)
                .element(Elements.Rh)
                .flags(GENERATE_PLATE, NO_UNIFICATION)
                .build()
                .setFormula("§cR§de", false);

        Taranium = new Material.Builder(getMaterialsId(), gregtechId("taranium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0x4F404F)
                .iconSet(METALLIC)
                .element(INTElements.Taranium)
                .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, NO_UNIFICATION)
                .build();

        Legendarium = new Material.Builder(getMaterialsId(), gregtechId("legendarium"))
                .ingot()
                .fluid()
                .color(0xF58FDA)
                .iconSet(CUSTOM_LEGENDARIUM)
                //.components(Naquadria, 1, Trinium, 1, Duranium, 1, Tritanium, 1, Orichalcum, 1, Adamantium, 1, Vibranium, 1, Taranium, 1) TODO
                .blast(b -> b .temp(12960, HIGHEST).blastStats(VA[UIV], 5200))
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DOUBLE_PLATE, GENERATE_GEAR, GENERATE_SMALL_GEAR, NO_UNIFICATION)
                .build();




    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
