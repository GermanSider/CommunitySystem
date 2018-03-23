package net.bote.community.commands;

import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.connorlinfoot.titleapi.TitleAPI;

import net.bote.community.main.Main;
import net.bote.community.main.ScoreboardClassManager;

public class CMD_build implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player)sender;
		if(sender instanceof Player) {
			if(p.hasPermission("community.admin") || p.hasPermission("community.build")) {
				if(Main.getInstance().getActivitePlayers().contains(p)) {
					Main.getInstance().getActivitePlayers().remove(p);
					p.sendMessage(Main.getPrefix()+"§7Du bist nun §cnicht mehr §7im §e§lBuild");
					p.setGameMode(GameMode.SURVIVAL);
					p.playSound(p.getLocation(), Sound.FIREWORK_BLAST, 1F, 1F);
					
					TitleAPI.sendTitle(p, 0, 20, 20, "§eBuild §7| §cAus");
					
					ScoreboardClassManager.sendScoreboard(p);
				} else {
					Main.getInstance().getActivitePlayers().add(p);
					p.sendMessage(Main.getPrefix()+"§7Du bist §anun §7im §e§lBuild");
					p.playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, 3, 3);
					
					TitleAPI.sendTitle(p, 0, 20, 20, "§eBuild §7| §aAn");
					p.setGameMode(GameMode.CREATIVE);
					
					ScoreboardClassManager.sendScoreboard(p);
					}	
				} else {
					p.sendMessage(Main.getPrefix()+"§cKein Recht!");
				}
			} else {
				System.out.println("Nur Spieler können diesen Befel ausführen!!!");
			}
		return true;
	}

}
