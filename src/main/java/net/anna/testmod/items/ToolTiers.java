package net.anna.testmod.items;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolTiers {
    public static final Tier FULLERITE = new ForgeTier(
            4,
            3500,
            11.5f,
            5.5f,
            25,
            null,
            () -> Ingredient.of(ModItems.FULLERITE.get()));
}
