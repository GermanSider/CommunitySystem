package net.bote.community.main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;

import de.inventivegames.hologram.HologramAPI;
import net.bote.community.screenboxen.BoxManager;

public class Methoden {
	
	private static String boxprefix = "§5Screenboxen §7» ";
	
	public static ArrayList<Player> getBoxQueue(Player p) {

		if(BoxArrayClass.box1.contains(p)) {
			return BoxArrayClass.box1;
		}
		else if(BoxArrayClass.box2.contains(p)) {
			return BoxArrayClass.box2;
		}
		else if(BoxArrayClass.box3.contains(p)) {
			return BoxArrayClass.box3;
		}
		else if(BoxArrayClass.box4.contains(p)) {
			return BoxArrayClass.box4;
		}
		else if(BoxArrayClass.box5.contains(p)) {
			return BoxArrayClass.box5;
		}
		else if(BoxArrayClass.box6.contains(p)) {
			return BoxArrayClass.box6;
		}
		else if(BoxArrayClass.box7.contains(p)) {
			return BoxArrayClass.box7;
		}
		else if(BoxArrayClass.box8.contains(p)) {
			return BoxArrayClass.box8;
		}
		else if(BoxArrayClass.box9.contains(p)) {
			return BoxArrayClass.box9;
		}
		else if(BoxArrayClass.box10.contains(p)) {
			return BoxArrayClass.box10;
		}
		else if(BoxArrayClass.box11.contains(p)) {
			return BoxArrayClass.box11;
		}
		else if(BoxArrayClass.box12.contains(p)) {
			return BoxArrayClass.box12;
		}
		else if(BoxArrayClass.box13.contains(p)) {
			return BoxArrayClass.box13;
		}
		else if(BoxArrayClass.box14.contains(p)) {
			return BoxArrayClass.box14;
		}
		else if(BoxArrayClass.box15.contains(p)) {
			return BoxArrayClass.box15;
		}
		else if(BoxArrayClass.box16.contains(p)) {
			return BoxArrayClass.box16;
		}
		else if(BoxArrayClass.box17.contains(p)) {
			return BoxArrayClass.box17;
		}
		else if(BoxArrayClass.box18.contains(p)) {
			return BoxArrayClass.box18;
		}
		else if(BoxArrayClass.box19.contains(p)) {
			return BoxArrayClass.box19;
		}
		else if(BoxArrayClass.box20.contains(p)) {
			return BoxArrayClass.box20;
		} else {
			return null;
		}
	}
	
	
	public static ArrayList<Player> getBoxByQueueList(Player p) {
		if(BoxArrayClass.box1.contains(p)) {
			return BoxArrayClass.isInbox1;
		}
		else if(BoxArrayClass.box2.contains(p)) {
			return BoxArrayClass.isInbox2;
		}
		else if(BoxArrayClass.box3.contains(p)) {
			return BoxArrayClass.isInbox3;
		}
		else if(BoxArrayClass.box4.contains(p)) {
			return BoxArrayClass.isInbox4;
		}
		else if(BoxArrayClass.box5.contains(p)) {
			return BoxArrayClass.isInbox5;
		}
		else if(BoxArrayClass.box6.contains(p)) {
			return BoxArrayClass.isInbox6;
		}
		else if(BoxArrayClass.box7.contains(p)) {
			return BoxArrayClass.isInbox7;
		}
		else if(BoxArrayClass.box8.contains(p)) {
			return BoxArrayClass.isInbox8;
		}
		else if(BoxArrayClass.box9.contains(p)) {
			return BoxArrayClass.isInbox9;
		}
		else if(BoxArrayClass.box10.contains(p)) {
			return BoxArrayClass.isInbox10;
		}
		else if(BoxArrayClass.box11.contains(p)) {
			return BoxArrayClass.isInbox11;
		}
		else if(BoxArrayClass.box12.contains(p)) {
			return BoxArrayClass.isInbox12;
		}
		else if(BoxArrayClass.box13.contains(p)) {
			return BoxArrayClass.isInbox13;
		}
		else if(BoxArrayClass.box14.contains(p)) {
			return BoxArrayClass.isInbox14;
		}
		else if(BoxArrayClass.box15.contains(p)) {
			return BoxArrayClass.isInbox15;
		}
		else if(BoxArrayClass.box16.contains(p)) {
			return BoxArrayClass.isInbox16;
		}
		else if(BoxArrayClass.box17.contains(p)) {
			return BoxArrayClass.isInbox17;
		}
		else if(BoxArrayClass.box18.contains(p)) {
			return BoxArrayClass.isInbox18;
		}
		else if(BoxArrayClass.box19.contains(p)) {
			return BoxArrayClass.isInbox19;
		}
		else if(BoxArrayClass.box20.contains(p)) {
			return BoxArrayClass.isInbox20;
		} else {
			return null;
		}
	}
	
	
	public static boolean isInBoxQueue(Player p) {
		if(getBoxQueue(p) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isInBox(Player p) {
		if(BoxArrayClass.isInbox1.contains(p) || BoxArrayClass.isInbox2.contains(p) || BoxArrayClass.isInbox3.contains(p) || BoxArrayClass.isInbox4.contains(p) || 
				BoxArrayClass.isInbox5.contains(p) || BoxArrayClass.isInbox6.contains(p) || BoxArrayClass.isInbox7.contains(p) || BoxArrayClass.isInbox8.contains(p) || 
				BoxArrayClass.isInbox9.contains(p) || BoxArrayClass.isInbox10.contains(p) || BoxArrayClass.isInbox11.contains(p) || BoxArrayClass.isInbox12.contains(p) || 
				BoxArrayClass.isInbox13.contains(p) || BoxArrayClass.isInbox14.contains(p) || BoxArrayClass.isInbox15.contains(p) || BoxArrayClass.isInbox16.contains(p) || 
				BoxArrayClass.isInbox17.contains(p) || BoxArrayClass.isInbox18.contains(p) || BoxArrayClass.isInbox19.contains(p) || BoxArrayClass.isInbox20.contains(p)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void leaveScreenBox(Player p) {
		if(p.hasPermission("community.box") || p.hasPermission("community.admin")) {
			
			
			if(BoxArrayClass.isInbox1.contains(p) || BoxArrayClass.isInbox2.contains(p) || BoxArrayClass.isInbox3.contains(p) || BoxArrayClass.isInbox4.contains(p) || 
					BoxArrayClass.isInbox5.contains(p) || BoxArrayClass.isInbox6.contains(p) || BoxArrayClass.isInbox7.contains(p) || BoxArrayClass.isInbox8.contains(p) || 
					BoxArrayClass.isInbox9.contains(p) || BoxArrayClass.isInbox10.contains(p) || BoxArrayClass.isInbox11.contains(p) || BoxArrayClass.isInbox12.contains(p) || 
					BoxArrayClass.isInbox13.contains(p) || BoxArrayClass.isInbox14.contains(p) || BoxArrayClass.isInbox15.contains(p) || BoxArrayClass.isInbox16.contains(p) || 
					BoxArrayClass.isInbox17.contains(p) || BoxArrayClass.isInbox18.contains(p) || BoxArrayClass.isInbox19.contains(p) || BoxArrayClass.isInbox20.contains(p)) {
				
				for(Player all : Bukkit.getOnlinePlayers()) {
					if(BoxArrayClass.isInbox1.contains(p)) {
						if(BoxArrayClass.box1.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
						}
						
						BoxArrayClass.box1.clear();
						BoxArrayClass.isInbox1.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String world1 = BoxManager.cfg.getString("1.sign.world");
						double x1 = BoxManager.cfg.getDouble("1.sign.x");
						double y1 = BoxManager.cfg.getDouble("1.sign.y");
						double z1 = BoxManager.cfg.getDouble("1.sign.z");
						double yaw1 = BoxManager.cfg.getDouble("1.sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble("1.sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update(true);
						
						String id = "1";
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox2.contains(p)) {
						if(BoxArrayClass.box2.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
						}
						
						BoxArrayClass.box2.clear();
						BoxArrayClass.isInbox2.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						String world1 = BoxManager.cfg.getString("2.sign.world");
						double x1 = BoxManager.cfg.getDouble("2.sign.x");
						double y1 = BoxManager.cfg.getDouble("2.sign.y");
						double z1 = BoxManager.cfg.getDouble("2.sign.z");
						double yaw1 = BoxManager.cfg.getDouble("2.sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble("2.sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						

						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update(true);
						
String id = "2";
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox3.contains(p)) {
						if(BoxArrayClass.box3.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box3.clear();
						BoxArrayClass.isInbox3.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String world1 = BoxManager.cfg.getString("3.sign.world");
						double x1 = BoxManager.cfg.getDouble("3.sign.x");
						double y1 = BoxManager.cfg.getDouble("3.sign.y");
						double z1 = BoxManager.cfg.getDouble("3.sign.z");
						double yaw1 = BoxManager.cfg.getDouble("3.sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble("3.sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						

						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update(true);
String id = "3";
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox4.contains(p)) {
						if(BoxArrayClass.box4.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box4.clear();
						BoxArrayClass.isInbox4.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String world1 = BoxManager.cfg.getString("4.sign.world");
						double x1 = BoxManager.cfg.getDouble("4.sign.x");
						double y1 = BoxManager.cfg.getDouble("4.sign.y");
						double z1 = BoxManager.cfg.getDouble("4.sign.z");
						double yaw1 = BoxManager.cfg.getDouble("4.sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble("4.sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						

						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update(true);
						
String id = "4";
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox5.contains(p)) {
						if(BoxArrayClass.box5.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box5.clear();
						BoxArrayClass.isInbox5.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String id = "5";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox6.contains(p)) {
						if(BoxArrayClass.box6.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box6.clear();
						BoxArrayClass.isInbox6.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String id = "6";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox7.contains(p)) {
						if(BoxArrayClass.box7.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
						}
						
						BoxArrayClass.box7.clear();
						BoxArrayClass.isInbox7.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String id = "7";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox8.contains(p)) {
						if(BoxArrayClass.box8.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
						}
						
						BoxArrayClass.box8.clear();
						BoxArrayClass.isInbox8.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						
						String id = "8";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox9.contains(p)) {
						if(BoxArrayClass.box9.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
						}
						
						BoxArrayClass.box9.clear();
						BoxArrayClass.isInbox9.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String id = "9";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					
					if(BoxArrayClass.isInbox10.contains(p)) {
						if(BoxArrayClass.box10.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box10.clear();
						BoxArrayClass.isInbox10.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String id = "10";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox11.contains(p)) {
						if(BoxArrayClass.box11.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						BoxArrayClass.box11.clear();
						BoxArrayClass.isInbox11.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
						
						String id = "11";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);
						
						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);
						
						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox12.contains(p)) {
						if(BoxArrayClass.box12.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box12.clear();
						BoxArrayClass.isInbox12.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "12";
						
						String world1 = BoxManager.cfg.getString(id +".sign.world");
						double x1 = BoxManager.cfg.getDouble(id +".sign.x");
						double y1 = BoxManager.cfg.getDouble(id +".sign.y");
						double z1 = BoxManager.cfg.getDouble(id +".sign.z");
						double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
						double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
						Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
						loc1.setYaw((float)yaw1);
						loc1.setPitch((float)pitch1);

						Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

						Sign s = (Sign) b.getState();
						s.setLine(0, "§5ScreenBox");
						s.setLine(1, "§cNicht besetzt!");
						s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox13.contains(p)) {
						if(BoxArrayClass.box13.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box13.clear();
						BoxArrayClass.isInbox13.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "13";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox14.contains(p)) {
						if(BoxArrayClass.box14.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box14.clear();
						BoxArrayClass.isInbox1.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "14";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox15.contains(p)) {
						if(BoxArrayClass.box15.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box15.clear();
						BoxArrayClass.isInbox15.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "15";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox16.contains(p)) {
						if(BoxArrayClass.box16.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box16.clear();
						BoxArrayClass.isInbox16.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "16";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox17.contains(p)) {
						if(BoxArrayClass.box17.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box17.clear();
						BoxArrayClass.isInbox17.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "17";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}if(BoxArrayClass.isInbox18.contains(p)) {
						if(BoxArrayClass.box18.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box18.clear();
						BoxArrayClass.isInbox18.clear();
					    
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "18";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox19.contains(p)) {
						if(BoxArrayClass.box19.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box19.clear();
						BoxArrayClass.isInbox19.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "19";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					if(BoxArrayClass.isInbox20.contains(p)) {
						if(BoxArrayClass.box20.contains(all)) {
							all.sendMessage(boxprefix+"§5" + p.getName() + " §7ist aus der Box gegangen! Du bist §cnicht mehr §7in der Warteschlange.");
							
						}
						
						BoxArrayClass.box20.clear();
						BoxArrayClass.isInbox20.clear();
						
						p.sendMessage(boxprefix+"§aDu bist aus der Box gegangen!");
String id = "20";
						
String world1 = BoxManager.cfg.getString(id +".sign.world");
double x1 = BoxManager.cfg.getDouble(id +".sign.x");
double y1 = BoxManager.cfg.getDouble(id +".sign.y");
double z1 = BoxManager.cfg.getDouble(id +".sign.z");
double yaw1 = BoxManager.cfg.getDouble(id +".sign.yaw");
double pitch1 = BoxManager.cfg.getDouble(id +".sign.pitch");
Location loc1 = new Location(Bukkit.getWorld(world1), x1, y1,z1);
loc1.setYaw((float)yaw1);
loc1.setPitch((float)pitch1);

Block b = Bukkit.getServer().getWorld(world1).getBlockAt(loc1);

Sign s = (Sign) b.getState();
s.setLine(0, "§5ScreenBox");
s.setLine(1, "§cNicht besetzt!");
s.update();
						
						String world = BoxManager.cfg.getString(id +".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						HologramAPI.removeHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
					}
					
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
					
				}
				
			} else {
				p.sendMessage(boxprefix+"§cDu bist in keiner Box!");
			}
			
			// BEFEHLE DANACH
			
			
	} else {
		
		p.sendMessage(Main.getPrefix()+"§cKein Recht!");
		
		}
	}

}
