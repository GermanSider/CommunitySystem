package net.bote.community.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;

public class CMD_spawn implements CommandExecutor {

	private Main plugin;
	
	public CMD_spawn(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(args.length == 0) {
				String world = Main.spawncfg.getString("loc.world");
				double x = Main.spawncfg.getDouble("loc.x");
				double y = Main.spawncfg.getDouble("loc.y");
				double z = Main.spawncfg.getDouble("loc.z");
				double yaw = Main.spawncfg.getDouble("loc.yaw");
				double pitch = Main.spawncfg.getDouble("loc.pitch");
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				
				p.teleport(loc);
			} else {
				p.sendMessage(Main.getPrefix()+"§eNutze: /spawn");
			}
		} else {
			System.err.println("[NowUnity] Nur Spieler können diesen Command ausführen!");
		}
		return true;
	}

}
