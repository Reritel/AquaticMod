package com.reritel.aquatic.registry.events;

import com.mojang.blaze3d.platform.InputConstants;
import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.ModItems;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.Level;
import org.lwjgl.glfw.GLFW;

import java.awt.*;

public class AquaticKeybinds {
    public static final KeyMapping openDivingHelmet = KeyBindingHelper.registerKeyBinding(new KeyMapping("Open suit inventory", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, "AquaticKeys"));
    public static final ItemStack oxygen = new ItemStack(ModItems.OXYGEN_CYLINDER);
    public static  final ItemStack helmet = new ItemStack(ModItems.DIVING_SUIT_HELMET);
    public  static int oxygenLevel;
    public static void initialize() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {



            if (openDivingHelmet.isDown()) {

                if(client.player != null) {
                    Main.log(Level.WARN, "aquatic keybind: check button press "+client.getFrameTime());
                    if(client.player.getItemBySlot(EquipmentSlot.HEAD).getItem() == helmet.getItem())  {
                        Main.log(Level.WARN, "aquatic keybind: check helmet in inventory");
                        oxygenLevel = client.player.getInventory().getItem(getSlot(client.player, oxygen)).getDamageValue();
                        client.player.getInventory().getItem(getSlot(client.player, oxygen)).setDamageValue(oxygenLevel+1);
                    }
                }
            }
        });
    }
    public static int getSlot(Player player, ItemStack item) {
        int slot = 0;

        for(int i = 0; i<36; i++) {
            if (player.getInventory().getItem(i).getItem() == item.getItem()) {
                Main.log(Level.WARN, "found slot id");
                slot = i;
                break;
            }
        }

        return slot;
    }
}
