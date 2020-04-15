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

import static org.bukkit.Material.*;

public class Main extends JavaPlugin {

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
                if (player.getInventory().getHolder().getType() != null
                        && player.getInventory().getHolder().equals(null)) {


                 //   fastPassMeta = FastPass.getItemMeta();

                   // fastPassMeta.setLore(disableLore);

                } else {

               //     fastPassMeta = FastPass.getItemMeta();


               //     fastPassMeta.setLore(enableLore);


                }
           //     FastPass.setItemMeta(fastPassMeta);



                //ItemSettings

            ItemStack StanedGlass = new ItemStack(GLASS_PANE, 1, DyeColor.RED.getDyeData());
            ItemMeta StanedGlassMeta = StanedGlass.getItemMeta();
            StanedGlassMeta.setDisplayName(ChatColor.GRAY + " ");
            StanedGlass.setItemMeta(StanedGlassMeta);




            MadeWithMagicGUI.setItem(0, StanedGlass);
            MadeWithMagicGUI.setItem(1, StanedGlass);
            MadeWithMagicGUI.setItem(2, StanedGlass);
            MadeWithMagicGUI.setItem(3, StanedGlass);
            MadeWithMagicGUI.setItem(4, StanedGlass);
            MadeWithMagicGUI.setItem(5, StanedGlass);
            MadeWithMagicGUI.setItem(6, StanedGlass);
            MadeWithMagicGUI.setItem(7, StanedGlass);
            MadeWithMagicGUI.setItem(8, StanedGlass);


            //Final

                player.openInventory(MadeWithMagicGUI);

            }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("MadeWithMagic Disabled");

    }



}
