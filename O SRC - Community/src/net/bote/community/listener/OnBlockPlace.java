package net.bote.community.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import net.bote.community.main.Main;

public class OnBlockPlace implements Listener {
	
	private Main plugin;
	
	public OnBlockPlace(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onBreak(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		
		if(p.hasPermission("community.build") || p.hasPermission("community.admin")) {
			if(Main.getInstance().getActivitePlayers().contains(p)) {
			} else {
				p.sendMessage(Main.getPrefix()+"§cUm bauen zu können, gehe in den Build!");
				p.sendMessage(Main.getPrefix()+"§7➼ §e/build");
				e.setCancelled(true);
			}
		} else {
			e.setCancelled(true);
		}
	}

}
