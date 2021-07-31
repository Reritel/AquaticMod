package com.reritel.aquatic.registry.events;

import com.mojang.blaze3d.platform.InputConstants;
import com.reritel.aquatic.registry.ModItems;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.lwjgl.glfw.GLFW;

public class AquaticKeybinds {
//    public static final KeyMapping openDivingHelmet = KeyBindingHelper.registerKeyBinding(new KeyMapping("Open suit inventory", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, "AquaticKeys"));
//    public static final ItemStack oxygen = new ItemStack(ModItems.OXYGEN_CYLINDER);
//    public static void initialize() {
//        ClientTickEvents.END_CLIENT_TICK.register(client -> {
//
//            Item helmet = ModItems.DIVING_SUIT_HELMET;
//            if (openDivingHelmet.isDown()) {
//                if(client.player != null && client.player.getInventory().armor.contains(helmet)) {
//                    client.player.sendMessage(new LiteralText("aaaa"), false);
//                    client.player.getInventory().getMainHandStack().damage(5, client.player, (p) -> {
//                        p.sendToolBreakStatus(client.player.getActiveHand());
//                    });
//                }
//            }
//        });
//    }
}
