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
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_SALT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_GRAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_WATER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_APPLES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BARREL_POTATOES.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHAIR_KL_TALL.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TABLE_OAK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PARTNER_DESK.get(), RenderType.cutout());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINE_GLASSES.get(), RenderType.translucent());
    }
}
