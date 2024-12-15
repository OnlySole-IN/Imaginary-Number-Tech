package onlysole.imaginarynumbertech.mixin;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.Collections;
import java.util.List;

public class INTLateMixin implements ILateMixinLoader {
    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("mixins.imaginarynumbertech_late.json");
    }
}
