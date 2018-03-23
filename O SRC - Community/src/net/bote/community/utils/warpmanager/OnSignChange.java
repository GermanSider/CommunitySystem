package net.bote.community.utils.warpmanager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import net.bote.community.main.Main;

public class OnSignChange implements Listener {
	
	private Main plugin;
	
	public OnSignChange(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onSingChange(SignChangeEvent e) {
		Player p = e.getPlayer();
		if(e.getLine(0).equalsIgnoreCase("[warp]")) {
				String name = e.getLine(1);
			if(Main.getInstance().getWarpManager().isWarpAlreadyExists(name)) {
				e.setLine(1, name);
				e.setLine(0, "§9Warp");
				e.setLine(3, "§7[*Klick*]");
		} else {
			p.sendMessage(WarpManager.wprefix+"§cDer Warp: §6§l" + name + " §r§cexistiert nicht!");
		}
	}
	}

}
