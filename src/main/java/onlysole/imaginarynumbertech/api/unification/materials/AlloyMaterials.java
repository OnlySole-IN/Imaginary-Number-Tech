package onlysole.imaginarynumbertech.api.unification.materials;

public class AlloyMaterials {
    private static int startId = 25001;
    private static final int END_ID = startId + 1000;

    public static void register() {}

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
