package net.ducktm.cuend.init;

import net.ducktm.cuend.CuEnd;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CuEnd.MOD_ID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 3, -2.4f,
                    new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 0, 1.2f,
                    new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> RAW_CHORISIUM_CHUNK = ITEMS.register("raw_chorisium_chunk",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_INGOT = ITEMS.register("chorisium_ingot",
            () -> new Item(new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_WAR_AXE = ITEMS.register("chorisium_war_axe",
            () -> new AxeItem(ModTiers.CHORISIUM, 5, -3f,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_SWORD = ITEMS.register("chorisium_sword",
            () -> new SwordItem(ModTiers.CHORISIUM, 4, -2.4f,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_SHOVEL = ITEMS.register("chorisium_shovel",
            () -> new ShovelItem(ModTiers.CHORISIUM, -2, 0f,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_PICKAXE = ITEMS.register("chorisium_pickaxe",
            () -> new PickaxeItem(ModTiers.CHORISIUM, -1, -1f,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_BOOTS = ITEMS.register("chorisium_boots",
            () -> new ArmorItem(ModArmorMaterial.CHORISIUM, EquipmentSlot.FEET,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_LEGGINGS = ITEMS.register("chorisium_leggings",
            () -> new ArmorItem(ModArmorMaterial.CHORISIUM, EquipmentSlot.LEGS,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_CHESTPLATE = ITEMS.register("chorisium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.CHORISIUM, EquipmentSlot.CHEST,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> CHORISIUM_HELMET = ITEMS.register("chorisium_helmet",
            () -> new ArmorItem(ModArmorMaterial.CHORISIUM, EquipmentSlot.HEAD,
                    new Item.Properties().fireResistant().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> SHATTERED_PEARL = ITEMS.register("shattered_pearl",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> SHATTERED_EYE_OF_ENDER = ITEMS.register("shattered_eye_of_ender",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> SAVING_GRACE = ITEMS.register("saving_grace",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));
/*
    public static final RegistryObject<Item> THE_VOID_IS_HAPPY_MUSIC_DISC = ITEMS.register("the_void_is_happy_music_disc",
            () -> new RecordItem(14, () -> ModSoundEvents.THE_VOID_IS_HAPPY.get(),
                    new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).tab(ModCreativeModeTab.CUEND_TAB)));
*/
    public static final RegistryObject<Item> OTHERSTEP_MUSIC_DISC = ITEMS.register("otherstep_music_disc",
            () -> new RecordItem(14, () -> ModSoundEvents.OTHERSTEP.get(),
                    new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> AXOBOTL = ITEMS.register("axobotl",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> DRIPOLOTL = ITEMS.register("dripolotl",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> UNSTABLE_DUST = ITEMS.register("unstable_dust",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> DIAMOND_BIT = ITEMS.register("diamond_bit",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> DIAMOND_CHUNK = ITEMS.register("diamond_chunk",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static final RegistryObject<Item> UNREFINED_DIAMOND = ITEMS.register("unrefined_diamond",
            () -> new Item(new Item.Properties().tab(CuEndTab.CUEND_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}