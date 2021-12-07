package com.calibermc.caliberblocks.custom.blocks.building.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.material.Material;

public class ModWallBlock extends WallBlock {

    /**Custom building blocks**/
    public ModWallBlock() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE));
    }
}
