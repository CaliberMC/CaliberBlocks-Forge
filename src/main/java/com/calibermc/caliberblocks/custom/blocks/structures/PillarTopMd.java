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
public class PillarTopMd extends Block {

    public PillarTopMd() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .sound(SoundType.STONE)
                .noOcclusion()
                .jumpFactor(0));

    }

    private static final Map<Direction,VoxelShape> SHAPES = new EnumMap<>(Direction.class);

    private static final Optional<VoxelShape> SHAPE = Stream.of(
            Block.box(1.5, 7, 5.30761, 14.5, 10, 10.69239),
            Block.box(5.30761, 7, 1.5, 10.69239, 10, 14.5),
            Block.box(5.30761, 7, 1.5, 10.69239, 10, 14.5),
            Block.box(1.5, 7, 5.30761, 14.5, 10, 10.69239),
            Block.box(1, 10, 5.10051, 15, 12.5, 10.89949),
            Block.box(5.10051, 10, 1, 10.89949, 12.5, 15),
            Block.box(5.10051, 10, 1, 10.89949, 12.5, 15),
            Block.box(1, 10, 5.10051, 15, 12.5, 10.89949),
            Block.box(2, 0, 5.51472, 14, 15, 10.48528),
            Block.box(5.51472, 0, 2, 10.48528, 15, 14),
            Block.box(5.51472, 0, 2, 10.48528, 15, 14),
            Block.box(2, 0, 5.51472, 14, 15, 10.48528),
            Block.box(0, 15, 0, 16, 16, 16)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR));


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return SHAPE.orElse(Shapes.block());
    }

}
