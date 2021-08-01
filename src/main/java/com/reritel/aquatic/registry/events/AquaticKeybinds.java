package com.reritel.aquatic.registry.events;

import com.mojang.blaze3d.platform.InputConstants;
import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.ModItems;
import com.reritel.aquatic.registry.items.OxygenCylinderItem;
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
    public static final OxygenCylinderItem oxygenCylinder = new OxygenCylinderItem();
    public static  final ItemStack helmet = new ItemStack(ModItems.DIVING_SUIT_HELMET);
    public  static int oxygenLevel;
    public  static int maxOxygenLevel;
    public static void initialize() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            if (openDivingHelmet.isDown()) {

                if(client.player != null) {
                    Main.log(Level.WARN, "aquatic keybind: check button press "+client.getFrameTime());
                    if(client.player.getItemBySlot(EquipmentSlot.HEAD).getItem() == helmet.getItem())  {
                        Main.log(Level.WARN, "aquatic keybind: check helmet in inventory");
                        maxOxygenLevel = client.player.getInventory().getItem(0).getMaxDamage();
                        oxygenLevel = client.player.getInventory().getItem(0).getDamageValue();
                        if(oxygenLevel<maxOxygenLevel) {
                            oxygenCylinder.damageItem(client.player.getInventory().getItem(0), oxygenLevel);
                        }
                        else {

                        }
                    }
                }
            }
        });
    }
}

