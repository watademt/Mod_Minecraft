package net.anna.testmod.items;

import net.anna.testmod.base.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorTiers {
    public static final ArmorMaterial FULLERITE = new ModArmorMaterial(
            "fullerite",
            50, new int[]{6, 12, 16, 6},
            300,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            0.0f,
            0.0f,
            () -> Ingredient.of(ModItems.FULLERITE.get())
    );
}
