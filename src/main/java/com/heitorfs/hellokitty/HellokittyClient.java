package com.heitorfs.hellokitty;

import com.heitorfs.hellokitty.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class HellokittyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_MAPLE_SAPLING, RenderLayer.getCutout());
    }
}
