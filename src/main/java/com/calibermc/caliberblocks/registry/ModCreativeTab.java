package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.registry.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    // Creative Mode Tabs
    public static final CreativeModeTab TAB_CALIBER_BLOCKS = new CreativeModeTab("caliber_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DRAGON_GLASS_BLOCK.get());
        }
    };
    public static final CreativeModeTab TAB_CALIBER_DECORATIONS = new CreativeModeTab("caliber_decorations") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.HORIZONTAL_BARREL.get());
        }
    };

}
