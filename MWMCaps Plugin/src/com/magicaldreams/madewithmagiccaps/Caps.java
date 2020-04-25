package com.magicaldreams.madewithmagiccaps;

import org.bukkit.event.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Caps implements Listener{
	  ArrayList<Player> BONE = new ArrayList<>();
	
	
    public Caps(Main main) {
		// TODO Auto-generated constructor stub
	}


	@EventHandler
    public void onClick(PlayerInteractEvent e) {
    	
    	Player player = e.getPlayer();
    	
    	if(player.getItemInHand().getType().equals(Material.BONE)) {
    		
    		if(BONE.contains(player)) {//is enabled
    			
    		player.sendMessage("Changed");
    		BONE.remove(player);
    		
    		
    		switch (e.getAction().LEFT_CLICK_AIR) {
                    case LEFT_CLICK_BLOCK:


                    //    player.getInventory().setHelmet((new ItemStack(Material.DIAMOND_HELMET, 1)));




                        player.getInventory().setHelmet((new ItemStack(Material.GOLDEN_HELMET, 1)));



                    //    player.getInventory().setHelmet((new ItemStack(Material.IRON_HELMET, 1)));

                    

                    //    player.getInventory().setHelmet((new ItemStack(Material.CHAINMAIL_HELMET, 1)));

//
                //        player.getInventory().setHelmet((new ItemStack(Material.LEATHER_HELMET, 1)));

                        break;
                    default:
                        return;
    		
    		}   			
    		
    		
    	}
    	
    }
	
	
	  
	  /*

	    private Main main;

	    public Caps(Main main) {
	        this.main = main;
	    }
	    
	    */
/*
	    @SuppressWarnings("deprecation")
	    @EventHandler
	    public void onClick(PlayerInteractEvent e) {

	        Player player = e.getPlayer();

	        if(player.getItemInHand().getType().equals(Material.BONE)) {

	            if(BONE.contains(player)) {

	                if(e.getItem() != null) {
	                    e.setCancelled(true);
	                    switch (e.getItem().getType()) {
	                        case LEATHER_HELMET:


	                            player.getInventory().setHelmet((new ItemStack(Material.DIAMOND_HELMET, 1)));

	                            break;
	                        case DIAMOND_HELMET:


	                            player.getInventory().setHelmet((new ItemStack(Material.GOLDEN_HELMET, 1)));

	                            break;
	                        case GOLDEN_HELMET:

	                            player.getInventory().setHelmet((new ItemStack(Material.IRON_HELMET, 1)));

	                            break;
	                        case IRON_HELMET:

	                            player.getInventory().setHelmet((new ItemStack(Material.CHAINMAIL_HELMET, 1)));

	                            break;
	                        case CHAINMAIL_HELMET:

	                            player.getInventory().setHelmet((new ItemStack(Material.LEATHER_HELMET, 1)));

	                            break;
	                        default:
	                            return;

	                    }
	                }

	            }

	        }

		
	   
	    }
 */
	   
	}
}