
/**
 * This class is for reg new mc blocks
 * @author Nicholas Blackburn   
 */
package space.nicholasblackburn.crystalgems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import space.nicholasblackburn.crystalgems.Main;

public class BlockReg {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);

	// This block has the ROCK material, meaning it needs at least a wooden pickaxe to break it. It is very similar to Iron Ore
	public static final RegistryObject<Block> testOre = BLOCKS.register("test_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)));
	// This block has the IRON material, meaning it needs at least a stone pickaxe to break it. It is very similar to the Iron Block
	public static final RegistryObject<Block> warpPadBlock = BLOCKS.register("warp_pad_block", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.WHITE_TERRACOTTA).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.ANVIL)));
	
	
}