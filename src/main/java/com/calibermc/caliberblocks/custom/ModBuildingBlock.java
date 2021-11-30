package com.calibermc.caliberblocks.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ModBuildingBlock extends Block {

    /**Custom building blocks**/
    public ModBuildingBlock() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
                .jumpFactor(0));
    }
}
