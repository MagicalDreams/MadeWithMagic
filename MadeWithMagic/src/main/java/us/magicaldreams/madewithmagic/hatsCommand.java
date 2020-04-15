package us.magicaldreams.madewithmagic;

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

        if(ChatColor.translateAlternateColorCodes('&', String.valueOf(e.getClickedInventory())).equals(ChatColor.RED + "hats")) {

            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {


                }
            }

            player.closeInventory();

        }
        player.closeInventory();


    }


}
