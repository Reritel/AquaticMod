package com.reritel.aquatic.registry;

import com.google.common.collect.Lists;
import com.reritel.aquatic.registry.armor.DivingSuit;
import com.reritel.aquatic.registry.armor.models.DivingBootsModel;
import com.reritel.aquatic.registry.armor.models.DivingLeggingsModel;
import com.reritel.aquatic.registry.armor.models.DivingChestplateModel;
import com.reritel.aquatic.registry.armor.models.DivingHelmetModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import shadow.fabric.api.client.rendering.v1.ArmorRenderingRegistry;

public class ModArmorProvider implements ArmorRenderingRegistry.ModelProvider, ArmorRenderingRegistry.TextureProvider {
    private final static ResourceLocation FIRST_LAYER = new ResourceLocation("textures/models/armor/diving_suit.png");
    private final static DivingHelmetModel HELMET_MODEL = DivingHelmetModel.createModel(null);
    private final static DivingChestplateModel CHEST_MODEL = DivingChestplateModel.createModel(null);
    private final static DivingChestplateModel CHEST_MODEL_THIN = DivingChestplateModel.createModel(null);
    private final static DivingLeggingsModel LEGGINGS_MODEL = DivingLeggingsModel.createModel(null);
    private final static DivingBootsModel BOOTS_MODEL = DivingBootsModel.createModel(null);

    @Override
    public @NotNull ResourceLocation getArmorTexture(LivingEntity entity, ItemStack stack, EquipmentSlot slot, boolean secondLayer, @Nullable String suffix, ResourceLocation defaultTexture) {
        if (!isStackValid(stack)) return defaultTexture;
        return FIRST_LAYER;
    }

    @Override
    public @NotNull HumanoidModel<LivingEntity> getArmorModel(LivingEntity entity, ItemStack stack, EquipmentSlot slot, HumanoidModel<LivingEntity> defaultModel) {
        switch (slot) {
            case HEAD: {
                return HELMET_MODEL;
            }
            case CHEST: {
                if (entity instanceof AbstractClientPlayer && ((AbstractClientPlayer) entity).getModelName().equals("slim")) {
                    CHEST_MODEL_THIN.copyPropertiesTo(defaultModel);
                    return CHEST_MODEL_THIN;
                }
                CHEST_MODEL.copyPropertiesTo(defaultModel);
                return CHEST_MODEL;
            }
            case LEGS: {
                return LEGGINGS_MODEL;
            }
            case FEET: {
                BOOTS_MODEL.copyPropertiesTo(defaultModel);
                return BOOTS_MODEL;
            }
            default: {
                return defaultModel;
            }
        }
    }

    public Iterable<Item> getRenderedItems() {
        return Lists.newArrayList(ModItems.DIVING_SUIT_HELMET, ModItems.DIVING_SUIT_CHESTPLATE, ModItems.DIVING_SUIT_LEGGINGS, ModItems.DIVING_SUIT_BOOTS);
    }

    private boolean isStackValid(ItemStack stack) {
        return stack.getItem() instanceof DivingSuit;
    }

}
