package com.reritel.aquatic.registry.generator.features;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;


public class OreInOceanFeatureConfig implements FeatureConfiguration {
    public static final Codec<OreInOceanFeatureConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            BlockStateProvider.CODEC.fieldOf("block").forGetter((config) -> config.block),
            IntProvider.CODEC.fieldOf("maxVein").forGetter((config) -> config.maxVein)
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
