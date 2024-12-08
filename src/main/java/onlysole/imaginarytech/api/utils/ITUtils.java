package onlysole.imaginarytech.api.utils;

import net.minecraft.util.ResourceLocation;
import onlysole.imaginarytech.api.ITValues;
import org.jetbrains.annotations.NotNull;

public class ITUtils {
    @NotNull
    public static ResourceLocation ITID(@NotNull String path) {
            return new ResourceLocation(ITValues.MOD_ID, path);
    }
}
