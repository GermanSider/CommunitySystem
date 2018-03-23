package net.bote.community.itemutil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import net.bote.community.main.Data;
import net.bote.community.main.Main;

public class HideStatus {
	
	public static void showLobbyPlayers(Player p) {
		for(Player all : Bukkit.getOnlinePlayers()) {
			p.showPlayer(all);
		}
		p.sendMessage(Main.getPrefix()+"§bDu hast alle Spieler §asichtbar §bgemacht");
		p.getInventory().setItem(8, Data.createitem(Material.INK_SACK, 10, "§aAlle Spieler anzeigen"));
		if(InventoryClick.nobody.contains(p)) {
			InventoryClick.nobody.remove(p);
		}
		if(InventoryClick.vip.contains(p)) {
			InventoryClick.vip.remove(p);
		}
		if(InventoryClick.all.contains(p)) {
			InventoryClick.all.remove(p);
		}
		InventoryClick.all.add(p);
		p.closeInventory();
	}
	public static void hideLobbyPlayers(Player p) {
			for(Player all : Bukkit.getOnlinePlayers()) {
				p.hidePlayer(all);
			}
			p.sendMessage(Main.getPrefix()+"§bDu hast alle Spieler §cversteckt");
			p.getInventory().setItem(8, Data.createitem(Material.INK_SACK, 8, "§cAlle Spieler verstecken"));
			if(InventoryClick.nobody.contains(p)) {
				InventoryClick.nobody.remove(p);
			}
			if(InventoryClick.vip.contains(p)) {
				InventoryClick.vip.remove(p);
			}
			if(InventoryClick.all.contains(p)) {
				InventoryClick.all.remove(p);
			}
			InventoryClick.nobody.add(p);
			p.closeInventory();
	}
	public static void showOnlyVIP(Player p) {
		for(Player all : Bukkit.getOnlinePlayers()) {
			if(all.hasPermission("community.vip")) {
				p.showPlayer(all);
			} else {
				p.hidePlayer(all);
			}
		}
		p.sendMessage(Main.getPrefix()+"§bDu siehst nun nur noch §5VIPs");
		p.getInventory().setItem(8, Data.createitem(Material.INK_SACK, 5, "§5Nur VIPs anzeigen"));
		if(InventoryClick.nobody.contains(p)) {
			InventoryClick.nobody.remove(p);
		}
		if(InventoryClick.vip.contains(p)) {
			InventoryClick.vip.remove(p);
		}
		if(InventoryClick.all.contains(p)) {
			InventoryClick.all.remove(p);
		}
		InventoryClick.vip.add(p);
		p.closeInventory();
	}
}
