package space.nicholasblackburn.crystalgems.items;

import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import space.nicholasblackburn.crystalgems.Main;

public class ItemsReg {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);

	// This is a very simple Item. It has no special properties except for being on our creative tab.
	public static final RegistryObject<Item> PearlCrystal = ITEMS.register("crystal_gem_pearl", () -> new Item(new Item.Properties().group(ItemTab.Pearl_ITEM_GROUP)));
	//public static final RegistryObject<ModdedSpawnEggItem> WILD_BOAR_SPAWN_EGG = ITEMS.register("wild_boar_spawn_egg", () -> new ModdedSpawnEggItem(ModEntityTypes.WILD_BOAR, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
} 
