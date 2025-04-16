package com.heitorfs.hellokitty.datagen;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLUE_OAK_LOG);
        addDrop(ModBlocks.BLUE_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_BLUE_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_BLUE_OAK_WOOD);
        addDrop(ModBlocks.BLUE_OAK_PLANKS);
        addDrop(ModBlocks.BLUE_OAK_STAIRS);
        addDrop(ModBlocks.BLUE_OAK_BUTTON);
        addDrop(ModBlocks.BLUE_OAK_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_OAK_FENCE);
        addDrop(ModBlocks.BLUE_OAK_FENCE_GATE);
        addDrop(ModBlocks.BLUE_OAK_TRAPDOOR);

        addDrop(ModBlocks.BLUE_OAK_DOOR, doorDrops(ModBlocks.BLUE_OAK_DOOR));
        addDrop(ModBlocks.BLUE_OAK_SLAB, slabDrops(ModBlocks.BLUE_OAK_SLAB));

        addDrop(ModBlocks.RED_MAPLE_LOG);
        addDrop(ModBlocks.RED_MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_RED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_RED_MAPLE_WOOD);
        addDrop(ModBlocks.RED_MAPLE_PLANKS);
        addDrop(ModBlocks.RED_MAPLE_STAIRS);
        addDrop(ModBlocks.RED_MAPLE_BUTTON);
        addDrop(ModBlocks.RED_MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_MAPLE_FENCE);
        addDrop(ModBlocks.RED_MAPLE_FENCE_GATE);
        addDrop(ModBlocks.RED_MAPLE_TRAPDOOR);

        addDrop(ModBlocks.RED_MAPLE_DOOR, doorDrops(ModBlocks.RED_MAPLE_DOOR));
        addDrop(ModBlocks.RED_MAPLE_SLAB, slabDrops(ModBlocks.RED_MAPLE_SLAB));

        addDrop(ModBlocks.BLUE_OAK_LEAVES, leavesDrops(ModBlocks.BLUE_OAK_LEAVES, ModBlocks.BLUE_OAK_SAPLING, 0.0625f));
        addDrop(ModBlocks.RED_MAPLE_LEAVES, leavesDrops(ModBlocks.RED_MAPLE_LEAVES, ModBlocks.RED_MAPLE_SAPLING, 0.1f));
    }
}
