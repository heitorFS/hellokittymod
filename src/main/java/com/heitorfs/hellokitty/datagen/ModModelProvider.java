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
        BlockStateModelGenerator.BlockTexturePool blueOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_OAK_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLUE_OAK_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.BLUE_OAK_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blueOakPlanksTexturePool.stairs(ModBlocks.BLUE_OAK_STAIRS);
        blueOakPlanksTexturePool.slab(ModBlocks.BLUE_OAK_SLAB);
        blueOakPlanksTexturePool.button(ModBlocks.BLUE_OAK_BUTTON);
        blueOakPlanksTexturePool.pressurePlate(ModBlocks.BLUE_OAK_PRESSURE_PLATE);
        blueOakPlanksTexturePool.fence(ModBlocks.BLUE_OAK_FENCE);
        blueOakPlanksTexturePool.fenceGate(ModBlocks.BLUE_OAK_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_OAK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_OAK_TRAPDOOR);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.RED_MAPLE_LOG, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_RED_MAPLE_LOG, TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        BlockStateModelGenerator.BlockTexturePool redMaplePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.RED_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.RED_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        redMaplePlanksTexturePool.stairs(ModBlocks.RED_MAPLE_STAIRS);
        redMaplePlanksTexturePool.slab(ModBlocks.RED_MAPLE_SLAB);
        redMaplePlanksTexturePool.button(ModBlocks.RED_MAPLE_BUTTON);
        redMaplePlanksTexturePool.pressurePlate(ModBlocks.RED_MAPLE_PRESSURE_PLATE);
        redMaplePlanksTexturePool.fence(ModBlocks.RED_MAPLE_FENCE);
        redMaplePlanksTexturePool.fenceGate(ModBlocks.RED_MAPLE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.RED_MAPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.RED_MAPLE_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
