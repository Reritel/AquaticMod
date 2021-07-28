package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block AQUAMARINE_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES)
            .requiresTool()
            .strength(5f,30f)
            .sounds(BlockSoundGroup.METAL));

    public static void RegisterBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "aquamarine_block"), AQUAMARINE_BLOCK);
    }
}
