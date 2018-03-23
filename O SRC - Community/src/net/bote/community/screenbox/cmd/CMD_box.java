package net.bote.community.screenbox.cmd;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.bote.community.main.Main;
import net.bote.community.screenboxen.BoxManager;

public class CMD_box implements CommandExecutor {
	
	public static String boxprefix = "§5Screenboxen §7» ";

	private Main plugin;
	
	public CMD_box(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(p.hasPermission("community.admin") || p.hasPermission("community.setup")) {
				
				switch(args.length) {
				
				case 0:
					sendPlayerBoxHelpMessage(p);
					break;
				case 1:
					sendPlayerBoxHelpMessage(p);
					break;
				case 2:
					if(args[0].equalsIgnoreCase("create")) {
						String name = args[1];
						if(name.equals("1") || name.equals("2") || name.equals("3") || name.equals("4") || name.equals("5") || name.equals("6") || name.equals("7") || 
								name.equals("8") || name.equals("9") || name.equals("10") || name.equals("11") || name.equals("12") || name.equals("13") || 
								name.equals("14") || name.equals("15") || name.equals("16") || name.equals("17") || name.equals("18") || name.equals("19") ||
								name.equals("20")) {
							Main.getInstance().getBoxManager().createNewBox(p, name);
							p.playSound(p.getLocation(), Sound.FIREWORK_BLAST, 3, 3);
						} else {
							p.sendMessage(CMD_box.boxprefix + "§cDu kannst nur Screenboxen von §6ID 1 bis 20 §cerstellen! §eNutze: /box create <ID>");
						}
					}
					if(args[0].equalsIgnoreCase("setspawn")) {
						String name = args[1];
						if(name.equals("1") || name.equals("2") || name.equals("3") || name.equals("4") || name.equals("5") || name.equals("6") || name.equals("7") || 
							name.equals("8") || name.equals("9") || name.equals("10") || name.equals("11") || name.equals("12") || name.equals("13") || 
							name.equals("14") || name.equals("15") || name.equals("16") || name.equals("17") || name.equals("18") || name.equals("19") ||
							name.equals("20")) {
								
								Main.getInstance().getBoxManager().setBoxSpawn(p, name);
								
						} else {
							p.sendMessage(CMD_box.boxprefix + "§cDu kannst nur Spawnpunkte von §6ID 1 bis 20 §cerstellen! §eNutze: /box setspawn <ID>");
						}
					}
					if(args[0].equalsIgnoreCase("setholo")) {
						String name = args[1];
						if(name.equals("1") || name.equals("2") || name.equals("3") || name.equals("4") || name.equals("5") || name.equals("6") || name.equals("7") || 
								name.equals("8") || name.equals("9") || name.equals("10") || name.equals("11") || name.equals("12") || name.equals("13") || 
								name.equals("14") || name.equals("15") || name.equals("16") || name.equals("17") || name.equals("18") || name.equals("19") ||
								name.equals("20")) {
									
									Main.getInstance().getBoxManager().setBoxHologram(p, name);
									
							} else {
								p.sendMessage(CMD_box.boxprefix + "§cDu kannst nur Hologramme von §6ID 1 bis 20 §cerstellen! §eNutze: /box setholo <ID>");
							}
					}
					if(args[0].equalsIgnoreCase("delete")) {
						String name = args[1];
						if(Main.getInstance().getBoxManager().isBoxAlreadyExists(name)) {
						if(name.equals("1") || name.equals("2") || name.equals("3") || name.equals("4") || name.equals("5") || name.equals("6") || name.equals("7") || 
								name.equals("8") || name.equals("9") || name.equals("10") || name.equals("11") || name.equals("12") || name.equals("13") || 
								name.equals("14") || name.equals("15") || name.equals("16") || name.equals("17") || name.equals("18") || name.equals("19") ||
								name.equals("20")) {
								
									
									Main.getInstance().getBoxManager().removeBox(name);
									p.sendMessage("§5Screenboxen §7» §eDu hast Box §b" + name + " §4gelöscht!");
									p.playSound(p.getLocation(), Sound.WITHER_HURT, 3, 3);
									
							} else {
								p.sendMessage(CMD_box.boxprefix + "§cDu kannst nur Boxen von §6ID 1 bis 20 §clöschen! §eNutze: /box delete <ID>");
								}
							} else {
								p.sendMessage(boxprefix + "§cDiese Box existiert nicht!");
							}
					}
					if(args[0].equalsIgnoreCase("setsign")) {
						String id = args[1];
						ItemStack i = new ItemStack(Material.SIGN);
						ItemMeta meta = i.getItemMeta();
						meta.setDisplayName("§ePlAZIEREN. ERSTE ZEILE: [box] ZWEITE ZEILE DIE id");
						ArrayList<String> lores = new ArrayList<String>();
						lores.add("");
						lores.add("§7PlAZIEREN");
						lores.add("§7ERSTE ZEILE: [box]");
						lores.add("§7ZWEITE ZEILE DIE id");
						meta.setLore(lores);
						i.setItemMeta(meta);
						
						p.getInventory().setItemInHand(i);
						
						BoxManager.cfg.set(id + ".sign.world", p.getLocation().getWorld().getName());
						BoxManager.cfg.set(id + ".sign.x", p.getLocation().getX());
						BoxManager.cfg.set(id + ".sign.y", p.getLocation().getY());
						BoxManager.cfg.set(id + ".sign.z", p.getLocation().getZ());
						BoxManager.cfg.set(id + ".sign.yaw", p.getLocation().getYaw());
						BoxManager.cfg.set(id + ".sign.pitch", p.getLocation().getPitch());
						BoxManager.saveFile();
						p.sendMessage("§6Setze nun das Schild.");
					}
				}
				
				
			} else if(p.hasPermission("community.build")) {
				p.sendMessage(Main.getPrefix()+"§cDu benötigst die Permission: §9§lcommunity.admin");
			} else {
				p.sendMessage(Main.getPrefix()+"§cKein Recht!");
			}
		} else {
			System.out.println("[NowUnity] Diesen Command kann nur ein Spieler ausführen!");
		}
		return true;
	}
	
	public void sendPlayerBoxHelpMessage(Player p) {
		p.sendMessage("§6--------§l[Screenboxen]§r§6--------");
		p.sendMessage("§e/box create <ID>");
		p.sendMessage("§e/box delete <ID>");
		p.sendMessage("§e/box setholo <ID>");
		p.sendMessage("§e/box setspawn <ID>");
		p.sendMessage("§e/box setsign <ID>");
		p.sendMessage("§6--------§l[Screenboxen]§r§6--------");
	}

}
