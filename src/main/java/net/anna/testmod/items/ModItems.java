package net.anna.testmod.items;

import net.anna.testmod.TestMod;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> OSMIUM = ITEMS.register("osmium", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //add fullerite alloy ingot,
    // osmium, osmium ore
    // fullerine, fullerine ore

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
