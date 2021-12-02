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
public class BarrelHorizontal extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public BarrelHorizontal() {
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
            Block.box(1, 5, 0, 2, 11, 1),
            Block.box(2, 11, 0, 3, 13, 1),
            Block.box(3, 13, 0, 5, 14, 1),
            Block.box(5, 14, 0, 11, 15, 1),
            Block.box(11, 13, 0, 13, 14, 1),
            Block.box(13, 11, 0, 14, 13, 1),
            Block.box(14, 5, 0, 15, 11, 1),
            Block.box(13, 3, 0, 14, 5, 1),
            Block.box(11, 2, 0, 13, 3, 1),
            Block.box(5, 1, 0, 11, 2, 1),
            Block.box(3, 2, 0, 5, 3, 1),
            Block.box(2, 3, 0, 3, 5, 1),
            Block.box(2, 3, 15, 3, 5, 16),
            Block.box(1, 5, 15, 2, 11, 16),
            Block.box(2, 11, 15, 3, 13, 16),
            Block.box(3, 13, 15, 5, 14, 16),
            Block.box(5, 14, 15, 11, 15, 16),
            Block.box(11, 13, 15, 13, 14, 16),
            Block.box(13, 11, 15, 14, 13, 16),
            Block.box(14, 5, 15, 15, 11, 16),
            Block.box(13, 3, 15, 14, 5, 16),
            Block.box(11, 2, 15, 13, 3, 16),
            Block.box(5, 1, 15, 11, 2, 16),
            Block.box(3, 2, 15, 5, 3, 16),
            Block.box(5, 15, 4, 11, 16, 12),
            Block.box(15, 5, 4, 16, 11, 12),
            Block.box(11, 14, 4, 13, 15, 12),
            Block.box(14, 11, 4, 15, 13, 12),
            Block.box(13, 13, 4, 14, 14, 12),
            Block.box(14, 3, 4, 15, 5, 12),
            Block.box(13, 2, 4, 14, 3, 12),
            Block.box(11, 1, 4, 13, 2, 12),
            Block.box(5, 0, 4, 11, 1, 12),
            Block.box(3, 1, 4, 5, 2, 12),
            Block.box(2, 2, 4, 3, 3, 12),
            Block.box(1, 3, 4, 2, 5, 12),
            Block.box(0, 5, 4, 1, 11, 12),
            Block.box(1, 11, 4, 2, 13, 12),
            Block.box(2, 13, 4, 3, 14, 12),
            Block.box(3, 14, 4, 5, 15, 12),
            Block.box(1, 5, 11, 2, 11, 15),
            Block.box(2, 11, 11, 3, 13, 15),
            Block.box(3, 13, 11, 5, 14, 15),
            Block.box(5, 14, 11, 11, 15, 15),
            Block.box(11, 13, 11, 13, 14, 15),
            Block.box(13, 11, 11, 14, 13, 15),
            Block.box(14, 5, 11, 15, 11, 15),
            Block.box(13, 3, 11, 14, 5, 15),
            Block.box(11, 2, 11, 13, 3, 15),
            Block.box(5, 1, 11, 11, 2, 15),
            Block.box(3, 2, 11, 5, 3, 15),
            Block.box(2, 3, 11, 3, 5, 15),
            Block.box(1, 5, 1, 2, 11, 5),
            Block.box(2, 3, 1, 3, 5, 5),
            Block.box(3, 2, 1, 5, 3, 5),
            Block.box(5, 1, 1, 11, 2, 5),
            Block.box(11, 2, 1, 13, 3, 5),
            Block.box(13, 3, 1, 14, 5, 5),
            Block.box(14, 5, 1, 15, 11, 5),
            Block.box(13, 11, 1, 14, 13, 5),
            Block.box(11, 13, 1, 13, 14, 5),
            Block.box(5, 14, 1, 11, 15, 5),
            Block.box(3, 13, 1, 5, 14, 5),
            Block.box(2, 11, 1, 3, 13, 5),
            Block.box(3, 11, 1, 5, 13, 2),
            Block.box(2, 5, 1, 14, 11, 2),
            Block.box(5, 2, 1, 11, 5, 2),
            Block.box(3, 3, 1, 5, 5, 2),
            Block.box(11, 3, 1, 13, 5, 2),
            Block.box(11, 11, 1, 13, 13, 2),
            Block.box(5, 11, 1, 11, 14, 2),
            Block.box(3, 11, 14, 5, 13, 15),
            Block.box(2, 5, 14, 14, 11, 15),
            Block.box(5, 2, 14, 11, 5, 15),
            Block.box(3, 3, 14, 5, 5, 15),
            Block.box(11, 3, 14, 13, 5, 15),
            Block.box(11, 11, 14, 13, 13, 15),
            Block.box(5, 11, 14, 11, 14, 15)
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
