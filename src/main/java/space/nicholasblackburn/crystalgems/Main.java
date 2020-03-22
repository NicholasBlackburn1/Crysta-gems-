package space.nicholasblackburn.crystalgems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistryEntry;
import space.nicholasblackburn.crystalgems.Registries.ModEventSubscriber;

@Mod(Main.MODID)

public class Main {
    
    public static final String MODID = "crystalgems";

    public static final Logger Logger = LogManager.getLogger(MODID);

    public Main() {
        
        Logger.debug("Hello from Crystal gems and Steven");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    
    }

    private void setup(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new ModEventSubscriber());
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new ModEventSubscriber());
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new ModEventSubscriber());

    }


    

}