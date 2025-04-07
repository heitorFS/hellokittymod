package com.heitorfs.hellokitty;

import com.heitorfs.hellokitty.block.ModBlocks;
import com.heitorfs.hellokitty.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hellokitty implements ModInitializer {
	public static final String MOD_ID = "hellokitty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(ModBlocks.BLUE_OAK_LOG, ModBlocks.STRIPPED_BLUE_OAK_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLUE_OAK_WOOD, ModBlocks.STRIPPED_BLUE_OAK_WOOD);
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_OAK_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_OAK_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLUE_OAK_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BLUE_OAK_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_OAK_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_OAK_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_OAK_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_RED_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MAPLE_LEAVES, 30, 60);
	}
}