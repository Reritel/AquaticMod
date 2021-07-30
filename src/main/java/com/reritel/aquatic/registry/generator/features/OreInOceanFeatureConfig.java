package com.reritel.aquatic.registry.generator.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;


public class OreInOceanFeatureConfig implements FeatureConfig {
    public static final Codec<OreInOceanFeatureConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            BlockStateProvider.TYPE_CODEC.fieldOf("block").forGetter((config) -> config.block),
            IntProvider.VALUE_CODEC.fieldOf("maxVein").forGetter((config) -> config.maxVein)
    ).apply(instance, instance.stable(OreInOceanFeatureConfig::new)));

    private final BlockStateProvider block;
    private final IntProvider maxVein;

    public OreInOceanFeatureConfig(BlockStateProvider block, IntProvider maxVein) {
        this.block = block;
        this.maxVein = maxVein;
    }

    public BlockStateProvider getBlock() {
        return this.block;
    }
    public IntProvider getMaxVein() {
        return this.maxVein;
    }
}
