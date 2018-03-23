package net.bote.community.main;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Data {
	
	public static ItemStack createitem(Material material, int subid, String Displayname) {
		ItemStack item = new ItemStack(material, 1, (short) subid);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Displayname);
		item.setItemMeta(meta);		
		return item;
	}
	
	public static ItemStack createEnchantedItem(Material material, int subid, Enchantment e, int level, boolean b, String Displayname) {
		ItemStack item = new ItemStack(material, 1, (short) subid);
		ItemMeta meta = item.getItemMeta();
		meta.addEnchant(e, level, b);
		meta.setDisplayName(Displayname);
		item.setItemMeta(meta);		
		return item;
	}

}
