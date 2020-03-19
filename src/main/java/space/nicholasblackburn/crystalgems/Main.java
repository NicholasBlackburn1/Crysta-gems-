package space.nicholasblackburn.crystalgems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod(Main.MODID)

public class Main {
    
    public static final String MODID = "crystalgems";

    public static final Logger Logger = LogManager.getLogger(MODID);

    public Main() {
        
        Logger.debug("Hello from Crystal gems and Steven");
    }
    
  
    


}