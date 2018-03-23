package net.bote.community.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.bote.community.main.Main;

public class ChatEvent implements Listener {

	
	private Main plugin;
	
	public ChatEvent(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		String msg = e.getMessage();
		
		if(msg.equalsIgnoreCase("Was macht ein Owner?") || msg.equalsIgnoreCase("Was macht ein Owner") || msg.equalsIgnoreCase("Was ist ein Owner") || msg.equalsIgnoreCase("Was ist ein Owner?")) {
			e.setCancelled(true);
			p.sendMessage("§cDie Owner sind die Inhaber des Netzwerkes. Sie sind für die Verwaltung des Netzwerks zuständig.");
		}
		if(msg.equalsIgnoreCase("Was macht ein Admin?") ||msg.equalsIgnoreCase("Was macht ein Admin") ||msg.equalsIgnoreCase("Was ist ein Admin?") ||
				msg.equalsIgnoreCase("Was ist ein Admin")) {
			e.setCancelled(true);
			p.sendMessage("§cEin Admin hat verschiedene Aufgabenbereiche, wie unter anderem die:");
			p.sendMessage("");
			p.sendMessage("§7➥§cVerwaltung des Teams");
			p.sendMessage("§7➥§cVerwaltung der Developer");
			p.sendMessage("§7➥§coder des Citybuild-Spielmodus.");
			
		}
		if(msg.equalsIgnoreCase("Was macht ein Developer") || msg.equalsIgnoreCase("Was macht ein Developer?") || msg.equalsIgnoreCase("Was ist ein Developer") || 
			msg.equalsIgnoreCase("Was macht ein Dev") || msg.equalsIgnoreCase("Was ist ein Dev")) {
			e.setCancelled(true);
			p.sendMessage("§cDie Developer sind für das Programmieren neuer Spielmodi zuständig.");
			p.sendMessage("§cEbenfalls sind sie für das Beheben von Bugs verantwortlich.");
		}
		if(msg.equalsIgnoreCase("Was macht ein Moderator") || msg.equalsIgnoreCase("Was macht ein Moderator?") || msg.equalsIgnoreCase("Was ist ein Moderator") || 
				msg.equalsIgnoreCase("Was macht ein Mod") || msg.equalsIgnoreCase("Was ist ein Mod")) {
				e.setCancelled(true);
				p.sendMessage("§cEin Moderator kümmert sich InGame um Spieler, die gegen die Regeln verstoßen.");
				
		}
		if(msg.equalsIgnoreCase("Was macht ein Partner") || msg.equalsIgnoreCase("Was macht ein Partner?") || msg.equalsIgnoreCase("Was ist ein Partner") || 
				msg.equalsIgnoreCase("Was ist Partner?")) {
			e.setCancelled(true);
				p.sendMessage("§cEin Partner ist eine Person, die mit uns eine Kooperation geschlossen hat.");
				
		}
		if(msg.equalsIgnoreCase("Was macht ein Supporter") || msg.equalsIgnoreCase("Was macht ein Supporter?") || msg.equalsIgnoreCase("Was ist ein Supporter") || 
				msg.equalsIgnoreCase("Was macht ein Sup") || msg.equalsIgnoreCase("Was ist ein Sup")) {
			e.setCancelled(true);
				p.sendMessage("§cDie Supporter sind für den TeamSpeak- und für den Ingame Support zuständig.");
				p.sendMessage("Die Supporter sind für den TeamSpeak- und für den Ingame Support zuständig.");
				
		}
		if(msg.equalsIgnoreCase("Was macht ein Builder") || msg.equalsIgnoreCase("Was macht ein Builder?") || msg.equalsIgnoreCase("Was ist ein Builder")) {
			e.setCancelled(true);
				p.sendMessage("§cEin Builder baut alle Maps und Landschaften dieses Servers. Er verwirklicht alle enstandenden Ideen, in Minecraft.");
				
		}
		if(msg.equalsIgnoreCase("Wer hat die Community programmiert")) {
			e.setCancelled(true);
			p.sendMessage("§cDie NowUnity hat bote100 programmiert :p");
		}
	}

}
