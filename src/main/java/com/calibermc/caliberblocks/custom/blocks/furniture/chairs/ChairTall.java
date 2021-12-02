package com.calibermc.caliberblocks.custom.blocks.furniture.chairs;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.util.ModCalculations;
import com.google.common.base.Joiner;
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
public class ChairTall extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public ChairTall() {
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
            Block.box(11.5, 8, 11.5, 12.5, 28.5, 12.5),
            Block.box(5.5, 28.5, 11.5, 10.5, 30.5, 12.5),
            Block.box(4.5, 14.5, 11.5, 11.5, 28.5, 12.5),
            Block.box(10.5, 28.5, 11.5, 11.5, 29.5, 12.5),
            Block.box(7, 30.5, 11.5, 9, 31.5, 12.5),
            Block.box(10.5, 13.5, 11.5, 11.5, 14.5, 12.5),
            Block.box(7, 11.5, 11.5, 9, 12.5, 12.5),
            Block.box(4.5, 13.5, 11.5, 5.5, 14.5, 12.5),
            Block.box(3, 8, 2, 4, 9, 7.5),
            Block.box(5.5, 12.5, 11.5, 10.5, 14.5, 12.5),
            Block.box(12, 8, 2, 13, 9, 7.5),
            Block.box(12, 8, 7.5, 12.5, 9, 11),
            Block.box(3.5, 8, 7.5, 4, 9, 11),
            Block.box(3.5, 4, 3.5, 4.5, 5, 11.5),
            Block.box(3.5, 8, 11.5, 4.5, 28.5, 12.5),
            Block.box(9, 3, 2.5, 10, 5, 3.5),
            Block.box(3, 0, 2.5, 4, 8, 3.5),
            Block.box(4, 8, 1.5, 12, 9, 13),
            Block.box(12, 0, 2.5, 13, 8, 3.5),
            Block.box(11.5, 0, 11.5, 12.5, 8, 12.5),
            Block.box(3.5, 0, 11.5, 4.5, 8, 12.5),
            Block.box(11.5, 4, 3.5, 12.5, 5, 11.5),
            Block.box(4.5, 5, 11.5, 11.5, 6, 12.5),
            Block.box(11, 5, 2.5, 12, 6, 3.5),
            Block.box(4, 5, 2.5, 5, 6, 3.5),
            Block.box(6, 3, 2.5, 7, 5, 3.5),
            Block.box(6.5, 5, 2.5, 9.5, 6, 3.5),
            Block.box(7.5, 6, 2.5, 8.5, 7, 3.5),
            Block.box(10, 4, 2.5, 12, 5, 3.5),
            Block.box(7, 4, 2.5, 9, 5, 3.5),
            Block.box(4.5, 28.5, 11.5, 5.5, 29.5, 12.5),
            Block.box(4, 4, 2.5, 6, 5, 3.5)
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
