package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.custom.ModBarrelBlock;
import com.calibermc.caliberblocks.custom.ModBuildingBlock;
import com.calibermc.caliberblocks.custom.ModSlabBlock;
import com.calibermc.caliberblocks.custom.ModWallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class ModBlocks {
    // Creates Registry for Blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CaliberBlocks.MOD_ID);

    // ENVIRONMENT BLOCKS
    public static final RegistryObject <Block> DRAGON_GLASS_BLOCK = registerBlock("dragon_glass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    // REGION SPECIFIC BLOCKS
    // - Crownlands
    // -- Kings Landing
    // --- Red Keep
    // ---- Blocks
    public static final RegistryObject <Block> RED_KEEP_BLOCK = registerBlock("red_keep_block", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_SMOOTH = registerBlock("red_keep_block_smooth", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_ORNATE = registerBlock("red_keep_block_ornate", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_CARVED = registerBlock("red_keep_block_carved", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_CRACKED = registerBlock("red_keep_block_cracked", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_WEATHERED = registerBlock("red_keep_block_weathered", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_DIRTY = registerBlock("red_keep_block_dirty", () -> new ModBuildingBlock());
    public static final RegistryObject <Block> RED_KEEP_BLOCK_MUDDY = registerBlock("red_keep_block_muddy", () -> new ModBuildingBlock());
    // ---- Slabs
    public static final RegistryObject <Block> RED_KEEP_SLAB = registerBlock("red_keep_slab", () -> new ModSlabBlock());
    public static final RegistryObject <Block> RED_KEEP_SLAB_SMOOTH = registerBlock("red_keep_slab_smooth", () -> new ModSlabBlock());
    public static final RegistryObject <Block> RED_KEEP_SLAB_CRACKED = registerBlock("red_keep_slab_cracked", () -> new ModSlabBlock());
    public static final RegistryObject <Block> RED_KEEP_SLAB_WEATHERED = registerBlock("red_keep_slab_weathered", () -> new ModSlabBlock());
    public static final RegistryObject <Block> RED_KEEP_SLAB_DIRTY = registerBlock("red_keep_slab_dirty", () -> new ModSlabBlock());
    public static final RegistryObject <Block> RED_KEEP_SLAB_MUDDY = registerBlock("red_keep_slab_muddy", () -> new ModSlabBlock());
    // ---- Stairs
    public static final RegistryObject <Block> RED_KEEP_STAIRS = registerBlock("red_keep_stairs",
            () -> new StairBlock(() -> RED_KEEP_BLOCK.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_SMOOTH = registerBlock("red_keep_stairs_smooth",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_SMOOTH.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_CRACKED = registerBlock("red_keep_stairs_cracked",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_CRACKED.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_WEATHERED = registerBlock("red_keep_stairs_weathered",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_WEATHERED.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_DIRTY = registerBlock("red_keep_stairs_dirty",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_DIRTY.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_MUDDY = registerBlock("red_keep_stairs_muddy",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_MUDDY.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    // ---- Walls
    public static final RegistryObject <Block> RED_KEEP_WALL = registerBlock("red_keep_wall", () -> new ModWallBlock());
    public static final RegistryObject <Block> RED_KEEP_WALL_SMOOTH = registerBlock("red_keep_wall_smooth", () -> new ModWallBlock());
    public static final RegistryObject <Block> RED_KEEP_WALL_CRACKED = registerBlock("red_keep_wall_cracked", () -> new ModWallBlock());
    public static final RegistryObject <Block> RED_KEEP_WALL_WEATHERED = registerBlock("red_keep_wall_weathered", () -> new ModWallBlock());
    public static final RegistryObject <Block> RED_KEEP_WALL_DIRTY = registerBlock("red_keep_wall_dirty", () -> new ModWallBlock());
    public static final RegistryObject <Block> RED_KEEP_WALL_MUDDY = registerBlock("red_keep_wall_muddy", () -> new ModWallBlock());

    // --- The Sept

    // --- Dragon Pit
    // --- Kings Landing Town
    // --- Kings Landing Towers & Wall

    // - The North
    // -- Winterfell
    public static final RegistryObject <Block> WINTERFELL_BLOCK = registerBlock("winterfell_block", () -> new ModBuildingBlock());

    // DECORATIVE BLOCKS
    // - Barrels
    public static final RegistryObject <Block> BARREL_HORIZONTAL = registerBlock("barrel_horizontal", () -> new ModBarrelBlock(), ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_VERTICAL = registerBlock("barrel_vertical", () -> new ModBarrelBlock(), ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_EMPTY = registerBlock("barrel_empty", () -> new ModBarrelBlock(), ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_WATER = registerBlock("barrel_water", () -> new ModBarrelBlock(), ModCreativeTab.TAB_CALIBER_DECORATIONS);


    /** DO NOT MODIFY BELOW**/
    // Registers block to a selected minecraft creative tab
    private static <T extends Block> RegistryObject <T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
    return toReturn;
    }
    // Registers BlockItems
    public static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    // Registers block to Caliber Blocks inventory tab
    private static <T extends Block> RegistryObject <T> registerBlock (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    // Registers BlockItems
    public static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeTab.TAB_CALIBER_BLOCKS)));
    }
    // Registers block into game at load
    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
