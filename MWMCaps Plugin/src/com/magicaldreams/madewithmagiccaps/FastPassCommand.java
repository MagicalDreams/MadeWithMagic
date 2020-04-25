package com.magicaldreams.madewithmagiccaps;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class FastPassCommand implements CommandExecutor {


    private Main main;

    public FastPassCommand(Main main) {

        this.main = main;

    }


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // TODO Auto-generated method stub

        if (sender instanceof Player) {


                //	main.applyChangerUI((Player) sender);

                sender.sendMessage(ChatColor.GOLD + "Opening Caps");
                
                Player player = (Player) sender;
                /*
                
                for (Player reciver : Bukkit.getServer().getOnlinePlayers())
                {
                    Bukkit.getServer().dispatchCommand(reciver, "cap-diamond" + player.getName() + setHelmet((new ItemStack(Material.GOLDEN_HELMET, 1))));
                }

*/
                main.applyCapsUI((Player) sender);
                ((Player) sender).playSound(((OfflinePlayer) sender).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 5.0F, 1.0F);
            }
              else
              {
                //OMG, it's herobrine (no, there can be other senders, too, but it's unlikely).  
            	  System.out.println("Incorrect Format!!   Suposed to be /cap <Player> <Cap Name> (Radius) (Coordinates)");
              
        
      
              }

        return false;
    }


	private String setHelmet(ItemStack itemStack) {
		// TODO Auto-generated method stub
		return null;
	}



}