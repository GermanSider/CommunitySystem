package net.bote.community.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import ru.tehkode.permissions.PermissionManager;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ScoreboardClassManager {
	
	PermissionManager pm = PermissionsEx.getPermissionManager();
	
	public static void sendScoreboard(Player p) {
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		final Scoreboard board = ((org.bukkit.scoreboard.ScoreboardManager) sm).getNewScoreboard();
		final Objective o = board.registerNewObjective("aaa", "dummy");
		
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§7§l» §bNowMania.net §7«");
		
		o.getScore("§c ").setScore(11);
		o.getScore("§f§lRang:").setScore(10);
		
		
		if(PermissionsEx.getUser(p).inGroup("Owner")) {
			o.getScore("§7» §4§lOwner").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Admin")) {
			o.getScore("§7» §4Admin").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Dev")) {
			o.getScore("§7» §bDeveloper").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("SrMod")) {
			o.getScore("§7» §cSrMod").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Mod")) {
			o.getScore("§7» §cModerator").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Sup")) {
			o.getScore("§7» §9Supporter").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Builder")) {
			o.getScore("§7» §eBuilder").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("SrBuilder")) {
			o.getScore("§7» §6Sr§eBuilder").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("YouTuber")) {
			o.getScore("§7» §5YouTuber").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Premium+")) {
			o.getScore("§7» §6Premium Plus").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Lord")) {
			o.getScore("§7» §cLord").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Champion")) {
			o.getScore("§7» §aChampion").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Ultra")) {
			o.getScore("§7» §bUltra").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Legend")) {
			o.getScore("§7» §2Legend").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Premium")) {
			o.getScore("§7» §6Premium").setScore(9);
		}
		else {
			o.getScore("§7» Spieler").setScore(9);
		}
		
		

		o.getScore("§o ").setScore(8);
		o.getScore("§f§lOnline: ").setScore(7);
		o.getScore("§8» §9" + Bukkit.getOnlinePlayers().size()).setScore(6);
		
		if(p.hasPermission("community.build")) {
			o.getScore("§a ").setScore(6);
			o.getScore("§f§lBuild:").setScore(5);
			if(Main.getActivitePlayers().contains(p)) {
				o.getScore("§7» §aAn").setScore(4);
			} else {
				o.getScore("§7» §cAus").setScore(4);
			}
		}
		
		p.setScoreboard(board);
		}

	public static void sendLeaveScoreboard(Player p) {
		
		ScoreboardManager sm = Bukkit.getScoreboardManager();
		final Scoreboard board = ((org.bukkit.scoreboard.ScoreboardManager) sm).getNewScoreboard();
		final Objective o = board.registerNewObjective("aaa", "dummy");
		
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§7» §b§lNowMania.net §7«");
		
		o.getScore("§c ").setScore(11);
		o.getScore("§7§lRang:").setScore(10);
		
		
		if(PermissionsEx.getUser(p).inGroup("Owner")) {
			o.getScore("§4§lOwner").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Admin")) {
			o.getScore("§4Admin").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Entwickler")) {
			o.getScore("§bDeveloper").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("SrMod")) {
			o.getScore("§cSrMod").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Moderator")) {
			o.getScore("§cModerator").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Supporter")) {
			o.getScore("§9Supporter").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Builder")) {
			o.getScore("§eBuilder").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Manager")) {
			o.getScore("§6Manager").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("YT")) {
			o.getScore("§5YouTuber").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Premium+")) {
			o.getScore("§6Premium Plus").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Lord")) {
			o.getScore("§cLord").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("King")) {
			o.getScore("§aKing").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Ultra")) {
			o.getScore("§bUltra").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Legend")) {
			o.getScore("§2Legend").setScore(9);
		}
		else if(PermissionsEx.getUser(p).inGroup("Premium")) {
			o.getScore("§6Premium").setScore(9);
		}
		else {
			o.getScore("§7Spieler").setScore(9);
		}
		
		

		o.getScore("§o ").setScore(8);
		o.getScore("§7§lOnline: ").setScore(7);
		int total = Bukkit.getOnlinePlayers().size() - 1;
		o.getScore("§8» §9" + total).setScore(6);
		
		if(p.hasPermission("community.build")) {
			o.getScore("§a ").setScore(6);
			o.getScore("§f§lBuild:").setScore(5);
			if(Main.getActivitePlayers().contains(p)) {
				o.getScore("§aAn").setScore(4);
			} else {
				o.getScore("§cAus").setScore(4);
			}
		}
		
		p.setScoreboard(board);
		}
}
