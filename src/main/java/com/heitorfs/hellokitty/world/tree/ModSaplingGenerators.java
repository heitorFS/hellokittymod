package com.heitorfs.hellokitty.world.tree;

import com.heitorfs.hellokitty.Hellokitty;
import com.heitorfs.hellokitty.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator BLUE_OAK = new SaplingGenerator(Hellokitty.MOD_ID + ":blue_oak",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.BLUE_OAK_KEY),
            Optional.empty());

    public static final SaplingGenerator RED_MAPLE = new SaplingGenerator(Hellokitty.MOD_ID + ":red_maple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.RED_MAPLE_KEY),
            Optional.empty());
}
