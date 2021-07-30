package com.reritel.aquatic.registry.generator.features;

import com.mojang.serialization.Codec;
import com.reritel.aquatic.Main;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import org.apache.logging.log4j.Level;


public class OreInOceanFeature extends Feature<OreInOceanFeatureConfig> {
    public OreInOceanFeature(Codec<OreInOceanFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<OreInOceanFeatureConfig> context) {
        int i = 0;
        BlockPos topPos = context.getWorld().getTopPosition(Heightmap.Type.OCEAN_FLOOR, context.getOrigin()).down();

        OreInOceanFeatureConfig config = context.getConfig();
        boolean gravel = context.getWorld().getBlockState(topPos.down()).isOf(Blocks.GRAVEL);
        if (context.getWorld().getBlockState(topPos).isOf(Blocks.GRAVEL)) {
            BlockState block = config.getBlock().getBlockState(context.getRandom(), topPos);
            int maxVein = config.getMaxVein().get(context.getRandom());
            if (context.getWorld().getBlockState(topPos.up()).isOf(Blocks.WATER) && block.canPlaceAt(context.getWorld(), topPos)) {
                Main.log(Level.WARN, "Generated ore " + context.getOrigin().toString() + " max vein " + maxVein);
                context.getWorld().setBlockState(topPos, block, 2);

                ++i;
            }

        }

        return i > 0;
    }

}
