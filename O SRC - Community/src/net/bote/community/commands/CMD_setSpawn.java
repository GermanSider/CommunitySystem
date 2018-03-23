package net.bote.community.commands;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;

public class CMD_setSpawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		if(sender instanceof Player) {
			if(p.hasPermission("community.admin") || p.hasPermission("community.setup")) {
				Main.spawncfg.set("loc.x", p.getLocation().getX());
				Main.spawncfg.set("loc.y", p.getLocation().getY());
				Main.spawncfg.set("loc.z", p.getLocation().getZ());
				Main.spawncfg.set("loc.yaw", p.getLocation().getYaw());
				Main.spawncfg.set("loc.pitch", p.getLocation().getPitch());
				Main.spawncfg.set("loc.world", p.getLocation().getWorld().getName());
				
				p.sendMessage(Main.getPrefix()+"§aSpawnpunkt erfolgreich gesetzt!");
				
				try {
					Main.spawncfg.save(Main.file);
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("[Community] Fehler beim Abspeichern der Spawnpunkte!");
					System.err.println("[Community] Lade das Plugin neu und lösche die erstellten Datein!");
				}
			}
		}
		return true;
	}

}
