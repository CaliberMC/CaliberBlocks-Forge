package com.calibermc.caliberblocks.custom.blocks.barrels;

import com.calibermc.caliberblocks.util.ModCalculations;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
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
public class BarrelVertical extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BarrelVertical() {
        super(Properties.of(Material.WOOD)
                .strength(2.5f,17.5f)
                .sound(SoundType.WOOD)
                .noOcclusion()
                .jumpFactor(0));

        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        runCalculation(SHAPE.orElse(Shapes.block()));
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    private static final Map<Direction,VoxelShape> SHAPES = new EnumMap<>(Direction.class);

    private static final Optional<VoxelShape> SHAPE = Stream.of(
            Block.box(5, 1, 11, 11, 2, 14),
            Block.box(11, 1, 11, 13, 2, 13),
            Block.box(11, 1, 3, 13, 2, 5),
            Block.box(3, 1, 3, 5, 2, 5),
            Block.box(3, 1, 11, 5, 2, 13),
            Block.box(2, 1, 5, 14, 2, 11),
            Block.box(5, 1, 2, 11, 2, 5),
            Block.box(3, 14, 11, 5, 15, 13),
            Block.box(2, 14, 5, 14, 15, 11),
            Block.box(5, 14, 2, 11, 15, 5),
            Block.box(3, 14, 3, 5, 15, 5),
            Block.box(11, 14, 3, 13, 15, 5),
            Block.box(11, 14, 11, 13, 15, 13),
            Block.box(5, 14, 11, 11, 15, 14),
            Block.box(1, 11, 5, 2, 15, 11),
            Block.box(2, 11, 3, 3, 15, 5),
            Block.box(3, 11, 2, 5, 15, 3),
            Block.box(5, 11, 1, 11, 15, 2),
            Block.box(11, 11, 2, 13, 15, 3),
            Block.box(13, 11, 3, 14, 15, 5),
            Block.box(14, 11, 5, 15, 15, 11),
            Block.box(13, 11, 11, 14, 15, 13),
            Block.box(11, 11, 13, 13, 15, 14),
            Block.box(5, 11, 14, 11, 15, 15),
            Block.box(3, 11, 13, 5, 15, 14),
            Block.box(2, 11, 11, 3, 15, 13),
            Block.box(1, 1, 5, 2, 5, 11),
            Block.box(2, 1, 11, 3, 5, 13),
            Block.box(3, 1, 13, 5, 5, 14),
            Block.box(5, 1, 14, 11, 5, 15),
            Block.box(11, 1, 13, 13, 5, 14),
            Block.box(13, 1, 11, 14, 5, 13),
            Block.box(14, 1, 5, 15, 5, 11),
            Block.box(13, 1, 3, 14, 5, 5),
            Block.box(11, 1, 2, 13, 5, 3),
            Block.box(5, 1, 1, 11, 5, 2),
            Block.box(3, 1, 2, 5, 5, 3),
            Block.box(2, 1, 3, 3, 5, 5),
            Block.box(3, 4, 14, 5, 12, 15),
            Block.box(5, 4, 15, 11, 12, 16),
            Block.box(15, 4, 5, 16, 12, 11),
            Block.box(11, 4, 14, 13, 12, 15),
            Block.box(14, 4, 11, 15, 12, 13),
            Block.box(13, 4, 13, 14, 12, 14),
            Block.box(14, 4, 3, 15, 12, 5),
            Block.box(13, 4, 2, 14, 12, 3),
            Block.box(11, 4, 1, 13, 12, 2),
            Block.box(5, 4, 0, 11, 12, 1),
            Block.box(3, 4, 1, 5, 12, 2),
            Block.box(2, 4, 2, 3, 12, 3),
            Block.box(1, 4, 3, 2, 12, 5),
            Block.box(0, 4, 5, 1, 12, 11),
            Block.box(1, 4, 11, 2, 12, 13),
            Block.box(2, 4, 13, 3, 12, 14),
            Block.box(2, 0, 3, 3, 1, 5),
            Block.box(1, 0, 5, 2, 1, 11),
            Block.box(2, 0, 11, 3, 1, 13),
            Block.box(3, 0, 13, 5, 1, 14),
            Block.box(5, 0, 14, 11, 1, 15),
            Block.box(11, 0, 13, 13, 1, 14),
            Block.box(13, 0, 11, 14, 1, 13),
            Block.box(14, 0, 5, 15, 1, 11),
            Block.box(13, 0, 3, 14, 1, 5),
            Block.box(11, 0, 2, 13, 1, 3),
            Block.box(5, 0, 1, 11, 1, 2),
            Block.box(3, 0, 2, 5, 1, 3),
            Block.box(2, 15, 3, 3, 16, 5),
            Block.box(1, 15, 5, 2, 16, 11),
            Block.box(2, 15, 11, 3, 16, 13),
            Block.box(3, 15, 13, 5, 16, 14),
            Block.box(5, 15, 14, 11, 16, 15),
            Block.box(11, 15, 13, 13, 16, 14),
            Block.box(13, 15, 11, 14, 16, 13),
            Block.box(14, 15, 5, 15, 16, 11),
            Block.box(13, 15, 3, 14, 16, 5),
            Block.box(11, 15, 2, 13, 16, 3),
            Block.box(5, 15, 1, 11, 16, 2),
            Block.box(3, 15, 2, 5, 16, 3)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR));

    protected void runCalculation(VoxelShape shape) {
        for (Direction direction : Direction.values())
            SHAPES.put(direction, ModCalculations.calculateShapes(direction, shape));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return SHAPES.get(state.getValue(FACING));
    }

}
