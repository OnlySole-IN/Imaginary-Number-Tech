package onlysole.imaginarynumbertech.common;

import gregtech.api.unification.material.event.MaterialEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import onlysole.imaginarynumbertech.api.INTValues;
import onlysole.imaginarynumbertech.api.capability.pollution.PollutionProvider;
import onlysole.imaginarynumbertech.api.unification.INTMaterials;

@Mod.EventBusSubscriber(modid = INTValues.MOD_ID)
public class INTEventHandler {
    public INTEventHandler() {}

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterials(MaterialEvent event) {
        INTMaterials.initregister();
        //OrePrefixAdditions.init();
    }
    @SubscribeEvent
    public void attachChunkPollutionCapability(AttachCapabilitiesEvent<Chunk> event) {
        event.addCapability(new ResourceLocation(INTValues.MOD_ID, "pollution_cap"), new PollutionProvider());
    }
}
