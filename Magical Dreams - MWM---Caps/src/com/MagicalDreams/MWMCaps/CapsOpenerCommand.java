package com.MagicalDreams.MWMCaps;

import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CapsOpenerCommand implements CommandExecutor{
	
	private Main main;

	public CapsOpenerCommand(Main main) {
		// TODO Auto-generated constructor stub

		
		this.main = main;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if(sender instanceof Player) {
			
			if(cmd.getName().equalsIgnoreCase("capsOpener")) {
				
				((Player) sender).closeInventory();
			
			
			//	main.applyChangerUI((Player) sender);
			

			
				main.applyChangerUI((Player) sender);
				((Player) sender).playSound(((OfflinePlayer) sender).getPlayer().getLocation(), Sound.BLOCK_NOTE_PLING, 5.0F, 1.0F);
		}else {
			System.out.println("Cannot Use in Console!");
		}
		
		}
	
		return false;
	}

}
