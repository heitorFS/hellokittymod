package com.heitorfs.hellokitty.world.biome;

import com.heitorfs.hellokitty.Hellokitty;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> BLUE_FOREST = registerKey("blue_forest");

    public static void bootstrap(Registerable<Biome> context)
    {
        context.register(BLUE_FOREST, blueForestBiome(context));
    }

    //region Methods

    private static RegistryKey<Biome> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(Hellokitty.MOD_ID, name));
    }

    private static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder)
    {
        DefaultBiomeFeatures.addLandCarvers(builder); // Line 19
        DefaultBiomeFeatures.addDungeons(builder); // Line 27
        DefaultBiomeFeatures.addMineables(builder); // Line 32
        DefaultBiomeFeatures.addDefaultOres(builder); // Line 56
//        DefaultBiomeFeatures.addForestGrass(builder); // Line 236
//        DefaultBiomeFeatures.addSprings(builder); // Line 388
//        DefaultBiomeFeatures.addAmethystGeodes(builder); // Line 423
    }

    //endregion

    //region Biomes

    private static Biome blueForestBiome(Registerable<Biome> context)
    {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .temperature(0.7f)
                .downfall(0.4f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .fogColor(0xadebf7)
                        .skyColor(0x9ad7e3)
                        .waterColor(0x7dcff5)
                        .waterFogColor(0x6ecefa)
                        .foliageColor(0X24569c)
                        .grassColor(0x2e70a6)
                        .build())
                .build();
    }

    //endregion
}
