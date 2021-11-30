package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.custom.*;
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
    public static final RegistryObject <Block> DRAGON_GLASS_BLOCK = registerBlock("environment/dragon_glass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    // REGION SPECIFIC BLOCKS
    // - Crownlands
    // -- Kings Landing
    // --- Red Keep
    // ---- Blocks
    public static final RegistryObject <Block> RED_KEEP_BLOCK = registerBlock("building/blocks/red_keep_block", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_SMOOTH = registerBlock("building/blocks/red_keep_block_smooth", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_ORNATE = registerBlock("building/blocks/red_keep_block_ornate", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_CARVED = registerBlock("building/blocks/red_keep_block_carved", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_CRACKED = registerBlock("building/blocks/red_keep_block_cracked", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_WEATHERED = registerBlock("building/blocks/red_keep_block_weathered", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_DIRTY = registerBlock("building/blocks/red_keep_block_dirty", ModBuildingBlock::new);
    public static final RegistryObject <Block> RED_KEEP_BLOCK_MUDDY = registerBlock("building/blocks/red_keep_block_muddy", ModBuildingBlock::new);
    // ---- Slabs
    public static final RegistryObject <Block> RED_KEEP_SLAB = registerBlock("building/slabs/red_keep_slab", ModSlabBlock::new);
    public static final RegistryObject <Block> RED_KEEP_SLAB_SMOOTH = registerBlock("building/slabs/red_keep_slab_smooth", ModSlabBlock::new);
    public static final RegistryObject <Block> RED_KEEP_SLAB_CRACKED = registerBlock("building/slabs/red_keep_slab_cracked", ModSlabBlock::new);
    public static final RegistryObject <Block> RED_KEEP_SLAB_WEATHERED = registerBlock("building/slabs/red_keep_slab_weathered", ModSlabBlock::new);
    public static final RegistryObject <Block> RED_KEEP_SLAB_DIRTY = registerBlock("building/slabs/red_keep_slab_dirty", ModSlabBlock::new);
    public static final RegistryObject <Block> RED_KEEP_SLAB_MUDDY = registerBlock("building/slabs/red_keep_slab_muddy", ModSlabBlock::new);
    // ---- Stairs
    public static final RegistryObject <Block> RED_KEEP_STAIRS = registerBlock("building/stairs/red_keep_stairs",
            () -> new StairBlock(() -> RED_KEEP_BLOCK.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_SMOOTH = registerBlock("building/stairs/red_keep_stairs_smooth",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_SMOOTH.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_CRACKED = registerBlock("building/stairs/red_keep_stairs_cracked",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_CRACKED.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_WEATHERED = registerBlock("building/stairs/red_keep_stairs_weathered",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_WEATHERED.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_DIRTY = registerBlock("building/stairs/red_keep_stairs_dirty",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_DIRTY.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    public static final RegistryObject <Block> RED_KEEP_STAIRS_MUDDY = registerBlock("building/stairs/red_keep_stairs_muddy",
            () -> new StairBlock(() -> RED_KEEP_BLOCK_MUDDY.get().defaultBlockState(),
                    (BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE))));
    // ---- Walls
    public static final RegistryObject <Block> RED_KEEP_WALL = registerBlock("building/walls/red_keep_wall", ModWallBlock::new);
    public static final RegistryObject <Block> RED_KEEP_WALL_SMOOTH = registerBlock("building/walls/red_keep_wall_smooth", ModWallBlock::new);
    public static final RegistryObject <Block> RED_KEEP_WALL_CRACKED = registerBlock("building/walls/red_keep_wall_cracked", ModWallBlock::new);
    public static final RegistryObject <Block> RED_KEEP_WALL_WEATHERED = registerBlock("building/walls/red_keep_wall_weathered", ModWallBlock::new);
    public static final RegistryObject <Block> RED_KEEP_WALL_DIRTY = registerBlock("building/walls/red_keep_wall_dirty", ModWallBlock::new);
    public static final RegistryObject <Block> RED_KEEP_WALL_MUDDY = registerBlock("building/walls/red_keep_wall_muddy", ModWallBlock::new);


    // --- The Sept

    // --- Dragon Pit
    // --- Kings Landing Town
    // --- Kings Landing Towers & Wall

    // - The North
    // -- Winterfell
   // public static final RegistryObject <Block> WINTERFELL_BLOCK = registerBlock("winterfell_block", () -> new ModBuildingBlock());

    // DECORATIVE BLOCKS
    // - Barrels
    public static final RegistryObject <Block> BARREL_HORIZONTAL = registerBlock("barrels/barrel_horizontal", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_VERTICAL = registerBlock("barrels/barrel_vertical", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_EMPTY = registerBlock("barrels/barrel_empty", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_WATER = registerBlock("barrels/barrel_water", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_SALT = registerBlock("barrels/barrel_salt", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_APPLES = registerBlock("barrels/barrel_apples", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_GRAIN = registerBlock("barrels/barrel_grain", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_POTATOES = registerBlock("barrels/barrel_potatoes", ModBarrelBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);    // - Furniture

    // -- Chairs
    public static final RegistryObject <Block> CHAIR_KL_TALL = registerBlock("furniture/chairs/chair_kl_tall", ModDecorationlBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

    // -- Tables
    public static final RegistryObject <Block> TABLE_OAK = registerBlock("furniture/tables/table_oak", ModDecorationlBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

    // - Table Decor
    public static final RegistryObject <Block> WINE_GLASSES = registerBlock("table_decor/wine_glasses", ModDecorationlBlock::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

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
