package net.ducktm.cuend.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MINECRAFT_EXPANDED_TAB = new CreativeModeTab("minecraft_expandedTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHATTERED_PEARL.get());
        }
    };
}
