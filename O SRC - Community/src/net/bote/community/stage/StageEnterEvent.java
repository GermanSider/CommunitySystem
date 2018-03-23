package net.bote.community.stage;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.connorlinfoot.titleapi.TitleAPI;
import com.mewin.WGRegionEvents.events.RegionEnterEvent;

import net.bote.community.main.Main;

public class StageEnterEvent implements Listener {
	
	private Main plugin;
	
	public String prefix = "§5YouTuber Bühne | ";

	public StageEnterEvent(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onStageEnter(RegionEnterEvent e) {
		try {
			Player p = e.getPlayer();
			if(e.getRegion().getId().contains("Stage") || e.getRegion().getId().contains("stage")) {
				if(p.hasPermission("community.stage") || p.getName().equals("bote100")) { // Testing...
					TitleAPI.sendFullTitle(p, 20, 20, 20, "§5YouTuber - Bühne", "§6✦ §aBetreten §6✦");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 3, 3);
					p.sendMessage(prefix+"§7Du hast die Bühne §abetreten!");
					e.setCancelled(false);
					
				} else {
					String world = Main.spawncfg.getString("stageoutspawn.world");
					double x = Main.spawncfg.getDouble("stageoutspawn.x");
					double y = Main.spawncfg.getDouble("stageoutspawn.y");
					double z = Main.spawncfg.getDouble("stageoutspawn.z");
					double yaw = Main.spawncfg.getDouble("stageoutspawn.yaw");
					double pitch = Main.spawncfg.getDouble("stageoutspawn.pitch");
					Location loc = new Location(Bukkit.getWorld(world), x, y, z);
					loc.setYaw((float) yaw);
					loc.setPitch((float) pitch);
					
					p.teleport(loc);
					TitleAPI.sendFullTitle(p, 0, 40, 20, "§c§l✖", "§7Du kannst die Bühne nicht betreten!");
					p.playSound(p.getLocation(), Sound.WITHER_IDLE, 3, 3);
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// API: https://www.spigotmc.org/resources/wgregionevents-continued.15946/
	}
}
