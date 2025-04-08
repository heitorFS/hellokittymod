package com.heitorfs.hellokitty.datagen;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BLUE_OAK_LOG, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_BLUE_OAK_LOG, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_OAK_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLUE_OAK_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BLUE_OAK_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.RED_MAPLE_LOG, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_RED_MAPLE_LOG, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_MAPLE_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.RED_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.RED_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
