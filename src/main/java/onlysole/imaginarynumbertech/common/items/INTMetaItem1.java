package onlysole.imaginarynumbertech.common.items;

import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.items.metaitem.stats.IItemComponent;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.behaviors.MultiblockBuilderBehavior;
import gregtech.common.items.behaviors.ProspectorScannerBehavior;
import gregtech.common.items.behaviors.TooltipBehavior;
import net.minecraft.client.resources.I18n;
import onlysole.imaginarynumbertech.client.renderer.texture.INTTextures;
import onlysole.imaginarynumbertech.common.CommonProxy;
import onlysole.imaginarynumbertech.common.items.behaviors.renderer.CosmicRenderItemBehavior;
import onlysole.imaginarynumbertech.common.items.behaviors.renderer.HaloRenderItemBehavior;

import static onlysole.imaginarynumbertech.common.items.INTMetaItems.*;

public class INTMetaItem1 extends StandardMetaItem {

    public INTMetaItem1() {
        super();
    }

    // = this.addItem(,"");
    @Override
    public void registerSubItems(){

    }
}
