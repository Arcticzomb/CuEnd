package net.ducktm.cuend.procedures;

import net.ducktm.cuend.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import java.util.Collections;

@Mod.EventBusSubscriber
public class SavingGraceProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.getX(), entity.getZ(), entity);
		}
	}

	public static void execute(double x, double z, Entity entity) {
		execute(null, x, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if ((Level.END) == (entity.level.dimension()) || (ResourceKey.create(Registry.DIMENSION_REGISTRY,
				new ResourceLocation("minecraft_expanded:end_of_the_void"))) == (entity.level.dimension())) {
			if (entity.getY() <= -62) {
				if (entity instanceof Player _playerHasItem && _playerHasItem.getInventory().contains(new ItemStack(ModItems.SAVING_GRACE.get()))) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (entity.getY() + 178), z);
						if (_ent instanceof ServerPlayer _serverPlayer) {
							_serverPlayer.connection.teleport(x, (entity.getY() + 178), z, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 0, (false), (false)));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ModItems.SAVING_GRACE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
