package onlysole.imaginarynumbertech.api.utils;

import net.minecraft.util.ResourceLocation;
import onlysole.imaginarynumbertech.api.INTValues;
import org.jetbrains.annotations.NotNull;

public class INTUtils {
    @NotNull
    public static ResourceLocation intId(@NotNull String path) {
            return new ResourceLocation(INTValues.MOD_ID, path);
    }
}
