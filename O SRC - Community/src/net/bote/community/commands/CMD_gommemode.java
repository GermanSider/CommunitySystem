package net.bote.community.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;

public class CMD_gommemode implements CommandExecutor {
	
	private Main plugin;

	public CMD_gommemode(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			p.sendMessage("§3TROLOLOLOLOLOLOLLLLL");
		}
		return true;
	}

}
