package us.magicaldreams.madewithmagic;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        /* Plugin startup logic */

        System.out.println("MadeWithMagic Enabled");


        Bukkit.getPluginManager().registerEvents(new hatsCommand(this), this);

        getCommand("hats").setExecutor(new ReferanceCommand());


    }

        public static void applyFastPassUI(Player player) {

                // Elytra HashMap
         HashMap <Player, Material> chestSlot = new HashMap<>();





                //Beginning
                Inventory fastPassGUI = Bukkit.createInventory(null, 9, ChatColor.RED + "FastPass");

                //Lores

                List<String> enableLore = new ArrayList<>();
                enableLore.add(ChatColor.GRAY + "Click Me For the");
                enableLore.add(ChatColor.GRAY + "Best time of your life!");

                List<String> disableLore = new ArrayList<>();
                disableLore.add(ChatColor.GRAY + "Click Me For the");
                disableLore.add(ChatColor.GRAY + "Worst time of your life!");


                List<String> launchLore = new ArrayList<>();
                launchLore.add(ChatColor.GRAY + "Click To be Launched!");

                launchLore.add(ChatColor.GRAY + "up in the air by 200 Blocks!! :D");

                List<String> warpTNTLore = new ArrayList<>();
                warpTNTLore.add(ChatColor.BOLD + "Warps to TNT");

                //ItemStacks
                ItemStack FastPass;
                ItemMeta fastPassMeta;
                if (player.getInventory().getHolder().getType() != null
                        && player.getInventory().getHolder().equals(null)) {

                    FastPass = new ItemStack(Material.REDSTONE_BLOCK);

                    fastPassMeta = FastPass.getItemMeta();
                    fastPassMeta.setDisplayName(ChatColor.RED + "Disable FastPass");

                    fastPassMeta.setLore(disableLore);

                } else {
                    FastPass = new ItemStack(Material.EMERALD_BLOCK);

                    fastPassMeta = FastPass.getItemMeta();
                    fastPassMeta.setDisplayName(ChatColor.GREEN + "Enable FastPass");

                    fastPassMeta.setLore(enableLore);


                }
                FastPass.setItemMeta(fastPassMeta);



                //ItemSettings




                //Final

                player.openInventory(fastPassGUI);

            }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("MadeWithMagic Disabled");

    }



}
