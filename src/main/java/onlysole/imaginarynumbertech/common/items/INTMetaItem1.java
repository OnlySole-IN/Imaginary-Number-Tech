package onlysole.imaginarynumbertech.common.items;

import gregtech.api.items.metaitem.StandardMetaItem;
import onlysole.avaritia.behavior.CosmicRenderItemBehavior;
import onlysole.imaginarynumbertech.client.renderer.texture.INTTextures;

import static onlysole.imaginarynumbertech.common.items.INTMetaItems.NULL;

public class INTMetaItem1 extends StandardMetaItem {

    public INTMetaItem1() {
        super();
    }

    // = this.addItem(,"");
    @Override
    public void registerSubItems(){
        NULL = this.addItem(48, "null")
                .addComponents(new CosmicRenderItemBehavior(() -> INTTextures.MASK_INGOT, 1));
    }
}
