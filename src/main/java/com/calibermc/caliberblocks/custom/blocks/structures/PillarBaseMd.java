package com.calibermc.caliberblocks.custom.blocks.structures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**Custom block for decorations**/
public class PillarBaseMd extends Block {

    public PillarBaseMd() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .sound(SoundType.STONE)
                .noOcclusion()
                .jumpFactor(0));

    }

    private static final Optional<VoxelShape> SHAPE = Stream.of(
            Block.box(5.10051, 1, 1, 10.89949, 3.5, 15),
            Block.box(5.10051, 1, 1, 10.89949, 3.5, 15),
            Block.box(1, 1, 5.10051, 15, 3.5, 10.89949),
            Block.box(1, 1, 5.10051, 15, 3.5, 10.89949),
            Block.box(5.51472, 2, 2, 10.48528, 16, 14),
            Block.box(5.51472, 2, 2, 10.48528, 16, 14),
            Block.box(2, 2, 5.51472, 14, 16, 10.48528),
            Block.box(2, 2, 5.51472, 14, 16, 10.48528),
            Block.box(0, 0, -0.25, 16, 1, 16.25)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR));

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return SHAPE.orElse(Shapes.block());
    }

}
