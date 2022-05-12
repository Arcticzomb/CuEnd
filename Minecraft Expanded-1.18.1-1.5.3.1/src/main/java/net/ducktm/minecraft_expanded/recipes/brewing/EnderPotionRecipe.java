package net.ducktm.cuend.recipes.brewing;

import net.ducktm.cuend.init.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnderPotionRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new DripolotlBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return input.getItem() == ModItems.AXOBOTL.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == Blocks.DRIPSTONE_BLOCK.asItem();
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(ModItems.DRIPOLOTL.get());
		}
		return ItemStack.EMPTY;
	}
}
