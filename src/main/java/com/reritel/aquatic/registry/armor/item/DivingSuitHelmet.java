package com.reritel.aquatic.registry.armor.item;

import com.reritel.aquatic.registry.ModItems;
import com.reritel.aquatic.registry.armor.DivingSuit;
import net.minecraft.world.entity.EquipmentSlot;

public class DivingSuitHelmet extends DivingSuit {

    public DivingSuitHelmet() {
        super(EquipmentSlot.HEAD, ModItems.makeModItemSettings());
//        UUID uuid = ARMOR_MODIFIER_UUID_PER_SLOT[EquipmentSlot.HEAD.getIndex()];
//        addAttributeModifier(EndAttributes.BLINDNESS_RESISTANCE, new AttributeModifier(uuid, "Helmet blindness resistance", 1.0, AttributeModifier.Operation.ADDITION));
    }
}
