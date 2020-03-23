package space.nicholasblackburn.crystalgems.items;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import space.nicholasblackburn.crystalgems.Main;

public class ItemTab extends ItemGroup {
	public static final ItemGroup Pearl_ITEM_GROUP = new ItemTab(Main.MODID, () -> new ItemStack (ItemsReg.PearlCrystal.get()));

	@Nonnull
	private final Supplier<ItemStack> iconSupplier;

	public ItemTab(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		@Nonnull
		public ItemStack createIcon() {
			return iconSupplier.get();
		}

	}
