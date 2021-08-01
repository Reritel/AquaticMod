//package com.reritel.aquatic.registry;
//
//import com.reritel.aquatic.Main;
//import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
//import net.minecraft.core.Registry;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.SoundType;
//import net.minecraft.world.level.material.Material;
//
//public class ModBlocks {
//    public static final Block AQUAMARINE_BLOCK = new Block(FabricBlockSettings
//            .of(Material.METAL)
//            .breakByTool(FabricToolTags.PICKAXES)
//            .requiresTool()
//            .strength(5f,30f)
//            .sounds(SoundType.METAL));
//
//    public static void RegisterBlocks() {
//        Registry.register(Registry.BLOCK, new ResourceLocation(Main.MOD_ID, "aquamarine_block"), AQUAMARINE_BLOCK);
//        ModItems.GenerateBlockItem("aquamarine_block", AQUAMARINE_BLOCK);
//    }
//}
