package net.ducktm.cuend;

import net.ducktm.cuend.init.ModBlocks;
import net.ducktm.cuend.init.ModItems;
import net.ducktm.cuend.init.ModSoundEvents;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CuEnd.MOD_ID)
public class CuEnd {
    public static final String MOD_ID = "cuend";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public CuEnd() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModSoundEvents.register(eventBus);

        eventBus.addListener(this::setup);

        GeckoLib.initialize();


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("CuEnd has loaded! Imma do ya mom now. Catch ya later.");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

}
