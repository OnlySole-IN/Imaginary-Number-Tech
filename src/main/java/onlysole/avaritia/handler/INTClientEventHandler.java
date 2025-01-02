package onlysole.avaritia.handler;

import codechicken.lib.texture.TextureUtils;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import onlysole.avaritia.shader.CosmicShaderHelper;
import onlysole.imaginarynumbertech.client.renderer.texture.INTTextures;
import org.lwjgl.BufferUtils;

import java.nio.FloatBuffer;

public class INTClientEventHandler {

    public static FloatBuffer cosmicUVs = BufferUtils.createFloatBuffer(4 * 10);

    @SubscribeEvent
    public void textureStichPost(TextureStitchEvent.Post event) {
        TextureUtils.bindBlockTexture();
    }

    @SubscribeEvent
    public void onRenderTick(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            cosmicUVs = BufferUtils.createFloatBuffer(4 * INTTextures.COSMIC.length);
            TextureAtlasSprite icon;
            for (TextureAtlasSprite cosmicIcon : INTTextures.COSMIC) {
                icon = cosmicIcon;

                cosmicUVs.put(icon.getMinU());
                cosmicUVs.put(icon.getMinV());
                cosmicUVs.put(icon.getMaxU());
                cosmicUVs.put(icon.getMaxV());
            }
            cosmicUVs.flip();
        }
    }

    @SubscribeEvent
    public void onDrawScreenPre(GuiScreenEvent.DrawScreenEvent.Pre event) {
        CosmicShaderHelper.inventoryRender = true;
    }

    @SubscribeEvent
    public void drawScreenPost(GuiScreenEvent.DrawScreenEvent.Post event) {
        CosmicShaderHelper.inventoryRender = false;
    }
}
