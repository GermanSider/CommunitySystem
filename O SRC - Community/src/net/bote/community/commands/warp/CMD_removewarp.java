package net.bote.community.commands.warp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;
import net.bote.community.utils.warpmanager.WarpManager;

public class CMD_removewarp implements CommandExecutor {

	public CMD_removewarp() {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player)sender;
			String name = args[0];
			if(args.length == 1) {
				if(p.hasPermission("community.removewarp") || p.hasPermission("community.admin")) {
					if(Main.getInstance().getWarpManager().isWarpAlreadyExists(name)) {
						Main.getInstance().getWarpManager().removeWarp(name);
						p.sendMessage(WarpManager.wprefix+"Du hast den Warp §e" + name + " §7gelöscht!");
					} else {
						p.sendMessage(WarpManager.wprefix+"§cDer Warp §l" + name + " §r§cexistiert nicht!");
					}
				} else {
					p.sendMessage(Main.getPrefix() + "§cKein Recht!");
				}
			}
		}
		return false;
	}

}
