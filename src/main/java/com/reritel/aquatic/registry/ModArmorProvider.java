package com.reritel.aquatic.registry;

import com.google.common.collect.Lists;
import com.reritel.aquatic.registry.armor.DivingSuit;
import com.reritel.aquatic.registry.armor.models.DivingHelmetModel;
import net.minecraft.client.model.HumanoidModel;
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
            default: {
                return defaultModel;
            }
        }
    }

    public Iterable<Item> getRenderedItems() {
        return Lists.newArrayList(ModItems.DIVING_SUIT_HELMET);
    }

    private boolean isStackValid(ItemStack stack) {
        return stack.getItem() instanceof DivingSuit;
    }

}
