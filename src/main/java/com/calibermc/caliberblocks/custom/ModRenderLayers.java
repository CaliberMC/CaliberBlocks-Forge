package com.calibermc.caliberblocks.custom;

import com.calibermc.caliberblocks.registry.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

/** Sets Render Layers for various blocks **/
public class ModRenderLayers {
    public static void Layers() {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HORIZONTAL_BARREL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VERTICAL_BARREL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPTY_BARREL.get(), RenderType.cutout());
    }
}
