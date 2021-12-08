package com.calibermc.caliberblocks.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    // Creative Mode Tabs
    public static final CreativeModeTab TAB_CALIBER_BLOCKS = new CreativeModeTab("caliber_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RK_SANDSTONE.get());
        }
    };
    public static final CreativeModeTab TAB_CALIBER_DECORATIONS = new CreativeModeTab("caliber_decorations") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BARREL_HORIZONTAL.get());
        }
    };

}
