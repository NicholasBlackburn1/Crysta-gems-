package space.nicholasblackburn.crystalgems.Registries;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;
import space.nicholasblackburn.crystalgems.Main;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)

public final class ModEventSubscriber{
    
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(
    setup(new Item(new Item.Properties()), "4")
    
    
);


}
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {    

}

public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
	return setup(entry, new ResourceLocation(Main.MODID, name));
}

public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
	entry.setRegistryName(registryName);
	return entry;
}



}

