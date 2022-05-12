package net.ducktm.cuend.init;

import net.ducktm.cuend.MinecraftExpanded;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
	public static final DeferredRegister<SoundEvent> SOUNDS =
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MinecraftExpanded.MOD_ID);


	public static final RegistryObject<SoundEvent> OTHERSTEP =
			soundEventRegistryObject("otherstep");

	private static RegistryObject<SoundEvent> soundEventRegistryObject(String name) {
		return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(MinecraftExpanded.MOD_ID, name)));
	}

	public static void register(IEventBus eventBus) {
		SOUNDS.register(eventBus);
	}
}
