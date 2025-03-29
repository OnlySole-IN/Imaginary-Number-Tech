package onlysole.imaginarynumbertech.api.utils;

import net.minecraft.util.ResourceLocation;
import onlysole.imaginarynumbertech.Tags;
import org.jetbrains.annotations.NotNull;

public class INTUtils {
    @NotNull
    public static ResourceLocation intId(@NotNull String path) {
            return new ResourceLocation(Tags.MOD_ID, path);
    }
}
