package net.bote.community.listener;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import net.bote.community.main.Main;

public class OnItemDrop implements Listener {
	
	private Main plugin;
	
	public OnItemDrop(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {
		Player p = e.getPlayer();
		
		if(p.hasPermission("community.build") || p.hasPermission("community.admin")) {
			if(Main.getInstance().getActivitePlayers().contains(p)) {
				e.setCancelled(false);
			} else {
				p.sendMessage(Main.getPrefix()+"§cUm Item droppen zu können, gehe in den Build!");
				p.sendMessage(Main.getPrefix()+"§7➼ §e/build");
				e.setCancelled(true);
			}
		} else {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPickUp(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		ArrayList<Player> cangetmsg = new ArrayList<Player>();
		if(p.hasPermission("community.build") || p.hasPermission("community.admin")) {
			if(Main.getInstance().getActivitePlayers().contains(p)) {
				e.setCancelled(false);
			} else {
				e.setCancelled(true);
				if(!cangetmsg.contains(p)) {
					p.sendMessage(Main.getPrefix()+"§cGehe in den Build-Modus, um Items aufzuheben.");
					p.sendMessage(Main.getPrefix()+"§7➼ §e/build");
					cangetmsg.add(p);
					Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {

						@Override
						public void run() {
							cangetmsg.remove(p);
						}
						
					}, 20*5);
				}
			}
		} else {
			e.setCancelled(true);
		}
	}

}
