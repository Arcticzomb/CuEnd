package net.ducktm.cuend.recipes.brewing;

import net.ducktm.cuend.init.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AxobotlBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new AxobotlBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
				&& PotionUtils.getPotion(input) == Potions.WATER;
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == Items.AXOLOTL_BUCKET;
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(ModItems.AXOBOTL.get());
		}
		return ItemStack.EMPTY;
	}
}
