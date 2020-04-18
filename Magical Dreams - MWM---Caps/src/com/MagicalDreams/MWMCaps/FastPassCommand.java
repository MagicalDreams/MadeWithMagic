package com.MagicalDreams.MWMCaps;

import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FastPassCommand implements CommandExecutor {

	private Main main;

	public FastPassCommand(Main main) {
		// TODO Auto-generated constructor stub
		
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// TODO Auto-generated method stub
		
		if(sender instanceof Player) {
			

			
				main.applyFastPassUI((Player) sender);
				((Player) sender).playSound(((OfflinePlayer) sender).getPlayer().getLocation(), Sound.ENTITY_FIREWORK_TWINKLE, 2.0F, 1.0F);
		}else {
			System.out.println("Cannot Use in Console!");
		}
		
		return false;
	}



}
