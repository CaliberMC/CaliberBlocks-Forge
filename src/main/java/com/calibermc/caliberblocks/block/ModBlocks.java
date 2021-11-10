package com.calibermc.caliberblocks.block;

import com.calibermc.caliberblocks.CaliberBlocks;
import com.calibermc.caliberblocks.items.ModCreativeModeTab;
import com.calibermc.caliberblocks.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

    // Blocks
    public static final RegistryObject <Block> DRAGON_GLASS_BLOCK = registerBlock("dragon_glass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5.0f,30.0f)));



    // Registers block using a selected minecraft creative tab
    private static <T extends Block> RegistryObject <T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
    return toReturn;
    }
    public static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    // Registers blocks under Caliber Blocks inventory tab
    private static <T extends Block> RegistryObject <T> registerBlock (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem (String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.CALIBER_BLOCKS_GROUP)));

    }
    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
