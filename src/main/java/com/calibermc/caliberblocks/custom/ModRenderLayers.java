package com.calibermc.caliberblocks.custom;

import com.calibermc.caliberblocks.registry.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

/** Sets Render Layers for various blocks **/
public class ModRenderLayers {
    public static void Layers() {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_HORIZONTAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_VERTICAL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_EMPTY.get(), RenderType.cutout());
    }
}
