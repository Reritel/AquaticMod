package com.reritel.aquatic.registry.armor.item;

import com.reritel.aquatic.registry.ModItems;
import com.reritel.aquatic.registry.armor.DivingSuit;
import net.minecraft.world.entity.EquipmentSlot;

public class DivingSuitBoots extends DivingSuit {
    public DivingSuitBoots() {
        super(EquipmentSlot.FEET, ModItems.makeModItemSettings());
    }
}
