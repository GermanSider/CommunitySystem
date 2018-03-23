package net.bote.community.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

import net.bote.community.main.Main;

public class DamageEvent implements Listener {
	
	private Main plugin;
	
	public DamageEvent(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onDmg(PlayerItemDamageEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onWeatherChange(WeatherChangeEvent e) {
		e.setCancelled(true);
	}

	@EventHandler
	public void onFoodChange(FoodLevelChangeEvent e) {
		e.setFoodLevel(20);
	}
	
	@EventHandler
	public void onEntityDmg(EntityDamageEvent e)  {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onBlockDmg(EntityDamageByBlockEvent e)  {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void ondmgbyentity(EntityDamageByEntityEvent e) {
		e.setCancelled(true);
	}
	
}
