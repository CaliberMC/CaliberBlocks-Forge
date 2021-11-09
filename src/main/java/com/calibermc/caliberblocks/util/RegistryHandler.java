package com.calibermc.caliberblocks.util;

import com.calibermc.caliberblocks.CaliberBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<> (ForgeRegistries.ITEMS, CaliberBlocks.MOD_ID);

    // Items
    public static final RegistryObject<Item> DRAGON_GLASS = ITEMS.register("dragon_glass", ItemBase::new);
}
