package com.calibermc.caliberblocks.block;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.items.ModCreativeModeTab;
import com.calibermc.caliberblocks.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class ModBlocks {
    // Registers blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CaliberBlocks.MOD_ID);

    // ENVIRONMENT BLOCKS
    public static final RegistryObject <Block> DRAGON_GLASS_BLOCK = registerBlock("dragon_glass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    // REGION SPECIFIC BLOCKS
    // - Crownlands
    // -- Kings Landing
    // --- Red Keep
    public static final RegistryObject <Block> RED_KEEP_BLOCK = registerBlock("red_keep_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_SMOOTH = registerBlock("red_keep_block_smooth",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_ORNATE = registerBlock("red_keep_block_ornate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_CARVED = registerBlock("red_keep_block_carved",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_CRACKED = registerBlock("red_keep_block_cracked",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_WEATHERED = registerBlock("red_keep_block_weathered",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_DIRTY = registerBlock("red_keep_block_dirty",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject <Block> RED_KEEP_BLOCK_MUDDY = registerBlock("red_keep_block_muddy",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    // --- The Sept

    // --- Dragon Pit
    // --- Kings Landing Town
    // --- Kings Landing Towers & Wall

    // - The North
    // -- Winterfell
    public static final RegistryObject <Block> WINTERFELL_BLOCK = registerBlock("winterfell_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.0f,30.0f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    // DECORATIVE BLOCKS
    // - Barrels
    public static final RegistryObject <Block> HORIZONTAL_BARREL = registerBlock("horizontal_barrel",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f,17.5f).sound(SoundType.WOOD)),ModCreativeModeTab.CALIBER_DECORATIONS_GROUP);
    public static final RegistryObject <Block> VERTICAL_BARREL = registerBlock("vertical_barrel",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f,17.5f).sound(SoundType.WOOD)),ModCreativeModeTab.CALIBER_DECORATIONS_GROUP);
    public static final RegistryObject <Block> EMPTY_BARREL = registerBlock("empty_barrel",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f,17.5f).sound(SoundType.WOOD)),ModCreativeModeTab.CALIBER_DECORATIONS_GROUP);




    // Registers block to a selected minecraft creative tab
    private static <T extends Block> RegistryObject <T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
    return toReturn;
    }
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
    public static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.CALIBER_BLOCKS_GROUP)));
    }



    // Registers block into game
    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
