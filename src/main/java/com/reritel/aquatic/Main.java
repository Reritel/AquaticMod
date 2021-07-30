package com.reritel.aquatic;

import com.reritel.aquatic.registry.ModBlocks;
import com.reritel.aquatic.registry.ModItems;
import com.reritel.aquatic.registry.ModOreGeneration;
import com.reritel.aquatic.registry.ModOres;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.gui.screen.Overlay;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.server.dedicated.gui.PlayerListGui;
import net.minecraft.server.dedicated.gui.PlayerStatsGui;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;

public class Main implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "aquatic";
    public static final String MOD_NAME = "AquaticMod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.AQUAMARINE));

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");

        ModItems.RegisterItems();
        ModBlocks.RegisterBlocks();
        ModOres.RegisterOres();
        ModOreGeneration.RegisterOreGeneration();

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}