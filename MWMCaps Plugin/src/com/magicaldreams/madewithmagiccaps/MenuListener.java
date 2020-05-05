package com.magicaldreams.madewithmagiccaps;

import org.bukkit.event.Listener;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener{
	  public Main main;


	    public MenuListener(Main main) {
	        this.main = main;
	    }
	    
	    public void CooldownCommand(Main main){
	    	this.main = main;
	    }

	    @SuppressWarnings("deprecation")
	    @EventHandler
	    public void onClick(InventoryClickEvent e) {

	        Player player = (Player) e.getWhoClicked();

	        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Caps")) {

	            if(e.getCurrentItem() != null) {
	                e.setCancelled(true);
	                switch (e.getCurrentItem().getType()) {
	                
	                    case BONE:
	                   /* 	
	                    	if(main.cooldown.containsKey(player) && main.cooldown.get(player) > System.currentTimeMillis()) {
	                    		long longRemaining = main.cooldown.get(player) - System.currentTimeMillis();
	                    		
	                    		int intRemaining = (int) (longRemaining / 1000);
	                    		
	                    		player.sendMessage("You must wait " + intRemaining + " Seconds!");
	                    		
	                    	}else {
	                    	
	                    	main.cooldown.put(player, System.currentTimeMillis() + (10 * 100));
	                    	
	                    	ItemStack BONE = new ItemStack(Material.BONE,1);

	                        player.getInventory().setItemInHand((new ItemStack(Material.BONE, 1)));

	                        player.closeInventory();
	                    	}
	                    	
*/

	                        break;
	                    case EMERALD_BLOCK:


	                        player.sendMessage("Enabled Caps!");
	                        player.closeInventory();

	                        break;
	                    case REDSTONE_BLOCK:


	                        player.sendMessage("Disabled Caps!");
	                        player.closeInventory();

	                        break;
	                    case PAPER:

	                        //	player.sendMessage(ChatColor.BLUE + "Opening Cap Changer");
	                        main.applyChangerUI((Player) player);


	                        //		player.performCommand("capsOpener");



	                        break;
	                    default:
	                        return;



	                }

	            }


	        }


	        if(e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Caps Changer")) {

	            if(e.getCurrentItem() != null) {
	                e.setCancelled(true);
	                switch (e.getCurrentItem().getType()) {

	                    case LEATHER_HELMET:
	                        ((Player) player).playSound(((OfflinePlayer) player).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);
	                        player.closeInventory();
	                        player.sendMessage(ChatColor.GRAY + "Changed Hat to: Cap");

	                        break;
	                    case DIAMOND_HELMET:
	                        player.getInventory().setHelmet((new ItemStack(Material.DIAMOND_HELMET, 1)));
	                        ((Player) player).playSound(((OfflinePlayer) player).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);
	                        player.closeInventory();
	                        player.sendMessage(ChatColor.AQUA + "Changed Hat to: Sorcerer's Hat");


	                        break;
	                    case GOLDEN_HELMET:
	                        player.getInventory().setHelmet((new ItemStack(Material.GOLDEN_HELMET, 1)));
	                        ((Player) player).playSound(((OfflinePlayer) player).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);
	                        player.closeInventory();
	                        player.sendMessage(ChatColor.GOLD + "Changed Hat to: Gold Helmet");


	                        break;
	                    case IRON_HELMET:
	                        player.getInventory().setHelmet((new ItemStack(Material.IRON_HELMET, 1)));
	                        ((Player) player).playSound(((OfflinePlayer) player).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);
	                        player.closeInventory();					
	                        player.sendMessage(ChatColor.RED + "Changed Hat to: Jacks Hat");

	                    case CHAINMAIL_HELMET:
	                        player.getInventory().setHelmet((new ItemStack(Material.CHAINMAIL_HELMET, 1)));
	                        ((Player) player).playSound(((OfflinePlayer) player).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 2.0F, 1.0F);
	                        player.closeInventory();
	                        player.sendMessage(ChatColor.GOLD + "Changed Hat to: Crown");


	                        break;
	                    default:
	                        return;

	                }

	            }


	        }

	    }

	}

