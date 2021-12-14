package com.calibermc.caliberblocks.custom.blocks.building.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CobblestonePath extends DirtPathBlock {

    /**Custom cobblestone path blocks**/
    public CobblestonePath() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE));
    }
}
