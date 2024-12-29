package onlysole.imaginarynumbertech.api.unification.materials;

import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.Material;
import onlysole.imaginarynumbertech.api.unification.INTElements;

import static onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialIconSet.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.properties.BlastProperty.GasTier.*;
import static gregtech.api.util.GTUtility.gregtechId;
import static onlysole.imaginarynumbertech.api.unification.INTMaterials.*;

public class MagicMaterials {
    private static int startId = 29001;
    private static final int END_ID = startId + 1000;
    public static void register() {
        Draconium = new Material.Builder(getMaterialsId(),gregtechId("draconium"))
                .ingot(8)
                .liquid(new FluidBuilder())
                .color(0x6200e7).iconSet(METALLIC)
                .flags(NONTM)
                .element(INTElements.Draconium)
                .blast(b -> b .temp(7250, HIGH))
                .build();

        DraconiumAwakened = new Material.Builder(getMaterialsId(),gregtechId("draconium_awakened"))
                .ingot(9)
                .liquid(new FluidBuilder())
                .color(0xFFA157).iconSet(METALLIC)
                .flags(NONTM)
                .element(INTElements.AwakenedDraconium)
                .blast(b -> b .temp(8460, HIGH))
                .build();

        DraconiumChaotic = new Material.Builder(getMaterialsId(),gregtechId("draconium_chaotic"))
                .ingot(10)
                .liquid(new FluidBuilder())
                .color(0x2C195A).iconSet(METALLIC)
                .flags(NONTM)
                .element(INTElements.ChaoticDraconium)
                .blast(b -> b .temp(9430, HIGH))
                .build();

        Ichorium = new Material.Builder(getMaterialsId(), gregtechId("ichorium"))
                .ingot()
                .liquid(new FluidBuilder().temperature(10800))
                .color(0xE5A559)
                .iconSet(BRIGHT)
                .blast(b -> b .temp(10800, HIGHEST).blastStats(VA[UV]))
                .element(INTElements.Ichorium)
                .flags(GENERATE_PLATE, NO_UNIFICATION)
                .build();

        IchorLiquid = new Material.Builder(getMaterialsId(), gregtechId("ichor_liquid"))
                .liquid(new FluidBuilder().temperature(214748))
                .plasma()
                .color(0xE5A559)
                .element(INTElements.IchorLiquid)
                .flags(NO_UNIFICATION)
                .build();

        Orichalcum = new Material.Builder(getMaterialsId(), gregtechId("orichalcum"))
                .ingot()
                .fluid()
                .color(0x72A0C1)
                .iconSet(METALLIC)
                .element(INTElements.Orichalcum)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, NO_UNIFICATION)
                .blast(b -> b .temp(9000, HIGH))
                .build();

        Vibranium = new Material.Builder(getMaterialsId(), gregtechId("vibranium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0xC880FF)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_FRAME, NO_UNIFICATION)
                .element(INTElements.Vibranium)
                .blast(b -> b .temp(4852, HIGH))
                .build();

        Adamantium = new Material.Builder(getMaterialsId(), gregtechId("adamantium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0xFF0040)
                .iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_SPRING, GENERATE_DOUBLE_PLATE, NO_UNIFICATION)
                .element(INTElements.Adamantium)
                .blast(b -> b .temp(5225, HIGH))
                .cableProperties(VA[UHV], 18, 9, false)
                .build();

        VoidMetal = new Material.Builder(getMaterialsId(), gregtechId("void_metal"))
                .ingot()
                .liquid(new FluidBuilder().temperature(440))
                .color(0x20142C)
                .iconSet(DULL)
                .element(INTElements.VoidMetal)
                .flags(NO_UNIFICATION)
                .build();








    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
