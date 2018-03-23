package net.bote.community.main;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.bote.community.commands.CMD_build;
import net.bote.community.commands.CMD_creload;
import net.bote.community.commands.CMD_gommemode;
import net.bote.community.commands.CMD_setSpawn;
import net.bote.community.commands.CMD_spawn;
import net.bote.community.commands.warp.CMD_removewarp;
import net.bote.community.commands.warp.CMD_setWarp;
import net.bote.community.itemutil.InventoryClick;
import net.bote.community.listener.ChatEvent;
import net.bote.community.listener.DamageEvent;
import net.bote.community.listener.InventoryMove;
import net.bote.community.listener.JoinListener;
import net.bote.community.listener.OnBlockBreak;
import net.bote.community.listener.OnBlockPlace;
import net.bote.community.listener.OnItemDrop;
import net.bote.community.screenbox.cmd.CMD_box;
import net.bote.community.screenbox.cmd.CMD_leavebox;
import net.bote.community.screenboxen.BoxManager;
import net.bote.community.screenboxen.SignPlaceEvent;
import net.bote.community.stage.CMD_setoutspawn;
import net.bote.community.stage.StageEnterEvent;
import net.bote.community.utils.warpmanager.OnSignChange;
import net.bote.community.utils.warpmanager.SignClickEvent;
import net.bote.community.utils.warpmanager.WarpManager;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public static ArrayList<Player> activeplayers;
	
	public static ArrayList<Player> hideruser = new ArrayList<Player>();
	
	public static File file = new File("Locations" , "spawn.yml");
	public static YamlConfiguration spawncfg = new YamlConfiguration().loadConfiguration(file);
	
	private static Main instance;
	
	public Inventory inv = null;
	
	private static String prefix = "§aCommunity §7| ";
	
	private PluginManager pm = Bukkit.getPluginManager();
	
	public static Main plugin;
	
	@Override
	public void onEnable() {
		
		this.activeplayers = new ArrayList<Player>();
		
		setInstance(this);
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			ScoreboardClassManager.sendScoreboard(all);
			InventoryClick.all.add(all);
			all.showPlayer(all);
		}
		
		System.out.println(ChatColor.GREEN + "[Community] Das Plugin wurde gestartet!");
		System.out.println(ChatColor.AQUA + "[Community] Version: " + this.getDescription().getVersion());
		System.out.println("");
		System.out.println(ChatColor.RED + "[Community] Dieses Plugin ist open-source!");
		System.out.println(ChatColor.DARK_GREEN + "[Community] coded by: bote100");
		
		registerEvents();
		
		this.getCommand("setwarp").setExecutor(new CMD_setWarp());
		this.getCommand("removewarp").setExecutor(new CMD_removewarp());
		this.getCommand("build").setExecutor(new CMD_build());
		this.getCommand("setspawn").setExecutor(new CMD_setSpawn());
		this.getCommand("box").setExecutor(new CMD_box(this));
		this.getCommand("leavebox").setExecutor(new CMD_leavebox(this));
		this.getCommand("creload").setExecutor(new CMD_creload(this));
		this.getCommand("spawn").setExecutor(new CMD_spawn(this));
		this.getCommand("setoutspawn").setExecutor(new CMD_setoutspawn(this));
		this.getCommand("gommemode").setExecutor(new CMD_gommemode(this));
	}
	
	@Override
	public void onDisable() {
		System.out.println(ChatColor.GREEN+"[Community] Plugin deaktiviert!");
		System.out.println(ChatColor.AQUA + "[Community] Version: " + this.getDescription().getVersion());
		System.out.println("");
		System.out.println(ChatColor.RED + "[Community] Dieses Plugin ist open-source!");
		System.out.println(ChatColor.DARK_GREEN + "[Community] coded by: bote100");
	}
	
	public void registerEvents() {
		new JoinListener(this);
		new InventoryMove(this);
		new OnBlockBreak(this);
		new InventoryClick(this);
		new OnBlockPlace(this);
		new OnItemDrop(this);
		new OnSignChange(this);
		new DamageEvent(this);
		new SignClickEvent(this);
		new SignPlaceEvent(this);
		new StageEnterEvent(this);
		new ChatEvent(this);
	}
	
	public static Main getInstance() {
		return instance;
	}
	public static void setInstance(Main instance) {
		Main.instance = instance;
	}
	public static String getPrefix() {
		return prefix;
	}
	public WarpManager getWarpManager() {
		return new WarpManager();
	}
	public BoxManager getBoxManager() {
		return new BoxManager();
	}
	public static ArrayList<Player> getActivitePlayers() {
		return activeplayers;
	}
}
