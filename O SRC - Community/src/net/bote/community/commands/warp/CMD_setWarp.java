package net.bote.community.commands.warp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;
import net.bote.community.utils.warpmanager.WarpManager;

public class CMD_setWarp implements CommandExecutor {

	public CMD_setWarp() {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		
		if(p.hasPermission("community.admin") || p.hasPermission("community.setwarp")) {
			if(args.length == 1) {
				Main.getInstance().getWarpManager().createWarp(p, args[0]);
			} else {
				p.sendMessage(WarpManager.wprefix+"§eNutze /setwarp <Warp-Name>");
			}
		} else {
			p.sendMessage(Main.getPrefix()+"§cKein Recht!");
		}
		return true;
	}

}
