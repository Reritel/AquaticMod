package com.reritel.aquatic.registry.events;

import com.reritel.aquatic.registry.ModItems;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import org.lwjgl.glfw.GLFW;

public class AquaticKeybinds {
    public static final KeyBinding openDivingHelmet = KeyBindingHelper.registerKeyBinding(new KeyBinding("Open suit inventory", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_O, "AquaticKeys"));
    public static final ItemStack oxygen = new ItemStack(ModItems.OXYGEN_CYLINDER);
    public static void initialize() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            Item helmet = ModItems.DIVING_SUIT_HELMET;
            if (openDivingHelmet.wasPressed()) {
                if(client.player != null && client.player.getInventory().getArmorStack(3).getItem() == helmet) {
                    client.player.sendMessage(new LiteralText("aaaa"), false);
                    client.player.getInventory().getMainHandStack().damage(5, client.player, (p) -> {
                        p.sendToolBreakStatus(client.player.getActiveHand());
                    });
                }
            }
        });
    }
}
