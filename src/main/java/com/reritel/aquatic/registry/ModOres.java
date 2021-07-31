package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ModOres {
    static public final FallingBlock AQUAMARINE_ORE = new FallingBlock(FabricBlockSettings
            .of(Material.SAND)
            .breakByTool(FabricToolTags.SHOVELS, 0)
            .requiresTool()
            .strength(0.6f, 0.6f)
            .sounds(SoundType.GRAVEL));

    public static void RegisterOres() {
        Registry.register(Registry.BLOCK, new ResourceLocation(Main.MOD_ID, "aquamarine_ore"), AQUAMARINE_ORE);
        ModItems.GenerateBlockItem("aquamarine_ore", AQUAMARINE_ORE);
    }
}
