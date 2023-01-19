package net.anna.testmod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TEST_TAB = new CreativeModeTab("fullerite") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FULLERITE.get());
        }
    };


}