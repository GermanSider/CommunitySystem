package net.bote.community.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import net.bote.community.main.Main;

public class InventoryMove implements Listener {
	
	private Main plugin;
	
	public InventoryMove(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onInvMove(InventoryClickEvent e) {
		Player p = (Player)e.getWhoClicked();
		if(Main.getActivitePlayers().contains(p)) {
			e.setCancelled(false);
		} else {
			e.setCancelled(true);
		}
	}

}
