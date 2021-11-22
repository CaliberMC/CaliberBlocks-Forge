package com.calibermc.caliberblocks.items;

import com.calibermc.caliberblocks.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    //public static final CreativeModeTab CALIBER_ITEMS_GROUP = new CreativeModeTab("caliber_items") {
    //    @Override
    //    public ItemStack makeIcon() {
    //        return new ItemStack(ModItems.DRAGON_GLASS.get());
    //    }
    //};

    // Group Inventory Stacks
    public static final CreativeModeTab CALIBER_BLOCKS_GROUP = new CreativeModeTab("caliber_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.DRAGON_GLASS_BLOCK.get());
        }
    };
    public static final CreativeModeTab CALIBER_DECORATIONS_GROUP = new CreativeModeTab("caliber_decorations") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.HORIZONTAL_BARREL.get());
        }
    };
}
