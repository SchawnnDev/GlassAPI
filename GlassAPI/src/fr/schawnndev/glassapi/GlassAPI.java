package fr.schawnndev.glassapi;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import fr.schawnndev.glassapi.enums.Blocks;
import fr.schawnndev.glassapi.enums.GlassColor;
import fr.schawnndev.glassapi.enums.Blocks.MainBlocks;
import fr.schawnndev.glassapi.enums.GlassColor.MainGlassColors;

public class GlassAPI extends JavaPlugin {
	
	static Blocks bl = Blocks.STAINED_GLASS;
	static GlassColor cl = GlassColor.WHITE;
	static int ant = 1;
	static short dmg = 0;

	public void onEnable() {
	}

	public void onDisable() {
	}

	public GlassAPI(Blocks block, GlassColor color) {
		bl = block;
		cl = color;
	}
	
	public GlassAPI(Blocks block, GlassColor color, int amount) {
		bl = block;
		cl = color;
		ant = amount;
	}
	
	public GlassAPI(Blocks block, GlassColor color, int amount, short damage) {
		bl = block;
		cl = color;
		dmg = damage;
	}
	
	@SuppressWarnings("deprecation")
	public ItemStack getBlock(){
		ItemStack item = new ItemStack(MainBlocks.getBlockInt(bl), ant,	dmg, MainGlassColors.getColorInt(cl));
			return item;
	}

}