package com.heitorfs.hellokitty.world.biome;

import com.heitorfs.hellokitty.Hellokitty;
import com.heitorfs.hellokitty.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(Hellokitty.MOD_ID, "overworld"), 3));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Hellokitty.MOD_ID, ModMaterialRules.makeRules());
    }
}
