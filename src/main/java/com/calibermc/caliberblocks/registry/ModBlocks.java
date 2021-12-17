package com.calibermc.caliberblocks.registry;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.custom.blocks.barrels.BarrelHorizontal;
import com.calibermc.caliberblocks.custom.blocks.barrels.BarrelVertical;
import com.calibermc.caliberblocks.custom.blocks.building.blocks.*;
import com.calibermc.caliberblocks.custom.blocks.building.doors.ModDoorBlock;
import com.calibermc.caliberblocks.custom.blocks.furniture.chairs.ChairTall;
import com.calibermc.caliberblocks.custom.blocks.furniture.tables.PartnerDesk;
import com.calibermc.caliberblocks.custom.blocks.furniture.tables.Table;
import com.calibermc.caliberblocks.custom.blocks.structures.PillarBaseMd;
import com.calibermc.caliberblocks.custom.blocks.structures.PillarCenterMd;
import com.calibermc.caliberblocks.custom.blocks.structures.PillarTopMd;
import com.calibermc.caliberblocks.custom.blocks.table_decor.WineGlasses;
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

    // UNIVERSAL BLOCKS
    // - Building
    // -- Roads
    public static final RegistryObject <Block> COBBLESTONE_PATH = registerBlock("building/blocks/cobblestone_path", CobblestonePath::new);
    public static final RegistryObject <Block> COBBLESTONE_DARK_PATH = registerBlock("building/blocks/cobblestone_path_dark", CobblestonePath::new);
    // -- Blocks

    public static final RegistryObject <Block> STONE_SM = registerBlock("building/blocks/stone_sm", BuildingBlock::new);
    public static final RegistryObject <Block> STONE_SM_MOSSY = registerBlock("building/blocks/stone_sm_mossy", BuildingBlock::new);
    public static final RegistryObject <Block> STONE_SM_CARVED = registerBlock("building/blocks/stone_sm_carved", BuildingBlock::new);
    public static final RegistryObject <Block> STONE_SM_CRACKED = registerBlock("building/blocks/stone_sm_cracked", BuildingBlock::new);
    public static final RegistryObject <Block> STONE_SM_DIRTY = registerBlock("building/blocks/stone_sm_dirty", BuildingBlock::new);
    public static final RegistryObject <Block> STONE_SM_MUDDY = registerBlock("building/blocks/stone_sm_muddy", BuildingBlock::new);
    public static final RegistryObject <Block> COBBLESTONE_DARK = registerBlock("building/blocks/cobblestone_dark", BuildingBlock::new);

    public static final RegistryObject <Block> STONE_SM_ARROW_SLIT = registerBlock("building/blocks/stone_sm_arrow_slit", ArrowSlit::new);

    // -- Slabs
    public static final RegistryObject <Block> STONE_SM_SLAB = registerBlock("building/slabs/stone_sm_slab", ModSlabBlock::new);
    public static final RegistryObject <Block> STONE_SM_SLAB_MOSSY = registerBlock("building/slabs/stone_sm_slab_mossy", ModSlabBlock::new);
    public static final RegistryObject <Block> STONE_SM_SLAB_CRACKED = registerBlock("building/slabs/stone_sm_slab_cracked", ModSlabBlock::new);
    public static final RegistryObject <Block> STONE_SM_SLAB_DIRTY = registerBlock("building/slabs/stone_sm_slab_dirty", ModSlabBlock::new);
    public static final RegistryObject <Block> STONE_SM_SLAB_MUDDY = registerBlock("building/slabs/stone_sm_slab_muddy", ModSlabBlock::new);
    // -- Stairs
    public static final RegistryObject <Block> STONE_SM_STAIRS = registerBlock("building/stairs/stone_sm_stairs", () -> new ModStairBlock (ModBlocks.STONE_SM.get().defaultBlockState()));
    public static final RegistryObject <Block> STONE_SM_STAIRS_MOSSY = registerBlock("building/stairs/stone_sm_stairs_mossy", () -> new ModStairBlock(ModBlocks.STONE_SM_MOSSY.get().defaultBlockState()));
    public static final RegistryObject <Block> STONE_SM_STAIRS_CRACKED = registerBlock("building/stairs/stone_small_stairs_cracked", () -> new ModStairBlock(ModBlocks.STONE_SM_CRACKED.get().defaultBlockState()));
    public static final RegistryObject <Block> STONE_SM_STAIRS_DIRTY = registerBlock("building/stairs/stone_sm_stairs_dirty", () -> new ModStairBlock(ModBlocks.STONE_SM_DIRTY.get().defaultBlockState()));
    public static final RegistryObject <Block> STONE_SM_STAIRS_MUDDY = registerBlock("building/stairs/stone_sm_stairs_muddy", () -> new ModStairBlock(ModBlocks.STONE_SM_MUDDY.get().defaultBlockState()));
    // -- Walls
    public static final RegistryObject <Block> STONE_SM_WALL = registerBlock("building/walls/stone_sm_wall", ModWallBlock::new);
    public static final RegistryObject <Block> STONE_SM_WALL_MOSSY = registerBlock("building/walls/stone_sm_wall_mossy", ModWallBlock::new);
    public static final RegistryObject <Block> STONE_SM_WALL_CRACKED = registerBlock("building/walls/stone_sm_wall_cracked", ModWallBlock::new);
    public static final RegistryObject <Block> STONE_SM_WALL_DIRTY = registerBlock("building/walls/stone_sm_wall_dirty", ModWallBlock::new);
    public static final RegistryObject <Block> STONE_SM_WALL_MUDDY = registerBlock("building/walls/stone_sm_wall_muddy", ModWallBlock::new);

    // -- Doors
    public static final RegistryObject <Block> OAK_DOOR_LG = registerBlock("building/blocks/oak_door_lg", ModDoorBlock::new);

    // -- Windows
    public static final RegistryObject <Block> ACACIA_WINDOW = registerBlock("building/windows/acacia_window", ArrowSlit::new);
    public static final RegistryObject <Block> BIRCH_WINDOW = registerBlock("building/windows/birch_window", ArrowSlit::new);
    public static final RegistryObject <Block> DARK_OAK_WINDOW = registerBlock("building/windows/dark_oak_window", ArrowSlit::new);
    public static final RegistryObject <Block> JUNGLE_WINDOW = registerBlock("building/windows/jungle_window", ArrowSlit::new);
    public static final RegistryObject <Block> OAK_WINDOW = registerBlock("building/windows/oak_window", ArrowSlit::new);
    public static final RegistryObject <Block> SPRUCE_WINDOW = registerBlock("building/windows/spruce_window", ArrowSlit::new);

    // REGION SPECIFIC BLOCKS
    // - Crownlands
    // -- Kings Landing
    // --- Roads
    public static final RegistryObject <Block> KL_COBBLESTONE_PATH = registerBlock("building/blocks/kl_cobblestone_path", CobblestonePath::new);
    public static final RegistryObject <Block> KL_COBBLESTONE_DARK_PATH = registerBlock("building/blocks/kl_cobblestone_path_dark", CobblestonePath::new);

    // --- Red Keep
    // ---- Blocks
    public static final RegistryObject <Block> RK_SANDSTONE = registerBlock("building/blocks/rk_sandstone", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_SMOOTH = registerBlock("building/blocks/rk_sandstone_smooth", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_ORNATE = registerBlock("building/blocks/rk_sandstone_ornate", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_CARVED = registerBlock("building/blocks/rk_sandstone_carved", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_CRACKED = registerBlock("building/blocks/rk_sandstone_cracked", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_WEATHERED = registerBlock("building/blocks/rk_sandstone_weathered", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_DIRTY = registerBlock("building/blocks/rk_sandstone_dirty", BuildingBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_MUDDY = registerBlock("building/blocks/rk_sandstone_muddy", BuildingBlock::new);
    public static final RegistryObject <Block> KL_COBBLESTONE = registerBlock("building/blocks/kl_cobblestone", BuildingBlock::new);
    public static final RegistryObject <Block> KL_COBBLESTONE_DARK = registerBlock("building/blocks/kl_cobblestone_dark", BuildingBlock::new);

    public static final RegistryObject <Block> RK_ARROW_SLIT = registerBlock("building/blocks/rk_arrow_slit", ArrowSlit::new);

    // ---- Slabs
    public static final RegistryObject <Block> RK_SANDSTONE_SLAB = registerBlock("building/slabs/rk_sandstone_slab", ModSlabBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_SLAB_SMOOTH = registerBlock("building/slabs/rk_sandstone_slab_smooth", ModSlabBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_SLAB_CRACKED = registerBlock("building/slabs/rk_sandstone_slab_cracked", ModSlabBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_SLAB_WEATHERED = registerBlock("building/slabs/rk_sandstone_slab_weathered", ModSlabBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_SLAB_DIRTY = registerBlock("building/slabs/rk_sandstone_slab_dirty", ModSlabBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_SLAB_MUDDY = registerBlock("building/slabs/rk_sandstone_slab_muddy", ModSlabBlock::new);
    // ---- Stairs
    public static final RegistryObject <Block> RK_SANDSTONE_STAIRS = registerBlock("building/stairs/rk_sandstone_stairs", () -> new ModStairBlock (ModBlocks.RK_SANDSTONE.get().defaultBlockState()));
    public static final RegistryObject <Block> RK_SANDSTONE_STAIRS_SMOOTH = registerBlock("building/stairs/rk_sandstone_stairs_smooth", () -> new ModStairBlock(ModBlocks.RK_SANDSTONE_SMOOTH.get().defaultBlockState()));
    public static final RegistryObject <Block> RK_SANDSTONE_STAIRS_CRACKED = registerBlock("building/stairs/rk_sandstone_stairs_cracked", () -> new ModStairBlock(ModBlocks.RK_SANDSTONE_CRACKED.get().defaultBlockState()));
    public static final RegistryObject <Block> RK_SANDSTONE_STAIRS_WEATHERED = registerBlock("building/stairs/rk_sandstone_stairs_weathered", () -> new ModStairBlock(ModBlocks.RK_SANDSTONE_WEATHERED.get().defaultBlockState()));
    public static final RegistryObject <Block> RK_SANDSTONE_STAIRS_DIRTY = registerBlock("building/stairs/rk_sandstone_stairs_dirty", () -> new ModStairBlock(ModBlocks.RK_SANDSTONE_DIRTY.get().defaultBlockState()));
    public static final RegistryObject <Block> RK_SANDSTONE_STAIRS_MUDDY = registerBlock("building/stairs/rk_sandstone_stairs_muddy", () -> new ModStairBlock(ModBlocks.RK_SANDSTONE_MUDDY.get().defaultBlockState()));
    // ---- Walls
    public static final RegistryObject <Block> RK_SANDSTONE_WALL = registerBlock("building/walls/rk_sandstone_wall", ModWallBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_WALL_SMOOTH = registerBlock("building/walls/rk_sandstone_wall_smooth", ModWallBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_WALL_CRACKED = registerBlock("building/walls/rk_sandstone_wall_cracked", ModWallBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_WALL_WEATHERED = registerBlock("building/walls/rk_sandstone_wall_weathered", ModWallBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_WALL_DIRTY = registerBlock("building/walls/rk_sandstone_wall_dirty", ModWallBlock::new);
    public static final RegistryObject <Block> RK_SANDSTONE_WALL_MUDDY = registerBlock("building/walls/rk_sandstone_wall_muddy", ModWallBlock::new);


    // --- The Sept

    // --- Dragon Pit
    // --- Kings Landing Town
    // --- Kings Landing Towers & Wall

    // - The North
    // -- Winterfell



    // Structures
    public static final RegistryObject <Block> PILLAR_BASE_MD = registerBlock("structures/pillar_base_md", PillarBaseMd::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> PILLAR_CENTER_MD = registerBlock("structures/pillar_center_md", PillarCenterMd::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> PILLAR_TOP_MD = registerBlock("structures/pillar_top_md", PillarTopMd::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

    // DECORATIVE BLOCKS
    // - Barrels
    public static final RegistryObject <Block> BARREL_HORIZONTAL = registerBlock("barrels/barrel_horizontal", BarrelHorizontal::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_VERTICAL = registerBlock("barrels/barrel_vertical", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_EMPTY = registerBlock("barrels/barrel_empty", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_WATER = registerBlock("barrels/barrel_water", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_SALT = registerBlock("barrels/barrel_salt", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_APPLES = registerBlock("barrels/barrel_apples", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_GRAIN = registerBlock("barrels/barrel_grain", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> BARREL_POTATOES = registerBlock("barrels/barrel_potatoes", BarrelVertical::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);    // - Furniture

    // -- Chairs
    public static final RegistryObject <Block> CHAIR_KL_TALL = registerBlock("furniture/chairs/chair_kl_tall", ChairTall::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

    // -- Tables
    public static final RegistryObject <Block> TABLE_OAK = registerBlock("furniture/tables/table_oak", Table::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);
    public static final RegistryObject <Block> PARTNER_DESK = registerBlock("furniture/tables/partner_desk", PartnerDesk::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

    // - Table Decor
    public static final RegistryObject <Block> WINE_GLASSES = registerBlock("table_decor/wine_glasses", WineGlasses::new, ModCreativeTab.TAB_CALIBER_DECORATIONS);

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
