package com.heitorfs.hellokitty.datagen;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

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

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.BLUE_OAK_LEAVES)
                .add(ModBlocks.RED_MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.BLUE_OAK_STAIRS)
                .add(ModBlocks.RED_MAPLE_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.BLUE_OAK_SLAB)
                .add(ModBlocks.RED_MAPLE_SLAB);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.BLUE_OAK_BUTTON)
                .add(ModBlocks.RED_MAPLE_BUTTON);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.BLUE_OAK_PRESSURE_PLATE)
                .add(ModBlocks.RED_MAPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.BLUE_OAK_FENCE)
                .add(ModBlocks.RED_MAPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BLUE_OAK_FENCE_GATE)
                .add(ModBlocks.RED_MAPLE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.BLUE_OAK_DOOR)
                .add(ModBlocks.RED_MAPLE_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.BLUE_OAK_TRAPDOOR)
                .add(ModBlocks.RED_MAPLE_TRAPDOOR);
    }
}
