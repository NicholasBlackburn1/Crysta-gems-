package space.nicholasblackburn.crystalgems.registries;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import space.nicholasblackburn.crystalgems.Main;
import space.nicholasblackburn.crystalgems.blocks.BlockReg;
import space.nicholasblackburn.crystalgems.items.ItemTab;
import space.nicholasblackburn.crystalgems.items.ItemsReg;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)

public final class ModEventSubscriber{

    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        Main.Logger.warn("RegisterItems", true);
        BlockItemReg(event);
    }

    @SubscribeEvent
    public static void onRegisterBlocks(final RegistryEvent.Register<Block> event) {
        Main.Logger.warn("RegisterBlocks", true);

    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Main.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

    // Registers blockitems in a functin

    private static void BlockItemReg(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockReg.BLOCKS.getEntries().stream()
				.map(RegistryObject::get)
				// You can do extra filtering here if you don't want some blocks to have an BlockItem automatically registered for them
				// .filter(block -> needsItemBlock(block))
				// Register the BlockItem for the block
				.forEach(block -> {
					// Make the properties, and make it so that the item will be on our ItemGroup (CreativeTab)
					final Item.Properties properties = new Item.Properties().group(ItemTab.Pearl_ITEM_GROUP);
					// Create the new BlockItem with the block and it's properties
					final BlockItem blockItem = new BlockItem(block, properties);
					// Set the new BlockItem's registry name to the block's registry name
					blockItem.setRegistryName(block.getRegistryName());
					// Register the BlockItem
					registry.register(blockItem);
				});
		Main.Logger.debug("Registered BlockItems");
    }
    
    

    
}

