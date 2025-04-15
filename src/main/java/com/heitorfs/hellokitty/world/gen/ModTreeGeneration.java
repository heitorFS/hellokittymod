package com.heitorfs.hellokitty.world.gen;

import com.heitorfs.hellokitty.world.ModPlacedFeatures;
import com.heitorfs.hellokitty.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.BLUE_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_OAK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.RED_TAIGA), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_MAPLE_KEY);
    }
}
