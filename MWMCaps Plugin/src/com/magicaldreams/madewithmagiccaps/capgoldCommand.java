package com.magicaldreams.madewithmagiccaps;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class capgoldCommand implements CommandExecutor {

	private Main main;

	public capgoldCommand(Main main) {
		// TODO Auto-generated constructor stub
		
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		 if (sender instanceof Player) {
		
		if(cmd.getName().equalsIgnoreCase("cap-gold" + sender.getName())) {
			
		
			
			
			getServer();
			ConsoleCommandSender console = Bukkit.getConsoleSender();
			console.sendMessage("Changed " + sender.getName() + " to Gold Helmet");
			
			 		((Player) sender).getInventory().setHelmet((new ItemStack(Material.GOLDEN_HELMET, 1)));
	
		}
		 }
		
		
		return false;
	}

	private Bukkit getServer() {
		// TODO Auto-generated method stub
		return null;
	}

}
