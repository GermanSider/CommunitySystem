package net.bote.community.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.bote.community.main.Main;

public class CMD_creload implements CommandExecutor {
	
	public static int rlc = 31;
	
	private Main plugin;

	public CMD_creload(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
		}
		System.out.println("Die Community wird nun neu gestartet!");
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

			@Override
			public void run() {
				rlc--;
				if(rlc == 30 || rlc == 15 || rlc == 5 || rlc == 4 || rlc == 3 || rlc == 2 || rlc == 1) {
					Bukkit.broadcastMessage(Main.getPrefix()+"§cDie NowUnity startet in §f" + rlc + "s §cneu!");
					Bukkit.broadcastMessage("  §7§oDu kannst wenige Sekunden danach wiederkommen!       ");
				}
				if(rlc == 0) {
					for(Player all : Bukkit.getOnlinePlayers()) {
						all.kickPlayer("§cDie Nowunity startet neu!\n \n§7Du kannst gleich wieder joinen!");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "rl");
					}
					Bukkit.getServer().reload();
				}
				
			}
			
			
		}, 0L, 20L);
		return true;
	}

}
