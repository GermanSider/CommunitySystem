package net.bote.community.utils.warpmanager;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;
import net.md_5.bungee.api.ChatColor;

public class WarpManager {
	
	public static String wprefix = "§6Warp-System §7» ";
	
	public static File f = new File(Main.getInstance().getDataFolder(), "warps.yml");
	public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	
	private void saveFile() {
		try {
			cfg.save(f);
		} catch (IOException e) {
			e.printStackTrace();
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"Ein Fehler ist beim Speichern der Warp-Datei aufgetreten!");
		}
	}
	
	public void createWarp(Player p, String name) {
		Location ploc = p.getLocation();
		if(!(isWarpAlreadyExists(name))) {
			cfg.set(name + ".world", p.getLocation().getWorld().getName());
			cfg.set(name + ".x", p.getLocation().getX());
			cfg.set(name + ".y", p.getLocation().getY());
			cfg.set(name + ".z", p.getLocation().getZ());
			cfg.set(name + ".yaw", p.getLocation().getYaw());
			cfg.set(name + ".pitch", p.getLocation().getPitch());
			saveFile();
			p.sendMessage("§6Warp-System §7» §e§l" + name + " gesetzt!");
		} else {
			p.sendMessage("§6Warp-System §7» §cDer Warp §l" + name + " §r§cexistiert bereits!");
		}
	}
	
	public void removeWarp(String name) {
			cfg.set(name, null);
			saveFile();
	}
	
	public boolean isWarpAlreadyExists(String warpname) {
		return cfg.contains(warpname);
		
	}
	
	public Location getWarpLocation(String warpName) {
		if(isWarpAlreadyExists(warpName)) {
			return (Location) cfg.get(warpName);
		}
		return Bukkit.getWorld("world").getSpawnLocation();
	}
}
