package onlysole.imaginarynumbertech.api.unification.material.properties;

import gregtech.api.unification.material.properties.*;

public class INTPropertyKey<T extends IMaterialProperty> {

//    public static final PropertyKey<BlastProperty> BLAST = new PropertyKey<>("blast", BlastProperty.class);
//    public static final PropertyKey<DustProperty> DUST = new PropertyKey<>("dust", DustProperty.class);
//    public static final PropertyKey<FluidPipeProperties> FLUID_PIPE = new PropertyKey<>("fluid_pipe",
//            FluidPipeProperties.class);
//    public static final PropertyKey<FluidProperty> FLUID = new PropertyKey<>("fluid", FluidProperty.class);
//    public static final PropertyKey<GemProperty> GEM = new PropertyKey<>("gem", GemProperty.class);
//    public static final PropertyKey<IngotProperty> INGOT = new PropertyKey<>("ingot", IngotProperty.class);
//    public static final PropertyKey<PolymerProperty> POLYMER = new PropertyKey<>("polymer", PolymerProperty.class);
//    public static final PropertyKey<ItemPipeProperties> ITEM_PIPE = new PropertyKey<>("item_pipe",
//            ItemPipeProperties.class);
//    public static final PropertyKey<OreProperty> ORE = new PropertyKey<>("ore", OreProperty.class);
//    public static final PropertyKey<ToolProperty> TOOL = new PropertyKey<>("tool", ToolProperty.class);
//    public static final PropertyKey<RotorProperty> ROTOR = new PropertyKey<>("rotor", RotorProperty.class);
//    public static final PropertyKey<WireProperties> WIRE = new PropertyKey<>("wire", WireProperties.class);
//    public static final PropertyKey<WoodProperty> WOOD = new PropertyKey<>("wood", WoodProperty.class);
//
//    // Empty property used to allow property-less Materials without removing base type enforcement
//    public static final PropertyKey<EmptyProperty> EMPTY = new PropertyKey<>("empty", EmptyProperty.class);

    public static final PropertyKey<NanitesProperty> NANITES = new PropertyKey<>("nanites", NanitesProperty.class);

    private final String key;
    private final Class<T> type;

    public INTPropertyKey(String key, Class<T> type) {
        this.key = key;
        this.type = type;
    }

    protected String getKey() {
        return key;
    }

    protected T constructDefault() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

    public T cast(IMaterialProperty property) {
        return this.type.cast(property);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof INTPropertyKey) {
            return ((INTPropertyKey<?>) o).getKey().equals(key);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        return key;
    }

    private static class EmptyProperty implements IMaterialProperty {

        @Override
        public void verifyProperty(MaterialProperties properties) {
            // no-op
        }
    }
}