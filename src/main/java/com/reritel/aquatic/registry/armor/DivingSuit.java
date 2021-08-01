package com.reritel.aquatic.registry.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import ru.bclib.items.BaseArmorItem;

public class DivingSuit extends BaseArmorItem {

//    public final static TranslatableComponent CHEST_DESC;
//    public final static TranslatableComponent BOOTS_DESC;

    public DivingSuit(EquipmentSlot equipmentSlot, Properties settings) {
        super(DivingSuitMaterial.DIVING_SUIT, equipmentSlot, settings);
    }

    public static boolean hasFullSet(LivingEntity owner) {
        for (ItemStack armorStack : owner.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof DivingSuit)) {
                return false;
            }
        }
        return true;
    }

    public static void applySetEffect(LivingEntity owner) {
//        owner.addEffect(new MobEffectInstance(EndStatusEffects.CRYSTALITE_HEALTH_REGEN));
    }

    static {
//        Style descStyle = Style.EMPTY.applyFormats(ChatFormatting.DARK_AQUA, ChatFormatting.ITALIC);
//        CHEST_DESC = new TranslatableComponent("tooltip.armor.crystalite_chest");
//        CHEST_DESC.setStyle(descStyle);
//        BOOTS_DESC = new TranslatableComponent("tooltip.armor.crystalite_boots");
//        BOOTS_DESC.setStyle(descStyle);
    }
}
