package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //ModItems
    public static final Item AQUAMARINE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));

    //Block ModItems
    public static final BlockItem AQUAMARINE_BLOCK = new BlockItem(ModBlocks.AQUAMARINE_BLOCK, new Item.Settings().group(Main.ITEM_GROUP));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine"), AQUAMARINE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquamarine_block"), AQUAMARINE_BLOCK);
    }
}
