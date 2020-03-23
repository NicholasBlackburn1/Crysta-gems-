package space.nicholasblackburn.crystalgems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import space.nicholasblackburn.crystalgems.registries.ModEventSubscriber;

@Mod(Main.MODID)

public class Main {
    
    public static final String MODID = "crystalgems";

    public static final Logger Logger = LogManager.getLogger(MODID);

    public Main() {
        Logger.debug("Hello from Crystal gems and Steven");
        RegisterEvents();
    }

    // This function Register the mod event subscribers  
    private static void RegisterEvents(){
        Logger.info("Loading Event Bus Subscriber ->"+"loaded!\n");
        MinecraftForge.EVENT_BUS.register(ModEventSubscriber.class);
        
    } 
     
    final ModLoadingContext modLoadingContext = ModLoadingContext.get();
	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



    

}