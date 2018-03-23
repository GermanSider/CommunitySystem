package net.bote.community.screenbox.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;
import net.bote.community.main.Methoden;

public class CMD_leavebox implements CommandExecutor {
	
	private Main plugin;

	public CMD_leavebox(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			Methoden.leaveScreenBox(p);
		} else {
			System.err.println("[NowUnity] Nur ein Spieler kann diesen Befehl ausführen!");
		}
		return true;
	}

}
