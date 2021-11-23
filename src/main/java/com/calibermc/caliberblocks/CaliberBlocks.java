package com.calibermc.caliberblocks;


import com.calibermc.caliberblocks.custom.ModRenderLayers;
import com.calibermc.caliberblocks.registry.ModBlocks;
import com.calibermc.caliberblocks.registry.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CaliberBlocks.MOD_ID)
public class CaliberBlocks {
    // Set MOD_ID
    public static final String MOD_ID = "caliberblocks";
    // This logger is used to write text to the console and the log file.
    private static final Logger LOGGER = LogManager.getLogger("Caliber Blocks");


    public CaliberBlocks() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }

    private void setupClient(final FMLClientSetupEvent event) {
        ModRenderLayers.Layers();
    }

}
