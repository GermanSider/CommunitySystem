package net.bote.community.stage;

import java.io.IOException;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;

public class CMD_setoutspawn implements CommandExecutor {

	private Main plugin;
	
	public CMD_setoutspawn(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			
			if(p.hasPermission("community.admin")) {
				Main.spawncfg.set("stageoutspawn.world", p.getWorld().getName());
				Main.spawncfg.set("stageoutspawn.x", p.getLocation().getX());
				Main.spawncfg.set("stageoutspawn.y", p.getLocation().getY());
				Main.spawncfg.set("stageoutspawn.z", p.getLocation().getZ());
				Main.spawncfg.set("stageoutspawn.yaw", p.getLocation().getYaw());
				Main.spawncfg.set("stageoutspawn.pitch", p.getLocation().getPitch());
				try {
					Main.spawncfg.save(Main.file);
				} catch (IOException e) {
					e.printStackTrace();
				}
				p.sendMessage(Main.getPrefix()+"§aDu hast den OutSpawn der Bühne gesetzt!");
			} else {
				p.sendMessage(Main.getPrefix()+"§cKein Recht!");
			}
		} else {
			System.out.println("[NowUnity] Nur ein Spieler kann dies ausführen!");
		}
		return true;
	}

}
