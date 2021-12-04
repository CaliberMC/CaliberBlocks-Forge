package com.calibermc.caliberblocks.custom.blocks.table_decor;

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
public class WineGlasses extends HorizontalDirectionalBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public WineGlasses() {
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
            Block.box(4.5, 0, 11, 5, 0.5, 11.5),
            Block.box(5.5, 0, 10.5, 6, 11.5, 11),
            Block.box(5, 0, 10, 5.5, 11.5, 10.5),
            Block.box(4.5, 0, 9.5, 5, 11.5, 10),
            Block.box(4, 0, 10, 4.5, 11.5, 10.5),
            Block.box(3.5, 0, 10.5, 4, 11.5, 11),
            Block.box(4, 0, 11, 4.5, 11.5, 11.5),
            Block.box(4.5, 0, 11.5, 5, 11.5, 12),
            Block.box(5, 0, 11, 5.5, 11.5, 11.5),
            Block.box(4.5, 11.5, 10, 5, 12, 10.5),
            Block.box(4.5, 11.5, 10.5, 5, 12, 11),
            Block.box(4.5, 12, 10.5, 5, 14.5, 11),
            Block.box(5, 11.5, 10.5, 5.5, 12, 11),
            Block.box(4.5, 11.5, 11, 5, 12, 11.5),
            Block.box(4, 11.5, 10.5, 4.5, 12, 11),
            Block.box(4.5, 0, 10.5, 5, 0.5, 11),
            Block.box(4.5, 0, 10, 5, 0.5, 10.5),
            Block.box(5, 0, 10.5, 5.5, 0.5, 11),
            Block.box(4, 0, 10.5, 4.5, 0.5, 11),
            Block.box(9, 0, 10, 11.5, 0.5, 12.5),
            Block.box(10, 0.5, 11, 10.5, 4, 11.5),
            Block.box(9, 3.5, 10, 11.5, 4, 12.5),
            Block.box(9, 4, 9.5, 11.5, 5.5, 10),
            Block.box(9, 4, 12.5, 11.5, 5.5, 13),
            Block.box(11.5, 4, 10, 12, 5.5, 12.5),
            Block.box(8.5, 4, 10, 9, 5.5, 12.5),
            Block.box(8.5, 5.5, 10, 9, 6.5, 12.5),
            Block.box(11.5, 5.5, 10, 12, 6.5, 12.5),
            Block.box(9, 5.5, 9.5, 11.5, 6.5, 10),
            Block.box(9, 5.5, 12.5, 11.5, 6.5, 13),
            Block.box(5.5, 5.5, 5, 6, 6.5, 7.5),
            Block.box(6, 4, 4.5, 8.5, 5.5, 5),
            Block.box(5.5, 4, 5, 6, 5.5, 7.5),
            Block.box(8.5, 4, 5, 9, 5.5, 7.5),
            Block.box(6, 4, 7.5, 8.5, 5.5, 8),
            Block.box(6, 3.5, 5, 8.5, 4, 7.5),
            Block.box(7, 0.5, 6, 7.5, 4, 6.5),
            Block.box(6, 0, 5, 8.5, 0.5, 7.5),
            Block.box(6, 5.5, 4.5, 8.5, 6.5, 5),
            Block.box(6, 5.5, 7.5, 8.5, 6.5, 8),
            Block.box(8.5, 5.5, 5, 9, 6.5, 7.5)
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
