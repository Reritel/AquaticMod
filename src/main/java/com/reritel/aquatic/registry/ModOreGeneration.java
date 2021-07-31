package com.reritel.aquatic.registry;

import com.reritel.aquatic.Main;
import com.reritel.aquatic.registry.generator.features.OreInOceanFeature;
import com.reritel.aquatic.registry.generator.features.OreInOceanFeatureConfig;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.Heightmap;

import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class ModOreGeneration {

    private static final Feature<OreInOceanFeatureConfig> ORE_IN_OCEAN = new OreInOceanFeature(OreInOceanFeatureConfig.CODEC);

    private static final ConfiguredFeature<?, ?> ORE_AQUAMARINE_OVERWORLD = ORE_IN_OCEAN
            .configure(new OreInOceanFeatureConfig(new SimpleBlockStateProvider(ModOres.AQUAMARINE_ORE.getDefaultState()), ConstantIntProvider.create(5)))
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.OCEAN_FLOOR)))
            .spreadHorizontally()
            .applyChance(5)
            .repeat(2);

    public static void RegisterOreGeneration() {
        Registry.register(Registry.FEATURE, new Identifier(Main.MOD_ID, "ore_in_ocean"), ORE_IN_OCEAN);

        RegistryKey<ConfiguredFeature<?, ?>> oreAquamarineOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(Main.MOD_ID, "ore_aquamarine_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAquamarineOverworld.getValue(), ORE_AQUAMARINE_OVERWORLD);

        RegistryKey[] biomes = new RegistryKey[]{
                BiomeKeys.DEEP_OCEAN,
                BiomeKeys.DEEP_COLD_OCEAN,
                BiomeKeys.DEEP_FROZEN_OCEAN,
                BiomeKeys.DEEP_LUKEWARM_OCEAN,
                BiomeKeys.DEEP_WARM_OCEAN
        };

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(biomes), GenerationStep.Feature.UNDERGROUND_ORES, oreAquamarineOverworld);
    }


}
