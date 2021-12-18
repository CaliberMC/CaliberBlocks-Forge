package com.calibermc.caliberblocks.custom.blocks.building.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ModPathBlock extends DirtPathBlock {

    /**Custom cobblestone path blocks**/
    public ModPathBlock() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE));
    }
}