package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModOres {
    static public final FallingBlock AQUAMARINE_ORE = new FallingBlock(FabricBlockSettings
            .of(Material.SOIL)
            .breakByTool(FabricToolTags.SHOVELS, 0)
            .requiresTool()
            .strength(0.6f, 0.6f)
            .sounds(BlockSoundGroup.GRAVEL));

    public static void RegisterOres() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "aquamarine_ore"), AQUAMARINE_ORE);
        ModItems.GenerateBlockItem("aquamarine_ore", AQUAMARINE_ORE);
    }
}
