package com.heitorfs.hellokitty.world;

import com.heitorfs.hellokitty.Hellokitty;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class ModConfiguredFeatures {
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        
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
