package onlysole.imaginarynumbertech.api.unification;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlag;
import onlysole.imaginarynumbertech.api.unification.materials.*;

import java.util.*;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static onlysole.imaginarynumbertech.api.unification.material.info.INTMaterialFlags.*;

public class INTMaterials {


    public static final List<MaterialFlag> GEAR_CLASS = new ArrayList<>();
    public static final List<MaterialFlag> SPRING_CLASS = new ArrayList<>();
    public static final List<MaterialFlag> DENSE_CLASS = new ArrayList<>();
    public static final List<MaterialFlag> CIRCLE_CLASS = new ArrayList<>();

    public static final List<MaterialFlag> ONTEA = new ArrayList<>();
    public static final List<MaterialFlag> NONTM = new ArrayList<>();
    public static final List<MaterialFlag> NOR = new ArrayList<>();
    public static final List<MaterialFlag> DIMENSION = new ArrayList<>();

    public static final List<MaterialFlag> HALALHA_STEEL = new ArrayList<>();

    //EXT2_METAL=生成板,生成杆,生成螺栓螺钉,生成长杆
    static {

        //生成齿轮,生成小齿轮
        GEAR_CLASS.addAll(Arrays.asList(GENERATE_GEAR, GENERATE_SMALL_GEAR));

        //生成弹簧,生成小弹簧
        SPRING_CLASS.addAll(Arrays.asList(GENERATE_SPRING, GENERATE_SPRING_SMALL));

        //生成致密板,生成双重板,生成箔
        DENSE_CLASS.addAll(Arrays.asList(GENERATE_DENSE, GENERATE_DOUBLE_PLATE, GENERATE_FOIL));

        //生成转子,生成滚珠,生成细导线,生成环
        CIRCLE_CLASS.addAll(Arrays.asList(GENERATE_ROTOR, GENERATE_ROUND, GENERATE_FINE_WIRE, GENERATE_RING));

        ONTEA.addAll(EXT2_METAL);
        ONTEA.addAll(SPRING_CLASS);
        ONTEA.addAll(DENSE_CLASS);

        NONTM.addAll(ONTEA);
        //禁用其统一,排除制作方块配方
        NONTM.addAll(Arrays.asList(NO_UNIFICATION, EXCLUDE_BLOCK_CRAFTING_RECIPES));

        //禁用其统一,禁用此材料的分解配方生成
        NOR.addAll(Arrays.asList(NO_UNIFICATION, DISABLE_DECOMPOSITION));

        DIMENSION.addAll(NONTM);
        DIMENSION.addAll(GEAR_CLASS);
        DIMENSION.addAll(CIRCLE_CLASS);
        //生成框架
        DIMENSION.add(GENERATE_FRAME);

        HALALHA_STEEL.addAll(EXT2_METAL);
        HALALHA_STEEL.addAll((Arrays.asList(GENERATE_DENSE, GENERATE_FOIL)));
        HALALHA_STEEL.addAll(GEAR_CLASS);
        HALALHA_STEEL.addAll(CIRCLE_CLASS);
        HALALHA_STEEL.addAll(Arrays.asList(GENERATE_FRAME, EXCLUDE_BLOCK_CRAFTING_RECIPES, NO_UNIFICATION));


    }

    public static void initregister() {

        //24001-25000 虚数
        ImaginaryNumberMaterials.register();

        //25001-26000 合金
        AlloyMaterials.register();

        //26001-27000 流体
        FluidsMaterials.register();

        //27001-28000 粉
        DustMaterials.register();

        //28001-29000 虚空
        VoidMaterials.register();

        //29001-30000 魔法
        MagicMaterials.register();
    }

    //材料

    //#---------虚数---------#


    //#---------合金---------#
    public static Material QuantumAlloy;
    public static Material MARM200Steel;
    public static Material ElectrumFlux;
    public static Material Shirabon;
    public static Material Lumium;
    public static Material Enderium;
    public static Material Signalum;
    public static Material Mithril;
    public static Material AstralTitanium;
    public static Material CelestialTungsten;
    public static Material Rhugnor;
    public static Material Hypogen;
    public static Material DegenerateRhenium;
    public static Material Taranium;
    public static Material Legendarium;

    public static Material PseudoStabilityProtoHalalhaSteel;
    public static Material PseudoStabilityExoHalalhaSteel;





    //#---------粉-----------#
    public static Material DragonDust;
    public static Material CopperSulfatePentahydrate;
    public static Material CopperSulfate;
    public static Material CyanoaceticAcid;
    public static Material SodiumCyanide;



    //#---------虚空---------#
    public static Material Quantium;
    public static Material BlackdWarfMatter;
    public static Material WhitedWarfMatter;
    public static Material Infinity;
    public static Material CosmicNeutronium;
    public static Material Spacetime;
    public static Material Eternity;
    public static Material MagnetohydrodynamicallyConstrainedStarMatter;
    public static Material Universium;
    public static Material TranscendentMetal;
    public static Material CrystalMatrix;
    public static Material Magmatter;
    public static Material Bedrockium;

    public static Material ProtoHalalhaSteel;
    public static Material ExoHalalhaSteel;









    //#---------魔法---------#
    public static Material Draconium;
    public static Material DraconiumAwakened;
    public static Material DraconiumChaotic;
    public static Material Ichorium;
    public static Material IchorLiquid;
    public static Material Orichalcum;
    public static Material Vibranium;
    public static Material Adamantium;
    public static Material VoidMetal;





    //#---------流体---------#
    public static Material MutatedIivingSolder;
    public static Material EthylCyanoacrylateSuperGlue;
    public static Material CyanoacrylatePolymer;
    public static Material EthylCyanoacetate;
    public static Material SolidAcidCatalystMixture;
    public static Material ChloroaceticMixture;
    public static Material TrichloroaceticAcid;
    public static Material DichloroaceticAcid;
    public static Material ChloroaceticAcid;
    public static Material AceticAnhydride;
    public static Material TemporalFluid;
    public static Material SpatialFluid;
    public static Material Rawstarmatter;
    public static Material PrimordialMatter;
    public static Material DimensionallyTranscendentResidue;
    public static Material DimensionallyTranscendentCrudecatalyst;
    public static Material DimensionallyTranscendentProsaiccatalyst;
    public static Material DimensionallyTranscendentResplendentcatalyst;
    public static Material DimensionallyTranscendentExoticcatalyst;
    public static Material DimensionallyTranscendentStellarcatalyst;
    public static Material ExciteddtCC;
    public static Material ExciteddtPC;
    public static Material ExciteddtRC;
    public static Material ExciteddtEC;
    public static Material ExciteddtSC;
    public static Material DragonBreath;
    public static Material ConcentrateDragonBreath;
    public static Material DragonBlood;
    public static Material DragonTear;
    public static Material NitratedDragonDustSolution;
    public static Material ResidualDraconiumSolution;
    public static Material DraconiumSlagSolution;
    public static Material BlazingPyrotheum;
    public static Material GelidCryotheum;
    public static Material PineOil;
    public static Material DegenerateQuarkGluonPlasma;
    public static Material SaturatedPhononicCrystalSolution;
    public static Material LosslessPhononTransferMedium;
    public static Material DimensionallyShiftedSuperfluid;
    public static Material StabilisedBaryonicMatter;
    public static Material SemiStableAntimatter;
    public static Material StargateCrystalSlurry;
    public static Material MoltenProtoHalalhaSteelBase;
    public static Material MoltenExoHalalhaSteelPreparationBase;



    public INTMaterials() {}

}
