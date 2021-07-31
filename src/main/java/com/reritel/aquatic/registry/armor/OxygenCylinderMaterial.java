package com.reritel.aquatic.registry.armor;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OxygenCylinderMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.5F;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
