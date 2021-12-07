package com.calibermc.caliberblocks.custom.blocks.building.doors;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ModDoorBlock extends DoorBlock {

    /**Custom door blocks**/
    public ModDoorBlock() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
                .noOcclusion()
                .jumpFactor(0));
    }
}
