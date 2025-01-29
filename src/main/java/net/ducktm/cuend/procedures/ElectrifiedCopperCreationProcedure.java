package net.ducktm.cuend.procedures;

import net.ducktm.cuend.init.ModBlocks;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ElectrifiedCopperCreationProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());

			/*BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());

			 */
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getLevelData().isRaining() || world.getLevelData().isThundering()) == true) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ModBlocks.SUPERCONDUCTIVE_COPPER_BLOCK.get()) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos((int) x, (int) y, (int) z)));
					entityToSpawn.setVisualOnly(true);
					_level.addFreshEntity(entityToSpawn);
				}
				world.setBlock(new BlockPos((int) x, (int) y, (int) z), ModBlocks.ELECTRIFIED_COPPER_BLOCK.get().defaultBlockState(), 3);
			}
		}
	}
}
