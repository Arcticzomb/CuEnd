package net.ducktm.cuend.procedures;

import net.ducktm.cuend.init.ModBlocks;
import net.ducktm.cuend.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CoppperArmorBuffFullSetProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (ModBlocks.ELECTRIFIED_COPPER_BLOCK.get() == (world
				.getBlockState(new BlockPos((int) (entity.getX()), (int) (entity.getY() - 1), (int) (entity.getZ())))).getBlock()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
					.getItem() == ModItems.COPPER_BOOTS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
							.getItem() == ModItems.COPPER_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
							.getItem() == ModItems.COPPER_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
							.getItem() == ModItems.COPPER_HELMET.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 80, 0, (false), (false)));
			}
		}
	}
}