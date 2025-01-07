package onlysole.imaginarynumbertech.common.items;

import gregtech.api.items.metaitem.MetaItem;
import onlysole.imaginarynumbertech.common.CommonProxy;

//2024-12-29
public class INTMetaItems {

//    public static final List<INTMetaItem<?>> INT_ITEMS = INTMetaItem.getMetaItems();
//    public static final MetaItem<?>.MetaValueItem[] SHAPE_MOLDS = new MetaValueItem[13];模具
//    public static final MetaItem<?>.MetaValueItem[] SHAPE_EXTRUDERS = new MetaValueItem[27];模头
//    public static final Map<MarkerMaterial, MetaValueItem> GLASS_LENSES = new HashMap<>();玻璃透镜
//    public static final MetaItem<?>.MetaValueItem[] DYE_ONLY_ITEMS = new MetaItem.MetaValueItem[EnumDyeColor.values().length];化学染料
//    public static final MetaItem<?>.MetaValueItem[] SPRAY_CAN_DYES = new MetaItem.MetaValueItem[EnumDyeColor.values().length];喷漆罐（溶剂）

    public static MetaItem<?>.MetaValueItem NULL;

    //ID0-19
    public static MetaItem<?>.MetaValueItem GOOWARE_PROCESSOR;
    public static MetaItem<?>.MetaValueItem GOOWARE_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem GOOWARE_COMPUTER;
    public static MetaItem<?>.MetaValueItem GOOWARE_MAINFRAME;

    public static MetaItem<?>.MetaValueItem OPTICAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem OPTICAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem OPTICAL_MAINFRAME;

    public static MetaItem<?>.MetaValueItem SPINTRONIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_MAINFRAME;

    public static MetaItem<?>.MetaValueItem COSMIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem COSMIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem COSMIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem COSMIC_MAINFRAME;

    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_MAINFRAME;

    //ID 20~TODO
    public static MetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_BOULE;
    public static MetaItem<?>.MetaValueItem EU_DOPED_CUBIC_ZIRCONIA_WAFER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_WAFER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_INTERFACE_PLATE;
    public static MetaItem<?>.MetaValueItem ENGRAVED_RUBY_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_SAPPHIRE_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem ENGRAVED_DIAMOND_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_RUBY;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_DIAMOND;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MODULATOR_SAPPHIRE;
    public static MetaItem<?>.MetaValueItem CRYSTAL_SYSTEM_ON_CHIP_SOCKET;
    public static MetaItem<?>.MetaValueItem GLASS_FIBER;
    public static MetaItem<?>.MetaValueItem EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE;
    public static MetaItem<?>.MetaValueItem EUROPIUM_DOPED_WAFER;
    public static MetaItem<?>.MetaValueItem AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE;
    public static MetaItem<?>.MetaValueItem AMERICIUM_DOPED_WAFER;
    public static MetaItem<?>.MetaValueItem STATION_MKI;
    public static MetaItem<?>.MetaValueItem STATION_MKII;
    public static MetaItem<?>.MetaValueItem STATION_MKIII;
    public static MetaItem<?>.MetaValueItem STATION_MKIV;
    public static MetaItem<?>.MetaValueItem STATION_MKV;

    public static MetaItem<?>.MetaValueItem CRYSTAL_ADVANCED_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_OPTICAL_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_SPINTRONIC_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_COSMIC_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_OPTICAL_INTERFACE_PLATE;

    public static MetaItem<?>.MetaValueItem GRINDBALL_SOAPSTONE;
    public static MetaItem<?>.MetaValueItem GRINDBALL_ALUMINIUM;
    public static MetaItem<?>.MetaValueItem PINE_CONE;
    public static MetaItem<?>.MetaValueItem PINE_FRAGMENT;
    public static MetaItem<?>.MetaValueItem BIOLOGY_INTEGRATED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem CHROMATIC_LENS;
    public static MetaItem<?>.MetaValueItem QCD_PROTECTIVE_PLATING;
    public static MetaItem<?>.MetaValueItem COSMIC_FABRIC;

    public static MetaItem<?>.MetaValueItem RAW_TESSERACT;
    public static MetaItem<?>.MetaValueItem ENERGISED_TESSERACT;
    public static MetaItem<?>.MetaValueItem BLACK_BODY_NAQUADRIA_SUPERSOLID;
    public static MetaItem<?>.MetaValueItem HYPER_STABLE_SELF_HEALING_ADHESIVE;
    public static MetaItem<?>.MetaValueItem SUPERCONDUCTOR_RARE_EARTH_COMPOSITE;
    public static MetaItem<?>.MetaValueItem TIMEPIECE;
    public static MetaItem<?>.MetaValueItem QUANTUM_ANOMALY;
    public static MetaItem<?>.MetaValueItem GRAVITON_SHARD;
    public static MetaItem<?>.MetaValueItem BLACK_HOLE_PSEUDO_STABILITY_SEED;
    public static MetaItem<?>.MetaValueItem BLACK_HOLE_PSEUDO_STABILITY_COLLAPSER;
    public static MetaItem<?>.MetaValueItem TRANSDIMENSIONAL_ALIGNMENT_MATRIX;
    public static MetaItem<?>.MetaValueItem RELATIVISTIC_HEAT_CAPACITOR;
    public static MetaItem<?>.MetaValueItem PHONONIC_SEED_CRYSTAL;
    public static MetaItem<?>.MetaValueItem THERMAL_SUPERCONDUCTOR;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_EMPTY_HOUSING;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_UP;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_DOW;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_STRANGE;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_CHARM;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_BOTTOM;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_TOP;
    public static MetaItem<?>.MetaValueItem QUARK_RELEASING_CATALYST_UNALIGNED;
    public static MetaItem<?>.MetaValueItem ASTRAL_ARRAY;


    //ID 100~TODO
    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAX;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAX;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_MAX;
    public static MetaItem<?>.MetaValueItem EMITTER_MAX;
    public static MetaItem<?>.MetaValueItem SENSOR_MAX;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_MAX;

    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAXX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAXX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAXX;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAXX;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_MAXX;
    public static MetaItem<?>.MetaValueItem EMITTER_MAXX;
    public static MetaItem<?>.MetaValueItem SENSOR_MAXX;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_MAXX;

    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_EX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_EX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_EX;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_EX;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_EX;
    public static MetaItem<?>.MetaValueItem EMITTER_EX;
    public static MetaItem<?>.MetaValueItem SENSOR_EX;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_EX;

    //
    public static MetaItem<?>.MetaValueItem BIOCELLS;
    public static MetaItem<?>.MetaValueItem LIVING_BIO_WAFER;
    public static MetaItem<?>.MetaValueItem LIVING_BIO_CHIP;


    //
    public static MetaItem<?>.MetaValueItem NUCLEAR_STAR;
    public static MetaItem<?>.MetaValueItem LIVING_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem PROTONATED_FULLERENE_SIEVING_MATRIX;
    public static MetaItem<?>.MetaValueItem SATURATED_FULLERENE_SIEVING_MATRIX;
    public static MetaItem<?>.MetaValueItem UNSTABLE_STAR;


    //ID140~TODO
    public static MetaItem<?>.MetaValueItem OPTICALLY_ENRICHED_CRYSTALLINE_BOULE;
    public static MetaItem<?>.MetaValueItem PHOTONICALLY_PREPARED_WAFER;
    public static MetaItem<?>.MetaValueItem PHOTONICALLY_ENHANCED_WAFER;
    public static MetaItem<?>.MetaValueItem RAW_EXPOSED_OPTICAL_CHIP;
    public static MetaItem<?>.MetaValueItem OPTICALLY_COMPATIBLE_MEMORY;
    public static MetaItem<?>.MetaValueItem OPTICALLY_PERFECTED_CPU;
    public static MetaItem<?>.MetaValueItem OPTICAL_CPU_CONTAINMENT_HOUSING;
    public static MetaItem<?>.MetaValueItem OPTICAL_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem OPTICAL_CAPACITOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_DIODE;
    public static MetaItem<?>.MetaValueItem OPTICAL_RESISTOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_INDUCTOR;


    //ID 180~199 TODO
    public static MetaItem<?>.MetaValueItem BZ_REACTION_CHAMBER;
    public static MetaItem<?>.MetaValueItem NONLINEAR_CHEMICAL_OSCILLATOR;
    public static MetaItem<?>.MetaValueItem PETRI_DISH_STERILE;
    public static MetaItem<?>.MetaValueItem PETRI_DISH_FERTILE;
    //  Algae
    public static MetaItem<?>.MetaValueItem BARNARDA_C_BASE;
    public static MetaItem<?>.MetaValueItem BARNARDA_C_CHLORELLA;
    public static MetaItem<?>.MetaValueItem BARNARDA_C_BRYOPSIS_HYPNOIDES;
    public static MetaItem<?>.MetaValueItem BARNARDA_C_ZOOXANTHELLAE;
    public static MetaItem<?>.MetaValueItem TAU_CETI_F_BASE;
    public static MetaItem<?>.MetaValueItem TAU_CETI_F_SCENEDESMUS_OBLIQUUS;
    public static MetaItem<?>.MetaValueItem TAU_CETI_F_PHAEOPHYTA;
    public static MetaItem<?>.MetaValueItem TAU_CETI_F_SPIRULINA;
    public static MetaItem<?>.MetaValueItem PROXIMA_B_BASE;
    public static MetaItem<?>.MetaValueItem PROXIMA_B_CONCHOSPORE;
    public static MetaItem<?>.MetaValueItem PROXIMA_B_POLYSIPHONIA_SENTICULOSA;
    public static MetaItem<?>.MetaValueItem PROXIMA_B_SPIROGYRA;
    //
    public static MetaItem<?>.MetaValueItem BIO_DISH_PETRI_DISH_STERILE;
    public static MetaItem<?>.MetaValueItem BIO_DISH_PETRI_DISH_FERTILE;


    //ID 200~TODO
    public static MetaItem<?>.MetaValueItem OPTICAL_FIBER;
    public static MetaItem<?>.MetaValueItem DIELECTRIC_MIRROR;
    public static MetaItem<?>.MetaValueItem EMPTY_LASER_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HELIUM_NEON_LASER;
    public static MetaItem<?>.MetaValueItem ND_YAG_LASER;
    public static MetaItem<?>.MetaValueItem OPTICAL_LASER_CONTROL_UNIT;
    //
    public static MetaItem<?>.MetaValueItem TOPOLOGICAL_INSULATOR_TUBE;
    public static MetaItem<?>.MetaValueItem BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT;
    public static MetaItem<?>.MetaValueItem BOSE_EINSTEIN_CONDENSATE;
    public static MetaItem<?>.MetaValueItem ESR_COMPUTATION_UNIT;
    //
    public static MetaItem<?>.MetaValueItem EIGENFOLDED_KERR_MANIFOLD;
    public static MetaItem<?>.MetaValueItem HYPERDIMENSIONAL_DRONE;
    //  High Energy Physics Items
    public static MetaItem<?>.MetaValueItem PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem RHENIUM_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem EXTREMELY_DURABLE_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem DENSE_NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem COSMIC_NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem TIME_DILATION_CONTAINMENT_UNIT;
    public static MetaItem<?>.MetaValueItem CONTAINED_RN_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CONTAINED_KN_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CONTAINED_KERR_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CONTAINED_HIGH_DENSITY_PROTONIC_MATTER;
    public static MetaItem<?>.MetaValueItem CONTAINED_EXOTIC_MATTER;
    public static MetaItem<?>.MetaValueItem CHARGED_TRIPLET_NEUTRONIUM_SPHERE;
    public static MetaItem<?>.MetaValueItem COSMIC_FABRIC_PLASMA_CONTAINMENT_CELL;


    //ID240~256
    // .addComponents(new HaloRenderItemBehavior(10, 0xFF000000, () -> ITTextures.HALO, false));
    //singularity
    public static MetaItem<?>.MetaValueItem ETERNAL_SINGULARITY;
    public static MetaItem<?>.MetaValueItem GASTRONOMIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem GALACTIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem NATURAL_SINGULARITY;
    public static MetaItem<?>.MetaValueItem MAGICAL_SINGULARITY;
    public static MetaItem<?>.MetaValueItem FANTASTIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CHEMICAL_SINGULARITY;
    public static MetaItem<?>.MetaValueItem THERMIONIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem PROTONIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem PLATONIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CUBIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem ASTRONOMIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem TERRIFIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem INTRINSIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem QUADRATIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem COSMIC_SINGULARITY;
    public static MetaItem<?>.MetaValueItem IMPOSSIBLE_SINGULARITY;


    //ID257~TODO

    //ID300~TODO
    public static MetaItem<?>.MetaValueItem GOOWARE_BOARD;
    public static MetaItem<?>.MetaValueItem OPTICAL_BOARD;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_BOARD;
    public static MetaItem<?>.MetaValueItem GOOWARE_CIRCUIT;
    public static MetaItem<?>.MetaValueItem OPTICAL_CIRCUIT;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_CIRCUIT;


    //ID 351~TODO
    //  Biological
    public static MetaItem<?>.MetaValueItem ELECTROCHEMICAL_GRADIENT_RECORDER;
    public static MetaItem<?>.MetaValueItem ULTRA_MICRO_PHASE_SEPARATOR;
    public static MetaItem<?>.MetaValueItem QUANTUM_TUNNELING_MICROTUBULE;
    public static MetaItem<?>.MetaValueItem HYPERRIBOSOME;
    public static MetaItem<?>.MetaValueItem NEUTRON_ABSORBING_PROTEIN;
    public static MetaItem<?>.MetaValueItem SUPEREXCITED_CONDUCTIVE_POLYMER;
    public static MetaItem<?>.MetaValueItem DNA_ENCODER;
    public static MetaItem<?>.MetaValueItem DNA_DECODER;
    public static MetaItem<?>.MetaValueItem DNA_DECODE_ENCODER;

    public static MetaItem<?>.MetaValueItem ORDINARY_ALGAE;
    public static MetaItem<?>.MetaValueItem RED_ALGA;
    public static MetaItem<?>.MetaValueItem GREEN_ALGA;
    public static MetaItem<?>.MetaValueItem CHRYSOPHYCEAE;
    public static MetaItem<?>.MetaValueItem BROWN_ALGA;


    //ID400~TODO
    public static MetaItem<?>.MetaValueItem BIO_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem ADVANCED_PROCESSOR_BOARD;
    public static MetaItem<?>.MetaValueItem ADVANCED_BOARD;
    public static MetaItem<?>.MetaValueItem QUANTUM_PROCESSOR_BOARD;
    public static MetaItem<?>.MetaValueItem QUANTUM_BOARD;
    public static MetaItem<?>.MetaValueItem NANO_PROCESSOR_BOARD;
    public static MetaItem<?>.MetaValueItem NANO_BOARD;
    public static MetaItem<?>.MetaValueItem EXOTIC_BOARD;
    public static MetaItem<?>.MetaValueItem EXOTIC_PROCESSOR_BOARD;


    //ID 425~TODO
    public static MetaItem<?>.MetaValueItem SPINTRONIC_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_DIODE;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_RESISTOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_INDUCTOR;

    public static MetaItem<?>.MetaValueItem COSMIC_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem COSMIC_RESISTOR;
    public static MetaItem<?>.MetaValueItem COSMIC_CAPACITOR;
    public static MetaItem<?>.MetaValueItem COSMIC_DIODE;
    public static MetaItem<?>.MetaValueItem COSMIC_INDUCTOR;

    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_RESISTOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_DIODE;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_INDUCTOR;


    //ID500~TODO
    //  Cosmic Components
    public static MetaItem<?>.MetaValueItem COSMIC_INFORMATION_MODULE;
    public static MetaItem<?>.MetaValueItem HOLOGRAPHIC_INFORMATION_IMC;
    public static MetaItem<?>.MetaValueItem CLADDED_OPTICAL_FIBER_CORE;
    public static MetaItem<?>.MetaValueItem CLOSED_TIMELIKE_CURVE_COMPUTATIONAL_UNIT;
    public static MetaItem<?>.MetaValueItem CLOSED_TIMELIKE_CURVE_GUIDANCE_UNIT;


    //  Supracausal Components
    public static MetaItem<?>.MetaValueItem SPACETIME_CONDENSER;
    public static MetaItem<?>.MetaValueItem LIGHT_CONE_MODULE;
    public static MetaItem<?>.MetaValueItem EXCITATION_MAINTAINER;


    //ID1200~TODO
    //Wrap Circuit
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_ULV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_LV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_MV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_HV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_EV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_IV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_LUV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_ZPM;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UHV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UEV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UIV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_UXV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_OPV;
    public static MetaItem<?>.MetaValueItem WRAP_CIRCUIT_MAX;

    //Wrap
    public static MetaItem<?>.MetaValueItem WRAP_COATED_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_PHENOLIC_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_PLASTIC_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_EPOXY_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_FIBER_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_MULTILAYER_FIBER_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_WETWARE_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_BASIC_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_GOOD_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_PLASTIC_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_EXTREME_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_ELITE_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_WETWARE_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem WRAP_SMD_CAPACITOR;
    public static MetaItem<?>.MetaValueItem WRAP_SMD_DIODE;
    public static MetaItem<?>.MetaValueItem WRAP_SMD_RESISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SMD_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SMD_INDUCTOR;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_CAPACITOR;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_DIODE;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_RESISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_SMD_INDUCTOR;

    public static MetaItem<?>.MetaValueItem WRAP_NEURO_PROCESSOR;
    public static MetaItem<?>.MetaValueItem WRAP_STEM_CELLS;
    public static MetaItem<?>.MetaValueItem WRAP_ENGRAVED_LAPOTRON_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_ENGRAVED_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_CRYSTAL_CENTRAL_PROCESSING_UNIT;

    public static MetaItem<?>.MetaValueItem WRAP_CENTRAL_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem WRAP_RANDOM_ACCESS_MEMORY;
    public static MetaItem<?>.MetaValueItem WRAP_INTEGRATED_LOGIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem WRAP_NANO_CENTRAL_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem WRAP_QUBIT_CENTRAL_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem WRAP_SIMPLE_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_ADVANCED_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_HIGHLY_ADVANCED_SOC;
    public static MetaItem<?>.MetaValueItem WRAP_NAND_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_NOR_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_ULTRA_LOW_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_LOW_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_HIGH_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_ULTRA_HIGH_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_NANO_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_PICO_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_FEMTO_PIC;

    public static MetaItem<?>.MetaValueItem WRAP_RAW_EXPOSED_OPTICAL_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICALLY_COMPATIBLE_MEMORY;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICALLY_PERFECTED_CPU;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_CPU_CONTAINMENT_HOUSING;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_CAPACITOR;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_DIODE;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_RESISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_INDUCTOR;

    public static MetaItem<?>.MetaValueItem WRAP_LIVING_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_LIVING_BIO_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_BIOCELLS;
    public static MetaItem<?>.MetaValueItem WRAP_GOOWARE_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_GOOWARE_CIRCUIT;

    public static MetaItem<?>.MetaValueItem WRAP_CRYSTAL_SYSTEM_ON_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_CRYSTAL_ADVANCED_RAW_CHIP;

    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_CAPACITOR;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_DIODE;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_RESISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_INDUCTOR;

    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_INFORMATION_MODULE;
    public static MetaItem<?>.MetaValueItem WRAP_HOLOGRAPHIC_INFORMATION_IMC;
    public static MetaItem<?>.MetaValueItem WRAP_SPACETIME_CONDENSER;
    public static MetaItem<?>.MetaValueItem WRAP_LIGHT_CONE_MODULE;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_RESISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_CAPACITOR;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_DIODE;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_INDUCTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_RESISTOR;
    public static MetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_CAPACITOR;
    public static MetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_DIODE;
    public static MetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_INDUCTOR;
    public static MetaItem<?>.MetaValueItem WRAP_ATTO_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_ZEPTO_PIC;
    public static MetaItem<?>.MetaValueItem WRAP_UHASOC_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_PHASE_CHANGE_MEMORY;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_NOR_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_SPIN_TRANSFER_TORQUE_MEMORY;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_NAND_MEMORY_CHIP;

    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_BOARD;
    public static MetaItem<?>.MetaValueItem WRAP_OPTICAL_CIRCUIT;
    public static MetaItem<?>.MetaValueItem WRAP_SPINTRONIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_CPU_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_COSMIC_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_CRYSTAL_OPTICAL_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_CRYSTAL_SPINTRONIC_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_CRYSTAL_COSMIC_RAW_CHIP;
    public static MetaItem<?>.MetaValueItem WRAP_SUPRACAUSAL_MEMORY_CHIP;


    //ID1400~TODO
    // PIC
    public static MetaItem<?>.MetaValueItem NANO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem PICO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem FEMTO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem NANO_PIC;
    public static MetaItem<?>.MetaValueItem PICO_PIC;
    public static MetaItem<?>.MetaValueItem FEMTO_PIC;
    public static MetaItem<?>.MetaValueItem ATTO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem ATTO_PIC;
    public static MetaItem<?>.MetaValueItem ZEPTO_PIC_WAFER;
    public static MetaItem<?>.MetaValueItem ZEPTO_PIC;
    public static MetaItem<?>.MetaValueItem UHASOC_WAFER;
    public static MetaItem<?>.MetaValueItem UHASOC_CHIP;

    public static MetaItem<?>.MetaValueItem PHASE_CHANGE_MEMORY;
    public static MetaItem<?>.MetaValueItem OPTICAL_NOR_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem SPIN_TRANSFER_TORQUE_MEMORY;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_NAND_MEMORY_CHIP;

    public static MetaItem<?>.MetaValueItem UNTREATED_COSMIC_CPU;
    public static MetaItem<?>.MetaValueItem COSMIC_CPU;
    public static MetaItem<?>.MetaValueItem COSMIC_CPU_CHIP;
    public static MetaItem<?>.MetaValueItem COSMIC_MEMORY_CHIP;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_MEMORY_CHIP;


    //ID2000~TODO
    public static MetaItem<?>.MetaValueItem PROSPECTOR_ZPM;
    public static MetaItem<?>.MetaValueItem PROSPECTOR_UV;
    public static MetaItem<?>.MetaValueItem PROSPECTOR_UIV;


    //ID2400~TODO
    public static MetaItem<?>.MetaValueItem RESEARCH_DATA_CARD;
    public static MetaItem<?>.MetaValueItem COSMIC_RESEARCH_DATA_CARD;
    public static MetaItem<?>.MetaValueItem GOOWARE_RESEARCH_DATA_CARD;
    public static MetaItem<?>.MetaValueItem OPTICAL_RESEARCH_DATA_CARD;
    public static MetaItem<?>.MetaValueItem SPINTRONIC_RESEARCH_DATA_CARD ;
    public static MetaItem<?>.MetaValueItem SUPRA_CAUSAL_RESEARCH_DATA_CARD;
    public static MetaItem<?>.MetaValueItem SUPRA_CHRONAL_RESEARCH_DATA_CARD;
    public static MetaItem<?>.MetaValueItem SUPRA_DIMENSION_RESEARCH_DATA_CARD;

    public static MetaItem<?>.MetaValueItem DEBUG_STRUCTURE_WRITER;
    public static MetaItem<?>.MetaValueItem DEBUG_STRUCTURE_BUILDER;

    public static void init() {
        INTMetaItem1 first = new INTMetaItem1();
        first.setRegistryName("meta_item_int");
        first.setCreativeTabs(CommonProxy.IMAGINARY_TAB);
        //intfirst.setCreativeTabs(CommonProxy.IMAGINARY_TAB);
//        for (OrePrefix prefix : orePrefixes) {
//            for (MaterialRegistry registry : GregTechAPI.materialManager.getRegistries()) {
//                String regName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, prefix.name());
//                MetaPrefixItem metaOrePrefix = new MetaPrefixItem(registry, prefix);
//                metaOrePrefix.setRegistryName(registry.getModid(), String.format("meta_%s", regName));
//            }
//        }
    }


//    public static void registerOreDict() {
//        for (INTMetaItem<?> item : INT_ITEMS) {
//            if (item instanceof INTMetaPrefixItem) {
//                ((INTMetaPrefixItem) item).registerOreDict();
//            }
//        }
//     /**    玻璃透镜
//        for (Map.Entry<MarkerMaterial, INTMetaItem.MetaValueItem> entry : GLASS_LENSES.entrySet()) {
//            // Register "craftingLensWhite" for example
//            OreDictUnifier.registerOre(entry.getValue().getStackForm(), OrePrefix.craftingLens, entry.getKey());
//            // Register "craftingLensGlass", intended only for recipes to dye lenses and not in the Engraver
//            OreDictUnifier.registerOre(entry.getValue().getStackForm(),
//                    String.format("%s%s", OrePrefix.craftingLens.name(), "Glass"));
//        }*/
//    }
//
//    @SideOnly(Side.CLIENT)
//    public static void registerModels() {
//        MinecraftForge.EVENT_BUS.register(INTMetaItems.class);
//        for (INTMetaItem<?> item : INT_ITEMS) {
//            item.registerModels();
//            item.registerTextureMesh();
//        }
//    }

//    @SideOnly(Side.CLIENT)
//    public static void registerColors() {
//        for (INTMetaItem<?> item : INT_ITEMS) {
//            item.registerColor();
//        }
//    }

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
