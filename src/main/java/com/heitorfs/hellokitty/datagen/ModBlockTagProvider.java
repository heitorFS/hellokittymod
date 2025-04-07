package com.heitorfs.hellokitty.datagen;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BLUE_OAK_LOG)
                .add(ModBlocks.BLUE_OAK_WOOD)
                .add(ModBlocks.STRIPPED_BLUE_OAK_LOG)
                .add(ModBlocks.STRIPPED_BLUE_OAK_WOOD)
                .add(ModBlocks.BLUE_OAK_PLANKS)
                .add(ModBlocks.RED_MAPLE_LOG)
                .add(ModBlocks.RED_MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_RED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_RED_MAPLE_WOOD)
                .add(ModBlocks.RED_MAPLE_PLANKS);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.BLUE_OAK_LOG)
                .add(ModBlocks.BLUE_OAK_WOOD)
                .add(ModBlocks.STRIPPED_BLUE_OAK_LOG)
                .add(ModBlocks.STRIPPED_BLUE_OAK_WOOD)
                .add(ModBlocks.RED_MAPLE_LOG)
                .add(ModBlocks.RED_MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_RED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_RED_MAPLE_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.BLUE_OAK_PLANKS)
                .add(ModBlocks.RED_MAPLE_PLANKS);
    }
}
