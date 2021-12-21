package com.calibermc.caliberblocks.custom.blocks.building.blocks;

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
public class StoneBattlementCorner extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public StoneBattlementCorner() {
        super(Properties.of(Material.STONE)
                .strength(2.0f,30.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
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
            Block.box(0, 0, -2, 3, 9, 0),
            Block.box(3, 0, -2, 16, 9, 3),
            Block.box(-2, 0, 0, 3, 9, 16),
            Block.box(3, 0, 3, 16, 15.96875, 16),
            Block.box(3, 15.96875, 1.25, 3, 21.75, 14.78125),
            Block.box(2.5, 21.21875, 2.46875, 9.28125, 22.71875, 9.28125),
            Block.box(1.25, 15.96875, 3, 14.78125, 21.75, 3),
            Block.box(-8, 0, -0.5, -2, 1.5, 16.5),
            Block.box(-2.5, 9, -0.5, 3, 10.5, 16.5),
            Block.box(-0.5, 9, -2.5, 16.5, 10.5, 3),
            Block.box(-0.5, 0, -8, 16.5, 1.5, -2)
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
