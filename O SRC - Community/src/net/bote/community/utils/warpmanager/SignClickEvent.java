package net.bote.community.utils.warpmanager;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.connorlinfoot.titleapi.TitleAPI;

import net.bote.community.main.Main;

public class SignClickEvent implements Listener {
	
	private Main plugin;
	
	public SignClickEvent(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onSignClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getClickedBlock().getState() instanceof Sign) {
				Sign s = (Sign)e.getClickedBlock().getState();
				
				if(s.getLine(0).equalsIgnoreCase("§9Warp")) {
					
					String spawn = s.getLine(1);
					String world = WarpManager.cfg.getString(spawn + ".world");
					double x = WarpManager.cfg.getDouble(spawn + ".x");
					double y = WarpManager.cfg.getDouble(spawn + ".y");
					double z = WarpManager.cfg.getDouble(spawn + ".z");
					double yaw = WarpManager.cfg.getDouble(spawn + ".yaw");
					double pitch = WarpManager.cfg.getDouble(spawn + ".pitch");
					Location loc = new Location(Bukkit.getWorld(world), x, y, z);
					loc.setYaw((float) yaw);
					loc.setPitch((float) pitch);
					p.teleport(loc);
					
					TitleAPI.sendFullTitle(p, 0, 20, 0, "§e"+spawn, "§5Du wurdest teleportiert...");
					p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1F, 1F);
					p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 3);
					}
				}
			}
		}
}


