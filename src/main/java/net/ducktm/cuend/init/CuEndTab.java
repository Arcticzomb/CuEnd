package net.ducktm.cuend.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CuEndTab {

public static final CreativeModeTab CUEND_TAB = new CreativeModeTab("cuendTab") {

    @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHATTERED_PEARL.get());
        }
    };
}