package onlysole.imaginarytech.api.utils;

import net.minecraft.util.ResourceLocation;
import onlysole.imaginary_tech.Tags;
import org.jetbrains.annotations.NotNull;

public class ITUtils {
    @NotNull
    public static ResourceLocation ITID(@NotNull String path) {
            return new ResourceLocation(Tags.MOD_ID, path);
    }
}
