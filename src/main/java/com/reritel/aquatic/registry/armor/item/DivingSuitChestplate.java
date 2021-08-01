package com.reritel.aquatic.registry.armor.item;

import com.reritel.aquatic.registry.ModItems;
import com.reritel.aquatic.registry.armor.DivingSuit;
import net.minecraft.world.entity.EquipmentSlot;

public class DivingSuitChestplate extends DivingSuit {
    public DivingSuitChestplate() {
        super(EquipmentSlot.CHEST, ModItems.makeModItemSettings());
    }
}
