package net.anna.testmod.items;

import net.anna.testmod.TestMod;
import net.anna.testmod.base.ModArmorMaterial;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> OSMIUM = ITEMS.register("osmium", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    //Ores and Materials items
    public static final RegistryObject<Item> FULLERINE = ITEMS.register("fullerine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> FULLERITE = ITEMS.register("fullerite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<Item> RAW_FULLERINE = ITEMS.register("raw_fullerine", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    //fullerite tools
    public static final RegistryObject<SwordItem> FULLERITE_SWORD = ITEMS.register("fullerite_sword", () ->
            new SwordItem(ToolTiers.FULLERITE, 5, 3.5f ,new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<PickaxeItem> FULLERITE_PICKAXE = ITEMS.register("fullerite_pickaxe", () ->
            new PickaxeItem(ToolTiers.FULLERITE, 3, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<ShovelItem> FULLERITE_SHOVEL = ITEMS.register("fullerite_shovel", () ->
            new ShovelItem(ToolTiers.FULLERITE, 3, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<AxeItem> FULLERITE_AXE = ITEMS.register("fullerite_axe", () ->
            new AxeItem(ToolTiers.FULLERITE, 7, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<HoeItem> FULLERITE_HOE = ITEMS.register("fullerite_hoe", () ->
            new HoeItem(ToolTiers.FULLERITE, 1, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    //Fullerine Armor
    public static final RegistryObject<ArmorItem> FULLERITE_HELMET =
            ITEMS.register("fullerite_helmet", () ->
            new ArmorItem(ArmorTiers.FULLERITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));


    public static final RegistryObject<ArmorItem> FULLERITE_CHEST = ITEMS.register("fullerite_chest", () ->
            new ArmorItem(ArmorTiers.FULLERITE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<ArmorItem> FULLERITE_LEGS = ITEMS.register("fullerite_legs", () ->
            new ArmorItem(ArmorTiers.FULLERITE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));
    public static final RegistryObject<ArmorItem> FULLERITE_FEETS = ITEMS.register("fullerite_feets", () ->
            new ArmorItem(ArmorTiers.FULLERITE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

