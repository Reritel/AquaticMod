package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.armor.DivingSuitMaterial;
import com.reritel.aquatic.registry.items.OxygenCylinderItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModItems {
    //Items
    public static final Item AQUAMARINE = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));
    public static final Item REDSTONE_GEM = new Item(new FabricItemSettings().group(Main.ITEM_GROUP));

    //Diving suit
    public static final DivingSuitMaterial DIVING_SUIT_MATERIAL = new DivingSuitMaterial();
    public static final Item DIVING_SUIT_HELMET = new ArmorItem((ArmorMaterial) DIVING_SUIT_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(Main.ITEM_GROUP));

    public static final Item HAND_PUMP = new Item(new Item.Properties().tab(Main.ITEM_GROUP));
    public static void GenerateBlockItem(String ITEM_NAME, Block BLOCK) {
        final BlockItem BLOCK_ITEM = new BlockItem(BLOCK, new Item.Properties().tab(Main.ITEM_GROUP));

        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, ITEM_NAME), BLOCK_ITEM);
    }

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "aquamarine"), AQUAMARINE);
        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "redstone_gem"), REDSTONE_GEM);

        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "diving_suit_helmet"), DIVING_SUIT_HELMET);

        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "hand_pump"), HAND_PUMP);

        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "oxygen_cylinder_tier1"), new OxygenCylinderItem(Main.ITEM_GROUP, 100));
        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "oxygen_cylinder_tier2"), new OxygenCylinderItem(Main.ITEM_GROUP, 500));
        Registry.register(Registry.ITEM, new ResourceLocation(Main.MOD_ID, "oxygen_cylinder_tier3"), new OxygenCylinderItem(Main.ITEM_GROUP, 1000));
    }




}
