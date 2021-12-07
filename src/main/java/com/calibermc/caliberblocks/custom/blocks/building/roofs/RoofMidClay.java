package com.calibermc.caliberblocks.custom.blocks.building.roofs;

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
public class RoofMidClay extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public RoofMidClay() {
        super(Properties.of(Material.STONE)
                .strength(2.5f,17.5f)
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
            Block.box(-0.03125, -0.0625, 0.25, 16.03125, 22.5, 0.25),
            Block.box(0, 0, 16, 16, 16, 16),
            Block.box(0, -0.0625, 0, 16, 0, 16),
            Block.box(-0.03125, -1.125, -0.4375, 0.5, 0.375, 22.15625),
            Block.box(15.5, -1.125, -0.4375, 16.03125, 0.375, 22.15625),
            Block.box(0, 0, 0.5, 0.5, 0.5, 16),
            Block.box(0, 0.5, 1, 0.5, 1, 16),
            Block.box(0, 1, 1.5, 0.5, 1.5, 16),
            Block.box(0, 1.5, 2, 0.5, 2, 16),
            Block.box(0, 2, 2.5, 0.5, 2.5, 16),
            Block.box(0, 2.5, 3, 0.5, 3, 16),
            Block.box(0, 3, 3.5, 0.5, 3.5, 16),
            Block.box(0, 3.5, 4, 0.5, 4, 16),
            Block.box(0, 4, 4.5, 0.5, 4.5, 16),
            Block.box(0, 4.5, 5, 0.5, 5, 16),
            Block.box(0, 5, 5.5, 0.5, 5.5, 16),
            Block.box(0, 5.5, 6, 0.5, 6, 16),
            Block.box(0, 6, 6.5, 0.5, 6.5, 16),
            Block.box(0, 6.5, 7, 0.5, 7, 16),
            Block.box(0, 7, 7.5, 0.5, 7.5, 16),
            Block.box(0, 7.5, 8, 0.5, 8, 16),
            Block.box(0, 8, 8.5, 0.5, 8.5, 16),
            Block.box(0, 8.5, 9, 0.5, 9, 16),
            Block.box(0, 9, 9.5, 0.5, 9.5, 16),
            Block.box(0, 9.5, 10, 0.5, 10, 16),
            Block.box(0, 10, 10.5, 0.5, 10.5, 16),
            Block.box(0, 10.5, 11, 0.5, 11, 16),
            Block.box(0, 11, 11.5, 0.5, 11.5, 16),
            Block.box(0, 11.5, 12, 0.5, 12, 16),
            Block.box(0, 12, 12.5, 0.5, 12.5, 16),
            Block.box(0, 12.5, 13, 0.5, 13, 16),
            Block.box(0, 13, 13.5, 0.5, 13.5, 16),
            Block.box(0, 13.5, 14, 0.5, 14, 16),
            Block.box(0, 14, 14.5, 0.5, 14.5, 16),
            Block.box(0, 14.5, 15, 0.5, 15, 16),
            Block.box(0, 15, 15.5, 0.5, 15.5, 16),
            Block.box(15.5, 0, 0.5, 16, 0.5, 16),
            Block.box(15.5, 0.5, 1, 16, 1, 16),
            Block.box(15.5, 1, 1.5, 16, 1.5, 16),
            Block.box(15.5, 1.5, 2, 16, 2, 16),
            Block.box(15.5, 2, 2.5, 16, 2.5, 16),
            Block.box(15.5, 2.5, 3, 16, 3, 16),
            Block.box(15.5, 3, 3.5, 16, 3.5, 16),
            Block.box(15.5, 3.5, 4, 16, 4, 16),
            Block.box(15.5, 4.5, 5, 16, 5, 16),
            Block.box(15.5, 4, 4.5, 16, 4.5, 16),
            Block.box(15.5, 5, 5.5, 16, 5.5, 16),
            Block.box(15.5, 5.5, 6, 16, 6, 16),
            Block.box(15.5, 6, 6.5, 16, 6.5, 16),
            Block.box(15.5, 6.5, 7, 16, 7, 16),
            Block.box(15.5, 7, 7.5, 16, 7.5, 16),
            Block.box(15.5, 7.5, 8, 16, 8, 16),
            Block.box(15.5, 8, 8.5, 16, 8.5, 16),
            Block.box(15.5, 8.5, 9, 16, 9, 16),
            Block.box(15.5, 9, 9.5, 16, 9.5, 16),
            Block.box(15.5, 9.5, 10, 16, 10, 16),
            Block.box(15.5, 10, 10.5, 16, 10.5, 16),
            Block.box(15.5, 10.5, 11, 16, 11, 16),
            Block.box(15.5, 11, 11.5, 16, 11.5, 16),
            Block.box(15.5, 11.5, 12, 16, 12, 16),
            Block.box(15.5, 12, 12.5, 16, 12.5, 16),
            Block.box(15.5, 12.5, 13, 16, 13, 16),
            Block.box(15.5, 13, 13.5, 16, 13.5, 16),
            Block.box(15.5, 13.5, 14, 16, 14, 16),
            Block.box(15.5, 14, 14.5, 16, 14.5, 16),
            Block.box(15.5, 14.5, 15, 16, 15, 16),
            Block.box(15.5, 15, 15.5, 16, 15.5, 16)
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
