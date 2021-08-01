package com.reritel.aquatic.registry.armor.item;

import com.reritel.aquatic.registry.ModItems;
import com.reritel.aquatic.registry.armor.DivingSuit;
import net.minecraft.world.entity.EquipmentSlot;

public class DivingSuitLeggings extends DivingSuit {
    public DivingSuitLeggings() {
        super(EquipmentSlot.LEGS, ModItems.makeModItemSettings());
    }
}
