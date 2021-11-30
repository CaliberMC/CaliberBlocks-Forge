package com.calibermc.caliberblocks;


import com.calibermc.caliberblocks.custom.ModRenderLayers;
import com.calibermc.caliberblocks.registry.ModBlocks;
import com.calibermc.caliberblocks.registry.ModItems;
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
    public static final Logger LOGGER = LogManager.getLogger("Caliber Blocks");

    // Order of initialization:
    // At setup:
    //   1. Registration
    //   2. Config reading (for client + common)
    //   3. FMLCommonSetupEvent
    // After world load:
    //   4. Config reading for server


    public CaliberBlocks() {
        //Registration.init();
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::setupClient);


        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

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
