package com.calibermc.caliberblocks.items;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    // Registers items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CaliberBlocks.MOD_ID);
    // Items
    public static final RegistryObject<Item> DRAGON_GLASS = ITEMS.register("dragon_glass",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
