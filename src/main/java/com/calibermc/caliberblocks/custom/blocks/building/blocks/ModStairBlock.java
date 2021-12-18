package com.calibermc.caliberblocks.custom.blocks.building.blocks;


import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;



public class ModStairBlock extends StairBlock {

    /**Custom stair blocks**/

    public ModStairBlock(BlockState baseBlockState) {
        super(baseBlockState, Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE));
    }


}
