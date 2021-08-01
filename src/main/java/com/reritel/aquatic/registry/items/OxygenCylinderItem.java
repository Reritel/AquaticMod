package com.reritel.aquatic.registry.items;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

public class OxygenCylinderItem extends Item {

    public int maxDamage;

    public OxygenCylinderItem(CreativeModeTab group, int maxDamage) {
        super(new Item.Properties().tab(group).durability(maxDamage));
        this.maxDamage = maxDamage;
    }

    public OxygenCylinderItem(){
        super(new Item.Properties().tab(null).durability(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player user, InteractionHand hand) {
        if(user.getOffhandItem().getItem() == ModItems.HAND_PUMP && !user.isInWater()) {
            user.getItemInHand(hand).setDamageValue(user.getItemInHand(hand).getDamageValue()-5);
        }

        return InteractionResultHolder.consume(user.getItemInHand(hand));
    }

    public void damageItem(ItemStack item, int damage) {
        item.setDamageValue(damage+1);
    }



}
