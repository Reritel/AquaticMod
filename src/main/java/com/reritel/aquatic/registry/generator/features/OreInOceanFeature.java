package com.reritel.aquatic.registry.generator.features;

import com.mojang.serialization.Codec;
import com.reritel.aquatic.Main;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import org.apache.logging.log4j.Level;


public class OreInOceanFeature extends Feature<OreInOceanFeatureConfig> {
    public OreInOceanFeature(Codec<OreInOceanFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<OreInOceanFeatureConfig> context) {
        BlockPos topPos = context.level().getHeightmapPos(Heightmap.Types.OCEAN_FLOOR, context.origin()).below();

        OreInOceanFeatureConfig config = context.config();
        if (context.level().getBlockState(topPos).is(Blocks.GRAVEL)) {
            BlockState block = config.getBlock().getState(context.random(), topPos);
            IntProvider maxVein = config.getMaxVein();
            if (context.level().getBlockState(topPos.above()).is(Blocks.WATER)) {
                Main.log(Level.WARN, "Generated ore " + context.origin().toString() + " max vein " + maxVein);
                context.level().setBlock(topPos, block, 2);

                return true;
            }
        }
        return false;
    }
}
