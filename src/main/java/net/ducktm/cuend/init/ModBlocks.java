package net.ducktm.cuend.init;

import net.ducktm.cuend.CuEnd;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CuEnd.MOD_ID);

    public static final RegistryObject<Block> SUPERCONDUCTIVE_COPPER_BLOCK = registerBlock("superconductive_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F,
                    6.0F).sound(SoundType.COPPER)));

    public static final RegistryObject<Block> ELECTRIFIED_COPPER_BLOCK = registerBlock("electrified_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.0F,
                    6.0F).sound(SoundType.COPPER)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CuEndTab.CUEND_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
