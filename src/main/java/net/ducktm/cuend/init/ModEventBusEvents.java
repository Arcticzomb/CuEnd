package net.ducktm.cuend.init;

import net.ducktm.cuend.ChorisiumModelRendering.ChorisiumArmorItem;
import net.ducktm.cuend.ChorisiumModelRendering.ChorisiumArmorRenderer;
import net.ducktm.cuend.CuEnd;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = CuEnd.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(ChorisiumArmorItem.class, new ChorisiumArmorRenderer());
    }
}
