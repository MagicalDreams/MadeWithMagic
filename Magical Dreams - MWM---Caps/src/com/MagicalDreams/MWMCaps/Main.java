package com.MagicalDreams.MWMCaps;

import java.util.ArrayList;
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
		System.out.println("Magical Dreams: MWMCaps ENABLED");
		
		getCommand("caps").setExecutor(new FastPassCommand(this));
		
		Bukkit.getPluginManager().registerEvents(new MenuListener(this), this);
	}
	
	public void applyFastPassUI(Player player) {
		
		//Beginning
		Inventory fastPassGUI = Bukkit.createInventory(null, 9, ChatColor.RED + "Caps");
		
		//Lores
		
		List<String> enableLore = new ArrayList<>();
		enableLore.add(ChatColor.GRAY + "Click Me For the");
		enableLore.add(ChatColor.GRAY + "Best time of your life!");
		
		List<String> disableLore = new ArrayList<>();
		disableLore.add(ChatColor.GRAY + "Click Me For the");
		disableLore.add(ChatColor.GRAY + "Worst time of your life!");
		
		
		List<String> CapsLore = new ArrayList<>();
		CapsLore.add(ChatColor.GRAY + "Click to Recive Caps Wand");  

		
		
		//ItemStacks
		ItemStack FastPass;
		ItemMeta fastPassMeta;
		if(player.getInventory().getHolder().getType() != null
				&& player.getInventory().getHolder().equals(null)) {
			
			FastPass = new ItemStack(Material.REDSTONE_BLOCK);
			
			fastPassMeta = FastPass.getItemMeta();
			fastPassMeta.setDisplayName(ChatColor.RED + "Disable Caps");
			
			fastPassMeta.setLore(disableLore);
			
		} else {
			FastPass = new ItemStack(Material.EMERALD_BLOCK);
			
			fastPassMeta = FastPass.getItemMeta();
			fastPassMeta.setDisplayName(ChatColor.GREEN + "Enable Caps");
			
			fastPassMeta.setLore(enableLore);


		}
		FastPass.setItemMeta(fastPassMeta);
		
		ItemStack caps = new ItemStack(Material.BONE);
		ItemMeta capsMeta = caps.getItemMeta();
		capsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Recive Wand!");
		capsMeta.setLore(CapsLore);
		caps.setItemMeta(capsMeta);
		
		
		@SuppressWarnings("deprecation")
		ItemStack StanedGlass = new ItemStack(Material.STAINED_GLASS_PANE, 1,  DyeColor.BLUE.getDyeData());
		ItemMeta StanedGlassMeta = StanedGlass.getItemMeta();
		StanedGlassMeta.setDisplayName(ChatColor.GRAY + " ");
		StanedGlass.setItemMeta(StanedGlassMeta);
		
		@SuppressWarnings("deprecation")
		ItemStack RedStainedGlass = new ItemStack(Material.STAINED_GLASS_PANE,1,  DyeColor.RED.getDyeData());
		ItemMeta RedStainedGlassMeta = RedStainedGlass.getItemMeta();
		RedStainedGlassMeta.setDisplayName(" ");
		RedStainedGlass.setItemMeta(RedStainedGlassMeta);
		
		
		//ItemSettings
		
		fastPassGUI.setItem(0, caps);
		fastPassGUI.setItem(1, RedStainedGlass);
		fastPassGUI.setItem(2, StanedGlass);
		fastPassGUI.setItem(3, RedStainedGlass);
		fastPassGUI.setItem(4, FastPass);
		fastPassGUI.setItem(5, RedStainedGlass);
		fastPassGUI.setItem(6, StanedGlass);
		fastPassGUI.setItem(7, RedStainedGlass);
		fastPassGUI.setItem(8, StanedGlass);

		
		
		//Final
		
		player.openInventory(fastPassGUI);
		
	}
	
	@Override 
	public void onDisable() {
		System.out.println("Magical Dreams: MWMCaps DISABLED");
	}

}
