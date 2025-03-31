package com.heitorfs.hellokitty;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hellokitty implements ModInitializer {
	public static final String MOD_ID = "hellokitty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}