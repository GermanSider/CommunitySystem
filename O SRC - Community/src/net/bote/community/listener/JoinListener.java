package net.bote.community.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import com.connorlinfoot.titleapi.TitleAPI;

import net.bote.community.itemutil.InventoryClick;
import net.bote.community.main.Data;
import net.bote.community.main.Main;
import net.bote.community.main.Methoden;
import net.bote.community.main.ScoreboardClassManager;
import ru.tehkode.permissions.bukkit.PermissionsEx;
 
public class JoinListener implements Listener {
	
	private Main plugin;
	
	public JoinListener(Main main) {
		this.plugin = main;
		this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		p.setAllowFlight(false);
		p.setFlying(false);
		
		e.setJoinMessage("§a» §7"+p.getDisplayName()+" hat die Community §abetreten");
		
		TitleAPI.sendFullTitle(p, 0, 40, 20, "§8» §aNowUnity §8«", "§7Willkommen, " + p.getName());
		
		p.getInventory().setArmorContents(null);
		p.getInventory().clear();
		
		p.getInventory().setItem(8, Data.createitem(Material.INK_SACK, 10, "§aAlle Spieler anzeigen"));
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			p.showPlayer(all);
			ScoreboardClassManager.sendScoreboard(all);
			all.showPlayer(p);
			if(InventoryClick.nobody.contains(all)) {
				all.hidePlayer(p);
			} else if(InventoryClick.vip.contains(all)) {
				if(!p.hasPermission("community.vip")) {
					all.hidePlayer(p);
				}
			}
		}
		if(InventoryClick.nobody.contains(p)) {
			InventoryClick.nobody.remove(p);
		}
		if(InventoryClick.vip.contains(p)) {
			InventoryClick.vip.remove(p);
		}
		if(InventoryClick.all.contains(p)) {
			InventoryClick.all.remove(p);
		}
		InventoryClick.all.add(p);
		
		p.setGameMode(GameMode.SURVIVAL);
		setRankBoots(p);
		
		p.setHealth(20);
		p.setFoodLevel(20);
		
		String world = Main.spawncfg.getString("loc.world");
		double x = Main.spawncfg.getDouble("loc.x");
		double y = Main.spawncfg.getDouble("loc.y");
		double z = Main.spawncfg.getDouble("loc.z");
		double yaw = Main.spawncfg.getDouble("loc.yaw");
		double pitch = Main.spawncfg.getDouble("loc.pitch");
		Location loc = new Location(Bukkit.getWorld(world), x, y, z);
		loc.setYaw((float) yaw);
		loc.setPitch((float) pitch);
		
		p.teleport(loc);
		
		Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {

			@Override
			public void run() {
				p.performCommand("spawn");
			}
			
		}, 10);
		
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage("§c« §7"+p.getDisplayName()+" hat die Community §cverlassen");
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			ScoreboardClassManager.sendLeaveScoreboard(all);
		}
		Methoden.leaveScreenBox(p);
		
	}
	public void setRankBoots(Player p) {
		if(PermissionsEx.getUser(p).inGroup("Premium")) {
            ItemStack h1 = new ItemStack(Material.GOLD_BOOTS);
            ItemMeta meta = h1.getItemMeta();
            meta.setDisplayName("§6Premium Boots");
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Legend")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(255, 165, 0));
            im.setDisplayName("§6Legend Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Ultra")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(65, 184, 244));
            im.setDisplayName("§bUltra Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Champion")) {
			 ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
	         LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
	         im.setColor(Color.fromRGB(110, 244, 66));
	         im.setDisplayName("§2§lKing Boots");
	         h1.setItemMeta(im);
	         p.getInventory().setBoots(null);
	         p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Lord")) {
			 ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
	         LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
	         im.setColor(Color.fromRGB(252, 60, 60));
	         im.setDisplayName("§cLord Boots");
	         h1.setItemMeta(im);
	         p.getInventory().setBoots(null);
	         p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Premium+")) {
            ItemStack h1 = new ItemStack(Material.GOLD_BOOTS);
            ItemMeta meta = h1.getItemMeta();
            meta.setDisplayName("§6Premium§e+ §6Boots");
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("YouTuber")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(152, 0, 255));
            im.setDisplayName("§5YouTuber Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("SrBuilder")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(106, 255, 0));
            im.setDisplayName("§6Sr§eBuilder Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Builder")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(255, 255, 0));
            im.setDisplayName("§eBuilder Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Sup")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(0, 114, 255));
            im.setDisplayName("§9Supporter Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Mod")) {
        	ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(252, 60, 60));
            im.setDisplayName("§cModerator Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
        }
		if(PermissionsEx.getUser(p).inGroup("SrMod")) {
        	ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(252, 60, 60));
            im.setDisplayName("§cSrMod Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
        }
		if(PermissionsEx.getUser(p).inGroup("Dev")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(0, 237, 255));
            im.setDisplayName("§bDeveloper Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Admin")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(250, 0, 0));
            im.setDisplayName("§4Admin Boots");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
		if(PermissionsEx.getUser(p).inGroup("Owner")) {
            ItemStack h1 = new ItemStack(Material.LEATHER_BOOTS);
            LeatherArmorMeta im = (LeatherArmorMeta) h1.getItemMeta();
            im.setColor(Color.fromRGB(250, 0, 0));
            im.setDisplayName("§4§kil|i  §r§4§lOwner Boots §r§4§kil|i");
            h1.setItemMeta(im);
            p.getInventory().setBoots(null);
            p.getInventory().setBoots(h1);
		}
	}
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
	      Player p = e.getPlayer();
	      if(Bukkit.getOnlinePlayers().size() > Bukkit.getMaxPlayers()) {
	            if(p.hasPermission("community.premiumjoin")) {
	               Player k = getRandomPlayerWhosNotPremium();
	               if(k == null) {
	                  e.disallow(Result.KICK_FULL, "§cNiemand in der NowUnity kann gekickt werden.");
	               }else{
	                  k.kickPlayer("§cDu wurdest gekickt, um für ein Teammitglied, oder §6Premium Spieler §cPlatz zu machen!");
	                  e.setResult(Result.ALLOWED);
	               }
	            }else {
	               e.disallow(Result.KICK_OTHER, "§cDie NowUnity ist voll! Kaufe dir §6Premium §c, um trotzdem zujoinen.");
	       }
	   }
	}
	public static Player getRandomPlayerWhosNotPremium() {
	      List<String> players = new ArrayList<>();
	      Player player = null;
	      Random random = new Random();
	      for(Player p : Bukkit.getOnlinePlayers()) {
	         if(PermissionsEx.getUser(p).inGroup("Spieler")) {
	            players.add(p.getName());
	         }
	      }
	      if(players.size() == 0) {
	         player = null;
	      }else{
	         player = Bukkit.getPlayer(players.get(random.nextInt(players.size())));
	      }
	      return player;
	   }
}
