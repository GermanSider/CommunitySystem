package net.bote.community.screenboxen;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


import net.bote.community.main.Main;
import net.bote.community.screenbox.cmd.CMD_box;
import net.md_5.bungee.api.ChatColor;

public class BoxManager {
	
	public static File f = new File(Main.getInstance().getDataFolder(), "screenboxen.yml");
	public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	
	private static String boxprefix = "§5Screenboxen §7» ";
	
	public static void saveFile() {
		try {
			cfg.save(f);
		} catch (IOException e) {
			e.printStackTrace();
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"Ein Fehler ist beim Speichern der ScreenBox-Datei aufgetreten!");
		}
	}
	public void setBoxSpawn(Player p, String name) {
		if((isBoxAlreadyExists(name))) {
			this.cfg.set(name + ".spawn.world", p.getLocation().getWorld().getName());
			this.cfg.set(name + ".spawn.x", p.getLocation().getX());
			this.cfg.set(name + ".spawn.y", p.getLocation().getY());
			this.cfg.set(name + ".spawn.z", p.getLocation().getZ());
			this.cfg.set(name + ".spawn.yaw", p.getLocation().getYaw());
			this.cfg.set(name + ".spawn.pitch", p.getLocation().getPitch());
			p.sendMessage("§5Screenboxen §7» §eDu hast den §6Spawn §eder Box §b" + name + " §egesetzt!");
			saveFile();
		} else {
			p.sendMessage(boxprefix + "§cDiese Box existiert nicht!");
		}
	}
	
	
	public void setBoxHologram(Player p, String name) {
			if((isBoxAlreadyExists(name))) {
				this.cfg.set(name + ".holo.world", p.getLocation().getWorld().getName());
				this.cfg.set(name + ".holo.x", p.getLocation().getX());
				this.cfg.set(name + ".holo.y", p.getLocation().getY());
				this.cfg.set(name + ".holo.z", p.getLocation().getZ());
				this.cfg.set(name + ".holo.yaw", p.getLocation().getYaw());
				this.cfg.set(name + ".holo.pitch", p.getLocation().getPitch());
				p.sendMessage("§5Screenboxen §7» §eDu hast §6das Hologram §eder Box §b" + name + " §egesetzt!");
				saveFile();
			} else {
				p.sendMessage(boxprefix + "§cDiese Box existiert nicht!");
			}
		}
	
	public void createNewBox(Player p, String id) {
		if(!(isBoxAlreadyExists(id))) {
			this.cfg.set(id + ".exist", "yes");
			p.sendMessage(CMD_box.boxprefix+"§aDu hast erfolgreich die Screenbox §b§l" + id + "§r§a erstellt!");
			saveFile();
		} else {
			p.sendMessage(boxprefix+"§cDiese Box wurde bereits erstellt!");
		}
	}
	public boolean isBoxAlreadyExists(String warpname) {
		return this.cfg.contains(warpname);
	}
	public void removeBox(String name) {
		this.cfg.set(name, null);
		saveFile();
}
	
	

}
