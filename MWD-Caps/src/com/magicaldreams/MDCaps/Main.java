package com.magicaldreams.MDCaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	   @Override
	    public void onEnable() {
	        /* Plugin startup logic */

	        System.out.println("MadeWithMagic Enabled");


	        Bukkit.getPluginManager().registerEvents(new hatsCommand(this), this);

	        getCommand("caps").setExecutor(new ReferanceCommand());


	    }

	        public static void applyMadeWithMagicUI(Player player) {

	                // Hats HashMap
	         HashMap <Player, Material> chestSlot = new HashMap<>();





	                //Beginning
	                Inventory MadeWithMagicGUI = Bukkit.createInventory(null, 9, ChatColor.RED + "Caps");

	                //Lores
	            List<String> capsenableLore = new ArrayList<>();
	            capsenableLore.add(ChatColor.GRAY + "Enable's the use of others");
	            capsenableLore.add(ChatColor.GRAY + "To Change your Hat");

	            List<String> capsdisableLore = new ArrayList<>();
	            capsdisableLore.add(ChatColor.GRAY + "Disabled's the use of others");
	            capsdisableLore.add(ChatColor.GRAY + "To Change your Hat");


	                //ItemStacks
	                ItemStack MadeWithMagic;
	                ItemMeta MadeWithMagicMeta;
	                if (player.getInventory().getItemInHand().getType() != null &&
	                		player.getInventory().getItemInHand().equals(Material.BONE)){

	                	MadeWithMagic = new ItemStack(Material.BONE, 1);
		                MadeWithMagicMeta = MadeWithMagic.getItemMeta();

		                MadeWithMagicMeta.setDisplayName(ChatColor.RED + "Disable Caps");
		                
		                MadeWithMagicMeta.setLore(capsdisableLore);
		                
	                } else {

	                	MadeWithMagic = new ItemStack(Material.BONE, 1);
	                	MadeWithMagicMeta = MadeWithMagic.getItemMeta();

		                MadeWithMagicMeta.setDisplayName(ChatColor.GREEN + "Enable Caps");

		                MadeWithMagicMeta.setLore(capsenableLore);
	                }
	                
	                MadeWithMagic.setItemMeta(MadeWithMagicMeta);
	                
	   
	                //ItemSettings

	            ItemStack BlueStanedGlass = new ItemStack(Material.BLUE_STAINED_GLASS_PANE, 1, DyeColor.BLUE.getDyeData());
	            ItemMeta BlueStanedGlassMeta = BlueStanedGlass.getItemMeta();
	            BlueStanedGlassMeta.setDisplayName(ChatColor.GRAY + " ");
	            BlueStanedGlass.setItemMeta(BlueStanedGlassMeta);
	            
	            ItemStack RedStanedGlass = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1, DyeColor.RED.getDyeData());
	            ItemMeta RedStanedGlassMeta = RedStanedGlass.getItemMeta();
	            RedStanedGlassMeta.setDisplayName(ChatColor.GRAY + " ");
	            RedStanedGlass.setItemMeta(RedStanedGlassMeta);





	            MadeWithMagicGUI.setItem(0, MadeWithMagic);
	            MadeWithMagicGUI.setItem(1, RedStanedGlass);
	            MadeWithMagicGUI.setItem(2, BlueStanedGlass);
	            MadeWithMagicGUI.setItem(3, RedStanedGlass);
	            MadeWithMagicGUI.setItem(4, BlueStanedGlass);
	            MadeWithMagicGUI.setItem(5, RedStanedGlass);
	            MadeWithMagicGUI.setItem(6, BlueStanedGlass);
	            MadeWithMagicGUI.setItem(7, RedStanedGlass);
	            MadeWithMagicGUI.setItem(8, BlueStanedGlass);


	            //Final

	                player.openInventory(MadeWithMagicGUI);

	            }

	    @Override
	    public void onDisable() {
	        // Plugin shutdown logic

	        System.out.println("MadeWithMagic Disabled");

	    }



	}