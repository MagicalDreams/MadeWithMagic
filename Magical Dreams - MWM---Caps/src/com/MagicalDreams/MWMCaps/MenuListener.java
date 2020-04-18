package com.MagicalDreams.MWMCaps;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

 
public class MenuListener implements Listener{
	
	private Main main;
	
	
	public MenuListener(Main main) {
		this.main = main;
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player player = (Player) e.getWhoClicked();
		
		if(ChatColor.translateAlternateColorCodes('&', e.getClickedInventory().getTitle()).equals(ChatColor.RED + "Caps")) {
			
			if(e.getCurrentItem() != null) {
				e.setCancelled(true);
				switch (e.getCurrentItem().getType()) {
				case BONE:
					ItemStack BONE = new ItemStack(Material.BONE,1);
					
					player.getInventory().setItemInHand((new ItemStack(Material.BONE, 1)));
					
					
					
					break;
				case EMERALD_BLOCK:
					
						
						player.sendMessage("Enabled Caps!");

					break;
				case REDSTONE_BLOCK:
			
						
						player.sendMessage("Disabled Caps!");
						
					break;
				case LEATHER_HELMET:
					player.getInventory().setHelmet((new ItemStack(Material.LEATHER_HELMET, 1)));

					
					break;
				case DIAMOND_HELMET:
					player.getInventory().setHelmet((new ItemStack(Material.DIAMOND_HELMET, 1)));

					
					break;
				case GOLD_HELMET:
					player.getInventory().setHelmet((new ItemStack(Material.GOLD_HELMET, 1)));

					
					break;
				case IRON_HELMET:
					player.getInventory().setHelmet((new ItemStack(Material.IRON_HELMET, 1)));

					
					break;
				case CHAINMAIL_HELMET:
					player.getInventory().setHelmet((new ItemStack(Material.CHAINMAIL_HELMET, 1)));
					
			
					break;
				default:
					return;
					
				}

			}
			
			player.closeInventory();
			
		}

		
	}
	


}
