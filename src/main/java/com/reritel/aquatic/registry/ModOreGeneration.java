package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.generator.features.OreInOceanFeature;
import com.reritel.aquatic.registry.generator.features.OreInOceanFeatureConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;

public class ModOreGeneration {

    private static final Feature<OreInOceanFeatureConfig> ORE_IN_OCEAN = new OreInOceanFeature(OreInOceanFeatureConfig.CODEC);

    private static final ConfiguredFeature<?, ?> ORE_AQUAMARINE_OVERWORLD = ORE_IN_OCEAN
            .configured(new OreInOceanFeatureConfig(new SimpleStateProvider(ModOres.AQUAMARINE_ORE.defaultBlockState()),  ConstantInt.of(5)))
//            .decorated(DecoratedDecorator.HEIGHTMAP.configured(new HeightmapDecorator(Heightmap.Types.OCEAN_FLOOR)))
            .rarity(5)
            .countRandom(5);

    public static void RegisterOreGeneration() {
        Registry.register(Registry.FEATURE, new ResourceLocation(Main.MOD_ID, "ore_in_ocean"), ORE_IN_OCEAN);

        ResourceKey<ConfiguredFeature<?, ?>> oreAquamarineOverworld = ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, new ResourceLocation(Main.MOD_ID, "ore_aquamarine_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAquamarineOverworld.location(), ORE_AQUAMARINE_OVERWORLD);

        ResourceKey[] biomes = new ResourceKey[]{
                Biomes.DEEP_OCEAN,
                Biomes.DEEP_COLD_OCEAN,
                Biomes.DEEP_FROZEN_OCEAN,
                Biomes.DEEP_LUKEWARM_OCEAN,
                Biomes.DEEP_WARM_OCEAN
        };

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(biomes), GenerationStep.Decoration.UNDERGROUND_ORES, oreAquamarineOverworld);
    }


}
