package com.magicaldreams.madewithmagiccaps;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

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


                main.applyCapsUI((Player) sender);
                ((Player) sender).playSound(((OfflinePlayer) sender).getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 5.0F, 1.0F);
            } else {
                System.out.println("Cannot Use in Console!");
            }


        return false;
    }
}