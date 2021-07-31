package com.reritel.aquatic.registry.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class DivingSuitMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return BASE_DURABILITY[equipmentSlot.getIndex()] * 33;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return PROTECTION_VALUES[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 5.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5F;
    }
}
