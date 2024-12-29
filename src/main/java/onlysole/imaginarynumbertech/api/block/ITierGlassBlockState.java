package onlysole.imaginarynumbertech.api.block;

import gregtech.api.GTValues;
import gregtech.client.utils.TooltipHelper;
import net.minecraft.client.resources.I18n;
import onlysole.imaginarynumbertech.api.utils.INTUniverUtil;

public interface ITierGlassBlockState extends ITier{

    @Override
    default Object getTier() {
        return this.getGlassTier();
    }

    boolean isOpticalGlass();
    int getGlassTier();

    default long getTireVoltage(){
        return GTValues.V[getGlassTier()];
    }

    default String getTireName(){
        return GTValues.VN[getGlassTier()];
    }

    default String getTireNameColored(){
        return GTValues.VNF[getGlassTier()];
    }

    default String getOpticalTierName() {
        return TooltipHelper.BLINKING_CYAN + I18n.format("imaginarynumbertech.optical_glass_tier.tooltip." + INTUniverUtil.getOpticalGlassTier(getGlassTier()));
    }
}
