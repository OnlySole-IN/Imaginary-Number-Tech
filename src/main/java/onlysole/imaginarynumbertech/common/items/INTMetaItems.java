package onlysole.imaginarynumbertech.common.items;

import gregtech.api.items.metaitem.MetaItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import onlysole.imaginarynumbertech.api.items.materialitem.INTMetaPrefixItem;
import onlysole.imaginarynumbertech.api.items.metaitem.INTMetaItem;
import onlysole.imaginarynumbertech.common.CommonProxy;

import java.util.*;

//2024-12-29
public class INTMetaItems {

    public static final List<INTMetaItem<?>> INT_ITEMS = INTMetaItem.getMetaItems();
//    public static final INTMetaItem<?>.MetaValueItem[] SHAPE_MOLDS = new MetaValueItem[13];模具
//    public static final INTMetaItem<?>.MetaValueItem[] SHAPE_EXTRUDERS = new MetaValueItem[27];模头
//    public static final Map<MarkerMaterial, MetaValueItem> GLASS_LENSES = new HashMap<>();玻璃透镜
//    public static final INTMetaItem<?>.MetaValueItem[] DYE_ONLY_ITEMS = new MetaItem.MetaValueItem[EnumDyeColor.values().length];化学染料
//    public static final INTMetaItem<?>.MetaValueItem[] SPRAY_CAN_DYES = new MetaItem.MetaValueItem[EnumDyeColor.values().length];喷漆罐（溶剂）

    public static MetaItem<?>.MetaValueItem NULL;

    //ID0-19
    public static INTMetaItem<?>.MetaValueItem GOOWARE_PROCESSOR;
    public static INTMetaItem<?>.MetaValueItem GOOWARE_ASSEMBLY;
    public static INTMetaItem<?>.MetaValueItem GOOWARE_COMPUTER;
    public static INTMetaItem<?>.MetaValueItem GOOWARE_MAINFRAME;

    public static INTMetaItem<?>.MetaValueItem OPTICAL_PROCESSOR;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_ASSEMBLY;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_COMPUTER;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_MAINFRAME;

    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_PROCESSOR;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_ASSEMBLY;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_COMPUTER;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_MAINFRAME;

    public static INTMetaItem<?>.MetaValueItem COSMIC_PROCESSOR;
    public static INTMetaItem<?>.MetaValueItem COSMIC_ASSEMBLY;
    public static INTMetaItem<?>.MetaValueItem COSMIC_COMPUTER;
    public static INTMetaItem<?>.MetaValueItem COSMIC_MAINFRAME;

    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSOR;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_ASSEMBLY;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_COMPUTER;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_MAINFRAME;

    //ID 20~TODO
    public static INTMetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_BOULE;
    public static INTMetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_WAFER;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_WAFER;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_PLATE;
    public static INTMetaItem<?>.MetaValueItem ENGRAVED_RUBY_CRYSTAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem ENGRAVED_SAPPHIRE_CRYSTAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem ENGRAVED_DIAMOND_CRYSTAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_RUBY;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_DIAMOND;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_SAPPHIRE;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_SYSTEM_ON_CHIP_SOCKET;
    public static INTMetaItem<?>.MetaValueItem GLASS_FIBER;
    public static INTMetaItem<?>.MetaValueItem EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE;
    public static INTMetaItem<?>.MetaValueItem EUROPIUM_DOPED_WAFER;
    public static INTMetaItem<?>.MetaValueItem AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE;
    public static INTMetaItem<?>.MetaValueItem AMERICIUM_DOPED_WAFER;
    public static INTMetaItem<?>.MetaValueItem STATION_MKI;
    public static INTMetaItem<?>.MetaValueItem STATION_MKII;
    public static INTMetaItem<?>.MetaValueItem STATION_MKIII;
    public static INTMetaItem<?>.MetaValueItem STATION_MKIV;
    public static INTMetaItem<?>.MetaValueItem STATION_MKV;

    public static INTMetaItem<?>.MetaValueItem CRYSTAL_ADVANCED_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_OPTICAL_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_SPINTRONIC_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_COSMIC_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem CRYSTAL_OPTICAL_INTERFACE_PLATE;

    public static INTMetaItem<?>.MetaValueItem GRINDBALL_SOAPSTONE;
    public static INTMetaItem<?>.MetaValueItem GRINDBALL_ALUMINIUM;
    public static INTMetaItem<?>.MetaValueItem PINE_CONE;
    public static INTMetaItem<?>.MetaValueItem PINE_FRAGMENT;
    public static INTMetaItem<?>.MetaValueItem BIOLOGY_INTEGRATED_CIRCUIT;
    public static INTMetaItem<?>.MetaValueItem CHROMATIC_LENS;
    public static INTMetaItem<?>.MetaValueItem QCD_PROTECTIVE_PLATING;
    public static INTMetaItem<?>.MetaValueItem COSMIC_FABRIC;

    public static INTMetaItem<?>.MetaValueItem RAW_TESSERACT;
    public static INTMetaItem<?>.MetaValueItem ENERGISED_TESSERACT;
    public static INTMetaItem<?>.MetaValueItem BLACK_BODY_NAQUADRIA_SUPERSOLID;
    public static INTMetaItem<?>.MetaValueItem HYPER_STABLE_SELF_HEALING_ADHESIVE;
    public static INTMetaItem<?>.MetaValueItem SUPERCONDUCTOR_RARE_EARTH_COMPOSITE;
    public static INTMetaItem<?>.MetaValueItem TIMEPIECE;
    public static INTMetaItem<?>.MetaValueItem QUANTUM_ANOMALY;


    //ID 100~TODO
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAX;
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAX;
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAX;
    public static INTMetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAX;
    public static INTMetaItem<?>.MetaValueItem ROBOT_ARM_MAX;
    public static INTMetaItem<?>.MetaValueItem EMITTER_MAX;
    public static INTMetaItem<?>.MetaValueItem SENSOR_MAX;
    public static INTMetaItem<?>.MetaValueItem FIELD_GENERATOR_MAX;

    public static INTMetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAXX;
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAXX;
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAXX;
    public static INTMetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAXX;
    public static INTMetaItem<?>.MetaValueItem ROBOT_ARM_MAXX;
    public static INTMetaItem<?>.MetaValueItem EMITTER_MAXX;
    public static INTMetaItem<?>.MetaValueItem SENSOR_MAXX;
    public static INTMetaItem<?>.MetaValueItem FIELD_GENERATOR_MAXX;

    public static INTMetaItem<?>.MetaValueItem ELECTRIC_MOTOR_EX;
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_PISTON_EX;
    public static INTMetaItem<?>.MetaValueItem ELECTRIC_PUMP_EX;
    public static INTMetaItem<?>.MetaValueItem CONVEYOR_MODULE_EX;
    public static INTMetaItem<?>.MetaValueItem ROBOT_ARM_EX;
    public static INTMetaItem<?>.MetaValueItem EMITTER_EX;
    public static INTMetaItem<?>.MetaValueItem SENSOR_EX;
    public static INTMetaItem<?>.MetaValueItem FIELD_GENERATOR_EX;

    //
    public static INTMetaItem<?>.MetaValueItem BIOCELLS;
    public static INTMetaItem<?>.MetaValueItem LIVING_BIO_WAFER;
    public static INTMetaItem<?>.MetaValueItem LIVING_BIO_CHIP;


    //
    public static INTMetaItem<?>.MetaValueItem NUCLEAR_STAR;
    public static INTMetaItem<?>.MetaValueItem LIVING_CRYSTAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem PROTONATED_FULLERENE_SIEVING_MATRIX;
    public static INTMetaItem<?>.MetaValueItem SATURATED_FULLERENE_SIEVING_MATRIX;
    public static INTMetaItem<?>.MetaValueItem UNSTABLE_STAR;


    //ID140~TODO
    public static INTMetaItem<?>.MetaValueItem OPTICALLY_ENRICHED_CRYSTALLINE_BOULE;
    public static INTMetaItem<?>.MetaValueItem PHOTONICALLY_PREPARED_WAFER;
    public static INTMetaItem<?>.MetaValueItem PHOTONICALLY_ENHANCED_WAFER;
    public static INTMetaItem<?>.MetaValueItem RAW_EXPOSED_OPTICAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem OPTICALLY_COMPATIBLE_MEMORY;
    public static INTMetaItem<?>.MetaValueItem OPTICALLY_PERFECTED_CPU;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_CPU_CONTAINMENT_HOUSING;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_CIRCUIT_BOARD;

    public static INTMetaItem<?>.MetaValueItem OPTICAL_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_DIODE;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_INDUCTOR;


    //ID 180~199 TODO
    public static INTMetaItem<?>.MetaValueItem BZ_REACTION_CHAMBER;
    public static INTMetaItem<?>.MetaValueItem NONLINEAR_CHEMICAL_OSCILLATOR;
    public static INTMetaItem<?>.MetaValueItem PETRI_DISH_STERILE;
    public static INTMetaItem<?>.MetaValueItem PETRI_DISH_FERTILE;
    //  Algae
    public static INTMetaItem<?>.MetaValueItem BARNARDA_C_BASE;
    public static INTMetaItem<?>.MetaValueItem BARNARDA_C_CHLORELLA;
    public static INTMetaItem<?>.MetaValueItem BARNARDA_C_BRYOPSIS_HYPNOIDES;
    public static INTMetaItem<?>.MetaValueItem BARNARDA_C_ZOOXANTHELLAE;
    public static INTMetaItem<?>.MetaValueItem TAU_CETI_F_BASE;
    public static INTMetaItem<?>.MetaValueItem TAU_CETI_F_SCENEDESMUS_OBLIQUUS;
    public static INTMetaItem<?>.MetaValueItem TAU_CETI_F_PHAEOPHYTA;
    public static INTMetaItem<?>.MetaValueItem TAU_CETI_F_SPIRULINA;
    public static INTMetaItem<?>.MetaValueItem PROXIMA_B_BASE;
    public static INTMetaItem<?>.MetaValueItem PROXIMA_B_CONCHOSPORE;
    public static INTMetaItem<?>.MetaValueItem PROXIMA_B_POLYSIPHONIA_SENTICULOSA;
    public static INTMetaItem<?>.MetaValueItem PROXIMA_B_SPIROGYRA;
    //
    public static INTMetaItem<?>.MetaValueItem BIO_DISH_PETRI_DISH_STERILE;
    public static INTMetaItem<?>.MetaValueItem BIO_DISH_PETRI_DISH_FERTILE;


    //ID 200~TODO
    public static INTMetaItem<?>.MetaValueItem OPTICAL_FIBER;
    public static INTMetaItem<?>.MetaValueItem DIELECTRIC_MIRROR;
    public static INTMetaItem<?>.MetaValueItem EMPTY_LASER_ASSEMBLY;
    public static INTMetaItem<?>.MetaValueItem HELIUM_NEON_LASER;
    public static INTMetaItem<?>.MetaValueItem ND_YAG_LASER;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_LASER_CONTROL_UNIT;
    //
    public static INTMetaItem<?>.MetaValueItem TOPOLOGICAL_INSULATOR_TUBE;
    public static INTMetaItem<?>.MetaValueItem BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT;
    public static INTMetaItem<?>.MetaValueItem BOSE_EINSTEIN_CONDENSATE;
    public static INTMetaItem<?>.MetaValueItem ESR_COMPUTATION_UNIT;
    //
    public static INTMetaItem<?>.MetaValueItem EIGENFOLDED_KERR_MANIFOLD;
    public static INTMetaItem<?>.MetaValueItem HYPERDIMENSIONAL_DRONE;
    //  High Energy Physics Items
    public static INTMetaItem<?>.MetaValueItem PLASMA_CONTAINMENT_CELL;
    public static INTMetaItem<?>.MetaValueItem RHENIUM_PLASMA_CONTAINMENT_CELL;
    public static INTMetaItem<?>.MetaValueItem NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static INTMetaItem<?>.MetaValueItem EXTREMELY_DURABLE_PLASMA_CONTAINMENT_CELL;
    public static INTMetaItem<?>.MetaValueItem DENSE_NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static INTMetaItem<?>.MetaValueItem COSMIC_NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static INTMetaItem<?>.MetaValueItem TIME_DILATION_CONTAINMENT_UNIT;
    public static INTMetaItem<?>.MetaValueItem CONTAINED_RN_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem CONTAINED_KN_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem CONTAINED_KERR_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem CONTAINED_HIGH_DENSITY_PROTONIC_MATTER;
    public static INTMetaItem<?>.MetaValueItem CONTAINED_EXOTIC_MATTER;
    public static INTMetaItem<?>.MetaValueItem CHARGED_TRIPLET_NEUTRONIUM_SPHERE;
    public static INTMetaItem<?>.MetaValueItem COSMIC_FABRIC_PLASMA_CONTAINMENT_CELL;


    //ID240~256
    // .addComponents(new HaloRenderItemBehavior(10, 0xFF000000, () -> ITTextures.HALO, false));
    //singularity
    public static INTMetaItem<?>.MetaValueItem ETERNAL_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem GASTRONOMIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem GALACTIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem NATURAL_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem MAGICAL_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem FANTASTIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem CHEMICAL_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem THERMIONIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem PROTONIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem PLATONIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem CUBIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem ASTRONOMIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem TERRIFIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem INTRINSIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem QUADRATIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem COSMIC_SINGULARITY;
    public static INTMetaItem<?>.MetaValueItem IMPOSSIBLE_SINGULARITY;


    //ID257~TODO

    //ID300~TODO
    public static INTMetaItem<?>.MetaValueItem GOOWARE_BOARD;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_BOARD;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_BOARD;
    public static INTMetaItem<?>.MetaValueItem GOOWARE_CIRCUIT;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_CIRCUIT;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_CIRCUIT;


    //ID 351~TODO
    //  Biological
    public static INTMetaItem<?>.MetaValueItem ELECTROCHEMICAL_GRADIENT_RECORDER;
    public static INTMetaItem<?>.MetaValueItem ULTRA_MICRO_PHASE_SEPARATOR;
    public static INTMetaItem<?>.MetaValueItem QUANTUM_TUNNELING_MICROTUBULE;
    public static INTMetaItem<?>.MetaValueItem HYPERRIBOSOME;
    public static INTMetaItem<?>.MetaValueItem NEUTRON_ABSORBING_PROTEIN;
    public static INTMetaItem<?>.MetaValueItem SUPEREXCITED_CONDUCTIVE_POLYMER;
    public static INTMetaItem<?>.MetaValueItem DNA_ENCODER;
    public static INTMetaItem<?>.MetaValueItem DNA_DECODER;
    public static INTMetaItem<?>.MetaValueItem DNA_DECODE_ENCODER;

    public static INTMetaItem<?>.MetaValueItem ORDINARY_ALGAE;
    public static INTMetaItem<?>.MetaValueItem RED_ALGA;
    public static INTMetaItem<?>.MetaValueItem GREEN_ALGA;
    public static INTMetaItem<?>.MetaValueItem CHRYSOPHYCEAE;
    public static INTMetaItem<?>.MetaValueItem BROWN_ALGA;


    //ID400~TODO
    public static INTMetaItem<?>.MetaValueItem BIO_PROCESSING_UNIT;
    public static INTMetaItem<?>.MetaValueItem ADVANCED_PROCESSOR_BOARD;
    public static INTMetaItem<?>.MetaValueItem ADVANCED_BOARD;
    public static INTMetaItem<?>.MetaValueItem QUANTUM_PROCESSOR_BOARD;
    public static INTMetaItem<?>.MetaValueItem QUANTUM_BOARD;
    public static INTMetaItem<?>.MetaValueItem NANO_PROCESSOR_BOARD;
    public static INTMetaItem<?>.MetaValueItem NANO_BOARD;
    public static INTMetaItem<?>.MetaValueItem EXOTIC_BOARD;
    public static INTMetaItem<?>.MetaValueItem EXOTIC_PROCESSOR_BOARD;


    //ID 425~TODO
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_DIODE;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_INDUCTOR;

    public static INTMetaItem<?>.MetaValueItem COSMIC_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem COSMIC_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem COSMIC_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem COSMIC_DIODE;
    public static INTMetaItem<?>.MetaValueItem COSMIC_INDUCTOR;

    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_DIODE;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_INDUCTOR;


    //ID500~TODO
    //  Cosmic Components
    public static INTMetaItem<?>.MetaValueItem COSMIC_INFORMATION_MODULE;
    public static INTMetaItem<?>.MetaValueItem HOLOGRAPHIC_INFORMATION_IMC;
    public static INTMetaItem<?>.MetaValueItem CLADDED_OPTICAL_FIBER_CORE;
    public static INTMetaItem<?>.MetaValueItem CLOSED_TIMELIKE_CURVE_COMPUTATIONAL_UNIT;
    public static INTMetaItem<?>.MetaValueItem CLOSED_TIMELIKE_CURVE_GUIDANCE_UNIT;


    //  Supracausal Components
    public static INTMetaItem<?>.MetaValueItem SPACETIME_CONDENSER;
    public static INTMetaItem<?>.MetaValueItem LIGHT_CONE_MODULE;
    public static INTMetaItem<?>.MetaValueItem EXCITATION_MAINTAINER;


    //ID1200~TODO
    //Wrap Circuit
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_ULV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_LV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_MV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_HV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_EV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_IV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_LUV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_ZPM;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_UV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_UHV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_UEV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_UIV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_UXV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_OPV;
    public static INTMetaItem<?>.MetaValueItem WRAP_CIRCUIT_MAX;

    //Wrap
    public static INTMetaItem<?>.MetaValueItem WRAP_COATED_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_PHENOLIC_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_PLASTIC_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_EPOXY_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_FIBER_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_MULTILAYER_FIBER_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_WETWARE_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_BASIC_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_GOOD_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_PLASTIC_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_EXTREME_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_ELITE_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_WETWARE_CIRCUIT_BOARD;

    public static INTMetaItem<?>.MetaValueItem WRAP_SMD_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SMD_DIODE;
    public static INTMetaItem<?>.MetaValueItem WRAP_SMD_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SMD_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SMD_INDUCTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_DIODE;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_INDUCTOR;

    public static INTMetaItem<?>.MetaValueItem WRAP_NEURO_PROCESSOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_STEM_CELLS;
    public static INTMetaItem<?>.MetaValueItem WRAP_ENGRAVED_LAPOTRON_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_ENGRAVED_CRYSTAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_CRYSTAL_CENTRAL_PROCESSING_UNIT;

    public static INTMetaItem<?>.MetaValueItem WRAP_CENTRAL_PROCESSING_UNIT;
    public static INTMetaItem<?>.MetaValueItem WRAP_RANDOM_ACCESS_MEMORY;
    public static INTMetaItem<?>.MetaValueItem WRAP_INTEGRATED_LOGIC_CIRCUIT;
    public static INTMetaItem<?>.MetaValueItem WRAP_NANO_CENTRAL_PROCESSING_UNIT;
    public static INTMetaItem<?>.MetaValueItem WRAP_QUBIT_CENTRAL_PROCESSING_UNIT;
    public static INTMetaItem<?>.MetaValueItem WRAP_SIMPLE_SYSTEM_ON_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_SYSTEM_ON_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_ADVANCED_SYSTEM_ON_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_HIGHLY_ADVANCED_SOC;
    public static INTMetaItem<?>.MetaValueItem WRAP_NAND_MEMORY_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_NOR_MEMORY_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_ULTRA_LOW_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_LOW_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_HIGH_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_ULTRA_HIGH_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_NANO_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_PICO_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_FEMTO_PIC;

    public static INTMetaItem<?>.MetaValueItem WRAP_RAW_EXPOSED_OPTICAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICALLY_COMPATIBLE_MEMORY;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICALLY_PERFECTED_CPU;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_CPU_CONTAINMENT_HOUSING;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_CIRCUIT_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_DIODE;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_INDUCTOR;

    public static INTMetaItem<?>.MetaValueItem WRAP_LIVING_CRYSTAL_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_LIVING_BIO_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_BIOCELLS;
    public static INTMetaItem<?>.MetaValueItem WRAP_GOOWARE_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_GOOWARE_CIRCUIT;

    public static INTMetaItem<?>.MetaValueItem WRAP_CRYSTAL_SYSTEM_ON_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_CRYSTAL_ADVANCED_RAW_CHIP;

    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_DIODE;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_INDUCTOR;

    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_INFORMATION_MODULE;
    public static INTMetaItem<?>.MetaValueItem WRAP_HOLOGRAPHIC_INFORMATION_IMC;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPACETIME_CONDENSER;
    public static INTMetaItem<?>.MetaValueItem WRAP_LIGHT_CONE_MODULE;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_DIODE;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_INDUCTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_TRANSISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_RESISTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_CAPACITOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_DIODE;
    public static INTMetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_INDUCTOR;
    public static INTMetaItem<?>.MetaValueItem WRAP_ATTO_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_ZEPTO_PIC;
    public static INTMetaItem<?>.MetaValueItem WRAP_UHASOC_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_PHASE_CHANGE_MEMORY;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_NOR_MEMORY_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPIN_TRANSFER_TORQUE_MEMORY;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_NAND_MEMORY_CHIP;

    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_BOARD;
    public static INTMetaItem<?>.MetaValueItem WRAP_OPTICAL_CIRCUIT;
    public static INTMetaItem<?>.MetaValueItem WRAP_SPINTRONIC_CIRCUIT;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_CPU_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_COSMIC_MEMORY_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_CRYSTAL_OPTICAL_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_CRYSTAL_SPINTRONIC_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_CRYSTAL_COSMIC_RAW_CHIP;
    public static INTMetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_MEMORY_CHIP;


    //ID1400~TODO
    // PIC
    public static INTMetaItem<?>.MetaValueItem NANO_PIC_WAFER;
    public static INTMetaItem<?>.MetaValueItem PICO_PIC_WAFER;
    public static INTMetaItem<?>.MetaValueItem FEMTO_PIC_WAFER;
    public static INTMetaItem<?>.MetaValueItem NANO_PIC;
    public static INTMetaItem<?>.MetaValueItem PICO_PIC;
    public static INTMetaItem<?>.MetaValueItem FEMTO_PIC;
    public static INTMetaItem<?>.MetaValueItem ATTO_PIC_WAFER;
    public static INTMetaItem<?>.MetaValueItem ATTO_PIC;
    public static INTMetaItem<?>.MetaValueItem ZEPTO_PIC_WAFER;
    public static INTMetaItem<?>.MetaValueItem ZEPTO_PIC;
    public static INTMetaItem<?>.MetaValueItem UHASOC_WAFER;
    public static INTMetaItem<?>.MetaValueItem UHASOC_CHIP;

    public static INTMetaItem<?>.MetaValueItem PHASE_CHANGE_MEMORY;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_NOR_MEMORY_CHIP;
    public static INTMetaItem<?>.MetaValueItem SPIN_TRANSFER_TORQUE_MEMORY;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_NAND_MEMORY_CHIP;

    public static INTMetaItem<?>.MetaValueItem UNTREATED_COSMIC_CPU;
    public static INTMetaItem<?>.MetaValueItem COSMIC_CPU;
    public static INTMetaItem<?>.MetaValueItem COSMIC_CPU_CHIP;
    public static INTMetaItem<?>.MetaValueItem COSMIC_MEMORY_CHIP;
    public static INTMetaItem<?>.MetaValueItem SUPRACAUSAL_MEMORY_CHIP;


    //ID2000~TODO
    public static INTMetaItem<?>.MetaValueItem PROSPECTOR_ZPM;
    public static INTMetaItem<?>.MetaValueItem PROSPECTOR_UV;
    public static INTMetaItem<?>.MetaValueItem PROSPECTOR_UIV;


    //ID2400~TODO
    public static INTMetaItem<?>.MetaValueItem RESEARCH_DATA_CARD;
    public static INTMetaItem<?>.MetaValueItem COSMIC_RESEARCH_DATA_CARD;
    public static INTMetaItem<?>.MetaValueItem GOOWARE_RESEARCH_DATA_CARD;
    public static INTMetaItem<?>.MetaValueItem OPTICAL_RESEARCH_DATA_CARD;
    public static INTMetaItem<?>.MetaValueItem SPINTRONIC_RESEARCH_DATA_CARD ;
    public static INTMetaItem<?>.MetaValueItem SUPRA_CAUSAL_RESEARCH_DATA_CARD;
    public static INTMetaItem<?>.MetaValueItem SUPRA_CHRONAL_RESEARCH_DATA_CARD;
    public static INTMetaItem<?>.MetaValueItem SUPRA_DIMENSION_RESEARCH_DATA_CARD;

    public static INTMetaItem<?>.MetaValueItem DEBUG_STRUCTURE_WRITER;
    public static INTMetaItem<?>.MetaValueItem DEBUG_STRUCTURE_BUILDER;

    public static void init() {
        INTMetaItem1 first = new INTMetaItem1();
        first.setRegistryName("meta_item_int");
        first.setCreativeTabs(CommonProxy.IMAGINARY_TAB);
        INTMetaItem2 intfirst = new INTMetaItem2();
        intfirst.setRegistryName("int_meta_item");
        //intfirst.setCreativeTabs(CommonProxy.IMAGINARY_TAB);
//        for (OrePrefix prefix : orePrefixes) {
//            for (MaterialRegistry registry : GregTechAPI.materialManager.getRegistries()) {
//                String regName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, prefix.name());
//                MetaPrefixItem metaOrePrefix = new MetaPrefixItem(registry, prefix);
//                metaOrePrefix.setRegistryName(registry.getModid(), String.format("meta_%s", regName));
//            }
//        }
    }


    public static void registerOreDict() {
        for (INTMetaItem<?> item : INT_ITEMS) {
            if (item instanceof INTMetaPrefixItem) {
                ((INTMetaPrefixItem) item).registerOreDict();
            }
        }
     /**    玻璃透镜
        for (Map.Entry<MarkerMaterial, INTMetaItem.MetaValueItem> entry : GLASS_LENSES.entrySet()) {
            // Register "craftingLensWhite" for example
            OreDictUnifier.registerOre(entry.getValue().getStackForm(), OrePrefix.craftingLens, entry.getKey());
            // Register "craftingLensGlass", intended only for recipes to dye lenses and not in the Engraver
            OreDictUnifier.registerOre(entry.getValue().getStackForm(),
                    String.format("%s%s", OrePrefix.craftingLens.name(), "Glass"));
        }*/
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        MinecraftForge.EVENT_BUS.register(INTMetaItems.class);
        for (INTMetaItem<?> item : INT_ITEMS) {
            item.registerModels();
            item.registerTextureMesh();
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerColors() {
        for (INTMetaItem<?> item : INT_ITEMS) {
            item.registerColor();
        }
    }

//    @SubscribeEvent 伪装板
//    @SideOnly(Side.CLIENT)
//    public static void registerBakedModels(ModelBakeEvent event) {
//        INTLog.logger.info("Registering special item models");
//        registerSpecialItemModel(event, COVER_FACADE, new FacadeRenderer());
//    }
//
//    @SideOnly(Side.CLIENT)
//    @SuppressWarnings({ "unchecked", "rawtypes" })
//    private static void registerSpecialItemModel(ModelBakeEvent event, INTMetaItem.MetaValueItem metaValueItem,
//                                                 IBakedModel bakedModel) {
//        // noinspection RedundantCast
//        ResourceLocation modelPath = ((MetaItem) metaValueItem.getMetaItem()).createItemModelPath(metaValueItem, "");
//        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(modelPath, "inventory");
//        event.getModelRegistry().putObject(modelResourceLocation, bakedModel);
//    }

//    private static final List<OrePrefix> orePrefixes = new ArrayList<>();
//
//    static {}
//
//    @SuppressWarnings("unused")
//    public static void addOrePrefix(OrePrefix... prefixes) {
//        orePrefixes.addAll(Arrays.asList(prefixes));
//    }
}
