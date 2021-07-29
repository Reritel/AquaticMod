package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModOres {
    static public final OreBlock AQUAMARINE_ORE = new OreBlock(FabricBlockSettings
            .of(Material.SOIL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3f, 3f)
            .sounds(BlockSoundGroup.GRAVEL));

    public static void RegisterOres() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "aquamarine_ore"), AQUAMARINE_ORE);
        ModItems.GenerateBlockItem("aquamarine_ore", AQUAMARINE_ORE);
    }
}
