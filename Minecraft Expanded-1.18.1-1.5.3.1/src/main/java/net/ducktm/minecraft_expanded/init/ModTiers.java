package net.ducktm.cuend.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers {
    public static final ForgeTier COPPER = new ForgeTier(1, 242, 5f,
            2f, 0, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(Items.COPPER_INGOT));

    public static final ForgeTier CHORISIUM = new ForgeTier(4, 3032, 12f,
            4.5f, 18, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.CHORISIUM_INGOT.get()));
}
