package com.calibermc.caliberblocks.util;

import com.calibermc.caliberblocks.registry.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

/** Sets Render Layers for various blocks **/
public class ModRenderLayers {
    public static void Layers() {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_DOOR_LG.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.KL_COBBLESTONE_DARK_PATH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.KL_COBBLESTONE_PATH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WF_COBBLESTONE_DARK_PATH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WF_COBBLESTONE_PATH.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WINDOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WINDOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WINDOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WINDOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WINDOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WINDOW.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WF_ARROW_SLIT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RK_ARROW_SLIT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PILLAR_BASE_MD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PILLAR_CENTER_MD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PILLAR_TOP_MD.get(), RenderType.cutout());

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
