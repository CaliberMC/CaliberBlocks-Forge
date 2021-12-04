package com.calibermc.caliberblocks.custom.blocks.furniture.tables;

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
public class Table extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public Table() {
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
            Block.box(1, 0, 1, 2, 14, 3),
            Block.box(1, 0, 14, 3, 14, 15),
            Block.box(1, 0, 13, 2, 14, 14),
            Block.box(2, 0, 1, 3, 14, 2),
            Block.box(13, 0, 1, 15, 14, 2),
            Block.box(14, 0, 2, 15, 14, 3),
            Block.box(14, 0, 13, 15, 14, 15),
            Block.box(13, 0, 14, 14, 14, 15),
            Block.box(0, 14, 0, 16, 14.5, 16),
            Block.box(0, 15.5, 0, 16, 16, 16),
            Block.box(0.5, 14.5, 0.5, 15.5, 15.5, 15.5)
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
