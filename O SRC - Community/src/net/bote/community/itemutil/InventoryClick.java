package net.bote.community.itemutil;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import net.bote.community.main.Data;
import net.bote.community.main.Main;

public class InventoryClick implements Listener {
	
	private Main plugin;
	
	public static ArrayList<Player> all = new ArrayList<Player>();
	public static ArrayList<Player> vip = new ArrayList<Player>();
	public static ArrayList<Player> nobody = new ArrayList<Player>();

	public InventoryClick(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
				if(p.getItemInHand().getType() == Material.INK_SACK) {
					String dn = p.getItemInHand().getItemMeta().getDisplayName();
					if(dn.equalsIgnoreCase("§aAlle Spieler anzeigen") || dn.equalsIgnoreCase("§5Nur VIPs anzeigen") || dn.equalsIgnoreCase("§cAlle Spieler verstecken")) {
						openHiderInv(p);
					}
			}
		}
	}
	
	public void openHiderInv(Player p) {
		Inventory inv = Bukkit.createInventory(null, 27, "§a§lSpieler verstecken");
		
		if(all.contains(p)) {
			inv.setItem(11, Data.createEnchantedItem(Material.INK_SACK, 10, Enchantment.ARROW_INFINITE, 1, true, "§aAlle Spieler anzeigen"));
		} else {
			inv.setItem(11, Data.createitem(Material.INK_SACK, 10, "§aAlle Spieler anzeigen"));
		}
		if(vip.contains(p)) {
			inv.setItem(13, Data.createEnchantedItem(Material.INK_SACK, 5, Enchantment.ARROW_INFINITE, 1, true, "§5Nur VIPs anzeigen"));
		} else {
		inv.setItem(13, Data.createitem(Material.INK_SACK, 5, "§5Nur VIPs anzeigen"));
		}
		if(nobody.contains(p)) {
			inv.setItem(15, Data.createEnchantedItem(Material.INK_SACK, 8, Enchantment.ARROW_INFINITE, 1, true, "§cAlle Spieler verstecken"));
		} else {
		inv.setItem(15, Data.createitem(Material.INK_SACK, 8, "§cAlle Spieler verstecken"));
		}
		
		p.openInventory(inv);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		Player p = (Player)event.getWhoClicked();
		try {
			if(event.getInventory().getName().equalsIgnoreCase("§a§lSpieler verstecken")) {
				event.setCancelled(true);
				if(event.getCurrentItem().getType() == Material.INK_SACK) {
					if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aAlle Spieler anzeigen")) {
						HideStatus.showLobbyPlayers(p);
					} else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§5Nur VIPs anzeigen")) {
						HideStatus.showOnlyVIP(p);
					} else if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAlle Spieler verstecken")) {
						HideStatus.hideLobbyPlayers(p);
					}
				}
			}
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
			System.err.print("[NowUnity] Der PlayerHider macht Probleme! Bitte Developer kontaktieren!");
		}
	}

}
