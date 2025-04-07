package com.heitorfs.hellokitty.world;

import com.heitorfs.hellokitty.Hellokitty;
import com.heitorfs.hellokitty.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_OAK_KEY = registerKey("blue_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_KEY = registerKey("red_maple");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        register(context, BLUE_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.BLUE_OAK_LOG),
                new StraightTrunkPlacer(4, 2, 0),

                BlockStateProvider.of(ModBlocks.BLUE_OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, RED_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.RED_MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 0),

                BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(1, 0, 1)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Hellokitty.MOD_ID, name));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC config)
    {

    }
}
