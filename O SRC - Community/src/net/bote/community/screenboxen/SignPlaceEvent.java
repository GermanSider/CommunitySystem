package net.bote.community.screenboxen;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import de.inventivegames.hologram.Hologram;
import de.inventivegames.hologram.HologramAPI;
import net.bote.community.main.BoxArrayClass;
import net.bote.community.main.Main;
import net.bote.community.screenbox.cmd.CMD_box;

public class SignPlaceEvent implements Listener {

	private Main plugin1;
	
	private static String boxprefix = "§5Screenboxen §7» ";
	
	public static Sign s;
	
	public SignPlaceEvent(Main main) {
		this.plugin1 = main;
		this.plugin1.getServer().getPluginManager().registerEvents(this, plugin1);
	}

	@EventHandler
	public void onSignClick(PlayerInteractEvent e) {
		Player p = (Player)e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getClickedBlock().getState() instanceof Sign) {
				
				s = (Sign) e.getClickedBlock().getState();
				
				String id = s.getLine(3);
				
				if(!s.getLine(1).equalsIgnoreCase("§cNicht besetzt!") && s.getLine(0).equalsIgnoreCase("§5ScreenBox")) { // Falls jemand schon drin ist!
					
					if(BoxArrayClass.box1.contains(p) || BoxArrayClass.box2.contains(p) || BoxArrayClass.box3.contains(p) || BoxArrayClass.box4.contains(p) || 
							BoxArrayClass.box5.contains(p) || BoxArrayClass.box6.contains(p) || BoxArrayClass.box7.contains(p) || BoxArrayClass.box8.contains(p) || 
							BoxArrayClass.box9.contains(p) || BoxArrayClass.box10.contains(p) || BoxArrayClass.box11.contains(p) || BoxArrayClass.box12.contains(p) || 
							BoxArrayClass.box13.contains(p) || BoxArrayClass.box14.contains(p) || BoxArrayClass.box15.contains(p) || BoxArrayClass.box16.contains(p) || 
							BoxArrayClass.box17.contains(p) || BoxArrayClass.box18.contains(p) || BoxArrayClass.box19.contains(p) || BoxArrayClass.box20.contains(p) ||
							BoxArrayClass.isInbox1.contains(p) || BoxArrayClass.isInbox2.contains(p) || BoxArrayClass.isInbox3.contains(p) || BoxArrayClass.isInbox4.contains(p) || 
							BoxArrayClass.isInbox5.contains(p) || BoxArrayClass.isInbox6.contains(p) || BoxArrayClass.isInbox7.contains(p) || BoxArrayClass.isInbox8.contains(p) || 
							BoxArrayClass.isInbox9.contains(p) || BoxArrayClass.isInbox10.contains(p) || BoxArrayClass.isInbox11.contains(p) || BoxArrayClass.isInbox12.contains(p) || 
							BoxArrayClass.isInbox13.contains(p) || BoxArrayClass.isInbox14.contains(p) || BoxArrayClass.isInbox15.contains(p) || BoxArrayClass.isInbox16.contains(p) || 
							BoxArrayClass.isInbox17.contains(p) || BoxArrayClass.isInbox18.contains(p) || BoxArrayClass.isInbox19.contains(p) || BoxArrayClass.isInbox20.contains(p)
							) {
						if(!p.hasPermission("community.box")) {
							p.sendMessage(boxprefix+"§cDu kannst nicht in mehr als eine Warteschlange!");
						} else {
							p.sendMessage(boxprefix+"§cDu kannst nicht in mehr als eine Warteschlange / Box!");
						}
					} else {
					if(id.equalsIgnoreCase("1")) {
						if(!BoxArrayClass.box1.contains(p)) {
								BoxArrayClass.box1.add(p);
								int platz = BoxArrayClass.box1.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("2")) {
						if(!BoxArrayClass.box2.contains(p)) {
								BoxArrayClass.box2.add(p);
								int platz = BoxArrayClass.box2.indexOf(p) + 1;
								p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("3")) {
						if(!BoxArrayClass.box3.contains(p)) {
								BoxArrayClass.box3.add(p);
								int platz = BoxArrayClass.box3.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("4")) {
						if(!BoxArrayClass.box4.contains(p)) {
								BoxArrayClass.box4.add(p);
								int platz = BoxArrayClass.box4.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("5")) {
						if(!BoxArrayClass.box5.contains(p)) {
								BoxArrayClass.box5.add(p);
								int platz = BoxArrayClass.box5.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					
					if(id.equalsIgnoreCase("6")) {
						if(!BoxArrayClass.box6.contains(p)) {
								BoxArrayClass.box6.add(p);
								int platz = BoxArrayClass.box6.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("7")) {
						if(!BoxArrayClass.box7.contains(p)) {
								BoxArrayClass.box7.add(p);
								int platz = BoxArrayClass.box7.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					if(id.equalsIgnoreCase("8")) {
						if(!BoxArrayClass.box8.contains(p)) {
								BoxArrayClass.box8.add(p);
								int platz = BoxArrayClass.box8.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					if(id.equalsIgnoreCase("9")) {
						if(!BoxArrayClass.box9.contains(p)) {
								BoxArrayClass.box9.add(p);
								int platz = BoxArrayClass.box9.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					if(id.equalsIgnoreCase("10")) {
						if(!BoxArrayClass.box10.contains(p)) {
								BoxArrayClass.box10.add(p);
								int platz = BoxArrayClass.box10.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					if(id.equalsIgnoreCase("11")) {
						if(!BoxArrayClass.box11.contains(p)) {
								BoxArrayClass.box11.add(p);
								int platz = BoxArrayClass.box11.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					if(id.equalsIgnoreCase("12")) {
						if(!BoxArrayClass.box12.contains(p)) {
								BoxArrayClass.box12.add(p);
								int platz = BoxArrayClass.box12.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					if(id.equalsIgnoreCase("13")) {
						if(!BoxArrayClass.box13.contains(p)) {
								BoxArrayClass.box13.add(p);
								int platz = BoxArrayClass.box13.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("14")) {
						if(!BoxArrayClass.box14.contains(p)) {
								BoxArrayClass.box14.add(p);
								int platz = BoxArrayClass.box14.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("15")) {
						if(!BoxArrayClass.box15.contains(p)) {
								BoxArrayClass.box15.add(p);
								int platz = BoxArrayClass.box15.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("16")) {
						if(!BoxArrayClass.box16.contains(p)) {
								BoxArrayClass.box16.add(p);
								int platz = BoxArrayClass.box16.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("17")) {
						if(!BoxArrayClass.box17.contains(p)) {
								BoxArrayClass.box17.add(p);
								int platz = BoxArrayClass.box17.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("18")) {
						if(!BoxArrayClass.box18.contains(p)) {
								BoxArrayClass.box18.add(p);
								int platz = BoxArrayClass.box18.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("19")) {
						if(!BoxArrayClass.box19.contains(p)) {
								BoxArrayClass.box19.add(p);
								int platz = BoxArrayClass.box19.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
					if(id.equalsIgnoreCase("20")) {
						if(!BoxArrayClass.box20.contains(p)) {
								BoxArrayClass.box20.add(p);
								int platz = BoxArrayClass.box20.indexOf(p) + 1; p.sendMessage(boxprefix+"§eDu wurdest zur Warteschlange hinzugefügt! §oPosition: " + platz);
								
						} else {
							p.sendMessage(boxprefix+"§cDu bist bereits in der §eWarteschlange");
						}
					}
					
				}
				} else if(s.getLine(0).equalsIgnoreCase("§5ScreenBox")) {
					if(p.hasPermission("community.box")) {
						p.sendMessage(boxprefix+"§2Du bist nun in der Box! §6Verlasse sie mit §l/leavebox");
						
						if(id.equalsIgnoreCase("1")) {
							BoxArrayClass.isInbox1.add(p);
						}
						if(id.equalsIgnoreCase("2")) {
							BoxArrayClass.isInbox2.add(p);
						}
						if(id.equalsIgnoreCase("3")) {
							BoxArrayClass.isInbox3.add(p);
						}
						if(id.equalsIgnoreCase("4")) {
							BoxArrayClass.isInbox4.add(p);
						}
						if(id.equalsIgnoreCase("5")) {
							BoxArrayClass.isInbox5.add(p);
						}
						if(id.equalsIgnoreCase("6")) {
							BoxArrayClass.isInbox6.add(p);
						}
						if(id.equalsIgnoreCase("7")) {
							BoxArrayClass.isInbox7.add(p);
						}
						if(id.equalsIgnoreCase("8")) {
							BoxArrayClass.isInbox8.add(p);
						}
						if(id.equalsIgnoreCase("9")) {
							BoxArrayClass.isInbox9.add(p);
						}
						if(id.equalsIgnoreCase("10")) {
							BoxArrayClass.isInbox10.add(p);
						}
						if(id.equalsIgnoreCase("11")) {
							BoxArrayClass.isInbox11.add(p);
						}
						if(id.equalsIgnoreCase("12")) {
							BoxArrayClass.isInbox12.add(p);
						}
						if(id.equalsIgnoreCase("13")) {
							BoxArrayClass.isInbox13.add(p);
						}
						if(id.equalsIgnoreCase("14")) {
							BoxArrayClass.isInbox14.add(p);
						}
						if(id.equalsIgnoreCase("15")) {
							BoxArrayClass.isInbox15.add(p);
						}
						if(id.equalsIgnoreCase("16")) {
							BoxArrayClass.isInbox16.add(p);
						}
						if(id.equalsIgnoreCase("17")) {
							BoxArrayClass.isInbox17.add(p);
						}
						if(id.equalsIgnoreCase("18")) {
							BoxArrayClass.isInbox18.add(p);
							
						}
						if(id.equalsIgnoreCase("19")) {
							BoxArrayClass.isInbox19.add(p);
						}
						if(id.equalsIgnoreCase("20")) {
							BoxArrayClass.isInbox20.add(p);
						}
						
						if(p.getName().length() < 12) {
						s.setLine(1, "§8§l-- §c" + p.getName() + "§8 --");                                               // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						} else {
							s.setLine(1, "§7§o[ * Klick * ]");
						}
						
						s.update(true);
						
						String world = BoxManager.cfg.getString(id + ".holo.world");
						double x = BoxManager.cfg.getDouble(id + ".holo.x");
						double y = BoxManager.cfg.getDouble(id + ".holo.y");
						double z = BoxManager.cfg.getDouble(id + ".holo.z");
						double yaw = BoxManager.cfg.getDouble(id + ".holo.yaw");
						double pitch = BoxManager.cfg.getDouble(id + ".holo.pitch");
						
						Location hololoc = new Location(Bukkit.getWorld(world), x, y, z);
						
						
						hololoc.setYaw((float)yaw);
						hololoc.setPitch((float)pitch);
						
						Hologram holo = HologramAPI.createHologram(hololoc, "§8§l-- §5" + p.getName() + " §8--");
						holo.spawn();
						
						teleportToBoxSpawn(id, p);
						
						if(id.equalsIgnoreCase("1")) {
							if(BoxArrayClass.started1 == false) {
								beginBoxTime("1");
							}
						}
						if(id.equalsIgnoreCase("2")) {
							if(BoxArrayClass.started2 == false) {
								beginBoxTime("2");
							}
						}
						if(id.equalsIgnoreCase("3")) {
							if(BoxArrayClass.started3 == false) {
								beginBoxTime("3");
							}
						}
						if(id.equalsIgnoreCase("4")) {
							if(BoxArrayClass.started4 == false) {
								beginBoxTime("4");
							}
						}
						if(id.equalsIgnoreCase("5")) {
							if(BoxArrayClass.started5 == false) {
								beginBoxTime("5");
							}
						}
						if(id.equalsIgnoreCase("6")) {
							if(BoxArrayClass.started6 == false) {
								beginBoxTime("6");
							}
						}
						if(id.equalsIgnoreCase("7")) {
							if(BoxArrayClass.started7 == false) {
								beginBoxTime("7");
							}
						}
						if(id.equalsIgnoreCase("8")) {
							if(BoxArrayClass.started8 == false) {
								beginBoxTime("8");
							}
						}
						if(id.equalsIgnoreCase("1")) {
							if(BoxArrayClass.started1 == false) {
								beginBoxTime("1");
							}
						}
						if(id.equalsIgnoreCase("9")) {
							if(BoxArrayClass.started9 == false) {
								beginBoxTime("9");
							}
						}
						if(id.equalsIgnoreCase("10")) {
							if(BoxArrayClass.started10 == false) {
								beginBoxTime("10");
							}
						}
						if(id.equalsIgnoreCase("11")) {
							if(BoxArrayClass.started11 == false) {
								beginBoxTime("11");
							}
						}
						if(id.equalsIgnoreCase("12")) {
							if(BoxArrayClass.started12 == false) {
								beginBoxTime("12");
							}
						}
						if(id.equalsIgnoreCase("13")) {
							if(BoxArrayClass.started13 == false) {
								beginBoxTime("13");
							}
						}
						if(id.equalsIgnoreCase("14")) {
							if(BoxArrayClass.started14 == false) {
								beginBoxTime("14");
							}
						}
						if(id.equalsIgnoreCase("15")) {
							if(BoxArrayClass.started15 == false) {
								beginBoxTime("15");
							}
						}
						if(id.equalsIgnoreCase("16")) {
							if(BoxArrayClass.started16 == false) {
								beginBoxTime("16");
							}
						}
						if(id.equalsIgnoreCase("17")) {
							if(BoxArrayClass.started17 == false) {
								beginBoxTime("17");
							}
						}
						if(id.equalsIgnoreCase("18")) {
							if(BoxArrayClass.started18 == false) {
								beginBoxTime("18");
							}
						}
						if(id.equalsIgnoreCase("19")) {
							if(BoxArrayClass.started19 == false) {
								beginBoxTime("19");
							}
						}
						if(id.equalsIgnoreCase("20")) {
							if(BoxArrayClass.started20 == false) {
								beginBoxTime("20");
							}
						}
						
					} else {
						p.sendMessage(boxprefix+"§cEs ist zur Zeit kein §5YouTuber §cin dieser Box!");
					}
				}
			}
		}
	}
	@EventHandler
	public void onBoxSignChange(SignChangeEvent e) {
		Player p = e.getPlayer();
		if(e.getLine(0).equalsIgnoreCase("[box]")) {
			if(e.getLine(1).equals("1") || e.getLine(1).equals("2") || e.getLine(1).equals("3") || e.getLine(1).equals("4") || e.getLine(1).equals("5") || 
					e.getLine(1).equals("6") || e.getLine(1).equals("7") || e.getLine(1).equals("8") || e.getLine(1).equals("9") || e.getLine(1).equals("10") || 
					e.getLine(1).equals("11") || e.getLine(1).equals("13") || e.getLine(1).equals("14") || e.getLine(1).equals("15") || e.getLine(1).equals("16") || 
					e.getLine(1).equals("17") || e.getLine(1).equals("18") || e.getLine(1).equals("19") || e.getLine(1).equals("20")) {
				
				String id = e.getLine(1);
				if(Main.getInstance().getBoxManager().isBoxAlreadyExists(id)) {
				e.setLine(0, "§5ScreenBox");
				e.setLine(1, "§cNicht besetzt!");
				e.setLine(2, "");
				e.setLine(3, id);
				
				p.sendMessage(CMD_box.boxprefix+"§aDu hast das Schild für die Box mit der ID §b" + id + " §agesetzt!");
				} else {
					p.sendMessage(CMD_box.boxprefix+"§cDiese Box wurde noch nicht erstellt!");
					p.sendMessage(CMD_box.boxprefix+"§4>> Schild wurde nicht erstellt!");
				}
			} else {
				p.sendMessage(CMD_box.boxprefix+"§cDu kannst nur IDs mit der Value von 1 bis 20 angeben!");
				p.sendMessage(CMD_box.boxprefix+"§4>> Schild wurde nicht erstellt!");
			}
		}
	}
	public static void teleportToBoxSpawn(String id, Player p) {
		String world = BoxManager.cfg.getString(id + ".spawn.world");
		double x = BoxManager.cfg.getDouble(id + ".spawn.x");
		double y = BoxManager.cfg.getDouble(id + ".spawn.y");
		double z = BoxManager.cfg.getDouble(id + ".spawn.z");
		double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
		double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
		
		Location loc = new Location(Bukkit.getWorld(world), x, y, z);
		loc.setYaw((float) yaw);
		loc.setPitch((float) pitch);
		p.teleport(loc);
	}

	public void beginBoxTime(String id) {
		
		if(id.equalsIgnoreCase("1")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(BoxArrayClass.box1.size() != 0) {
				
				Player t = BoxArrayClass.box1.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§aDu wurdest teleportiert! Du hast nun §2§l10 §r§aSekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box1.remove(t);
						t.sendMessage(boxprefix+"§cDeine Screenzeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("1");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("1");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started1 = true;
		}
		if(id.equalsIgnoreCase("2")) {
			
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box2.isEmpty()) {
				
				Player t = BoxArrayClass.box2.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box2.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("2");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("2");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started2 = true;
		}
		if(id.equalsIgnoreCase("3")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			
			if(!BoxArrayClass.box3.isEmpty()) {
				
				Player t = BoxArrayClass.box3.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box3.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("3");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("3");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started3 = true;
		}
		if(id.equalsIgnoreCase("4")) {
			
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			
			if(!BoxArrayClass.box4.isEmpty()) {
				
				Player t = BoxArrayClass.box4.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box4.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("4");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("4");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started4 = true;
		}
		if(id.equalsIgnoreCase("5")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			
			if(!BoxArrayClass.box5.isEmpty()) {
				
				Player t = BoxArrayClass.box5.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box5.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("5");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("5");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started5 = true;
		}
		if(id.equalsIgnoreCase("6")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			
			if(!BoxArrayClass.box6.isEmpty()) {
				
				Player t = BoxArrayClass.box6.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box6.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("6");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("6");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started6 = true;
		}
		if(id.equalsIgnoreCase("7")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			
			if(!BoxArrayClass.box7.isEmpty()) {
				
				Player t = BoxArrayClass.box7.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box7.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("7");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("7");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started7 = true;
		}
		
		if(id.equalsIgnoreCase("8")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box8.isEmpty()) {
				
				Player t = BoxArrayClass.box8.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box8.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("8");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("8");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started8 = true;
		}
		if(id.equalsIgnoreCase("9")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box9.isEmpty()) {
				
				Player t = BoxArrayClass.box9.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§6Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box9.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("9");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("9");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started9 = true;
		}
		if(id.equalsIgnoreCase("10")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box10.isEmpty()) {
				
				Player t = BoxArrayClass.box10.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box10.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("10");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("10");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started10 = true;
		}
		if(id.equalsIgnoreCase("11")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box11.isEmpty()) {
				
				Player t = BoxArrayClass.box11.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box11.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("11");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("11");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started11 = true;
		}
		if(id.equalsIgnoreCase("12")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box12.isEmpty()) {
				
				Player t = BoxArrayClass.box12.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box12.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("12");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("12");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started12 = true;
		}
		if(id.equalsIgnoreCase("13")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box13.isEmpty()) {
				
				Player t = BoxArrayClass.box13.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box13.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("13");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("13");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started13 = true;
		}
		if(id.equalsIgnoreCase("14")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box14.isEmpty()) {
				
				Player t = BoxArrayClass.box14.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box14.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("14");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("14");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started14 = true;
		}
		if(id.equalsIgnoreCase("15")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box15.isEmpty()) {
				
				Player t = BoxArrayClass.box15.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box15.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("15");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("15");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started15 = true;
		}
		if(id.equalsIgnoreCase("16")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box16.isEmpty()) {
				
				Player t = BoxArrayClass.box16.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box16.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("16");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("16");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started16 = true;
		}
		if(id.equalsIgnoreCase("17")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box17.isEmpty()) {
				
				Player t = BoxArrayClass.box17.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box17.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("17");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("17");
					}
					
				}, 20*10);
			}
			BoxArrayClass.started17 = true;
		}
		if(id.equalsIgnoreCase("18")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box18.isEmpty()) {
				
				Player t = BoxArrayClass.box18.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				BoxArrayClass.started18 = true;
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box18.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("18");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("18");
					}
					
				}, 20*10);
			}
		}
		if(id.equalsIgnoreCase("19")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box19.isEmpty()) {
				
				Player t = BoxArrayClass.box19.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				BoxArrayClass.started19 = true;
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box19.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("19");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("19");
					}
					
				}, 20*10);
			}
		}
		if(id.equalsIgnoreCase("20")) {
			String world = BoxManager.cfg.getString(id + ".spawn.world");
			double x = BoxManager.cfg.getDouble(id + ".spawn.x");
			double y = BoxManager.cfg.getDouble(id + ".spawn.y");
			double z = BoxManager.cfg.getDouble(id + ".spawn.z");
			double yaw = BoxManager.cfg.getDouble(id + ".spawn.yaw");
			double pitch = BoxManager.cfg.getDouble(id + ".spawn.pitch");
			
			if(!BoxArrayClass.box20.isEmpty()) {
				
				Player t = BoxArrayClass.box20.get(0);
				Location loc = new Location(Bukkit.getWorld(world), x, y, z);
				loc.setYaw((float) yaw);
				loc.setPitch((float) pitch);
				t.sendMessage(boxprefix+"§7Du wurdest teleportiert! Du hast nun §l10 §r§6Sekunden um ein Foto zu machen!");
				Location oldLoc = t.getLocation();
				t.teleport(loc);
				
				BoxArrayClass.started20 = true;
				
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						BoxArrayClass.box20.remove(t);
						t.sendMessage(boxprefix+"§cDeine Zeit ist abgelaufen!");
						t.teleport(oldLoc);
						beginBoxTime("20");
					}
					
				}, 20*10);
			} else {
				Bukkit.getScheduler().runTaskLater(plugin1, new Runnable() {

					@Override
					public void run() {
						beginBoxTime("20");
					}
					
				}, 20*10);
			}
		}
		
	}
}