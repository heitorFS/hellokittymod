package com.heitorfs.hellokitty.datagen;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_OAK_PLANKS, 4)
                        .input(ModBlocks.BLUE_OAK_LOG)
                        .criterion(hasItem(ModBlocks.BLUE_OAK_LOG), conditionsFromItem(ModBlocks.BLUE_OAK_LOG))
                        .offerTo(recipeExporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MAPLE_PLANKS, 4)
                        .input(ModBlocks.RED_MAPLE_LOG)
                        .criterion(hasItem(ModBlocks.RED_MAPLE_LOG), conditionsFromItem(ModBlocks.RED_MAPLE_LOG))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Recipes";
    }
}
