package com.magicaldreams.MDCaps;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class hatsCommand implements Listener {

    private Main main;

    public hatsCommand(Main main) {

        this.main = main;

    }



    @EventHandler
    public void onClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();



            player.closeInventory();

        }


    }


