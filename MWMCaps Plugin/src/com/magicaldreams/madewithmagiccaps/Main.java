package com.magicaldreams.madewithmagiccaps;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = this.getLogger();


    @Override
    public void onEnable() {
        System.out.println("Magical Dreams: MWMCaps ENABLED");

        getCommand("cap").setExecutor(new FastPassCommand(this));
        
   //     getCommand("cap-diamond").setExecutor(new capdiamondCommand(this));
        
        getCommand("cap-gold").setExecutor(new capgoldCommand(this));
        
   //     getCommand("cap-leather").setExecutor(new capleatherCommand(this));

//        getCommand("cap-chain").setExecutor(new capchainCommand(this));

//        getCommand(null).setExecutor((this));

        Bukkit.getPluginManager().registerEvents(new MenuListener(this), this);

        Bukkit.getPluginManager().registerEvents(new Caps(this), this);

    }
    
    public HashMap<Player, Long> cooldown = new HashMap<>();

    public void applyCapsUI(Player player) {

        //Beginning
        Inventory CapsGUI = Bukkit.createInventory(null, 9, ChatColor.RED + "Caps");

        //Lores

        List<String> enableLore = new ArrayList<>();
        enableLore.add(ChatColor.GRAY + "Click Me to Enable Caps");

        List<String> disableLore = new ArrayList<>();
        disableLore.add(ChatColor.GRAY + "Click Me to Disable Caps");


        List<String> CapsLore = new ArrayList<>();
        CapsLore.add(ChatColor.GRAY + "Click to Recive Caps Wand");

        List<String> BoxLore = new ArrayList<>();
        //	BoxLore.add(ChatColor.GRAY + "Click to open the Menu");
        //BoxLore.add(ChatColor.GRAY + "To change your Cap");


        //ItemStacks
        ItemStack ED;
        ItemMeta EDMeta;
        if(player.getInventory().getHolder().getType() != null
                && player.getInventory().getHolder().equals(Material.BONE)) {



            ED = new ItemStack(Material.EMERALD_BLOCK);

            EDMeta = ED.getItemMeta();
            EDMeta.setDisplayName(ChatColor.GREEN + "Enable Caps");

            EDMeta.setLore(enableLore);


        } else {

            ED = new ItemStack(Material.REDSTONE_BLOCK);

            EDMeta = ED.getItemMeta();
            EDMeta.setDisplayName(ChatColor.RED + "Disable Caps");

            EDMeta.setLore(disableLore);

        }
        ED.setItemMeta(EDMeta);

        ItemStack caps = new ItemStack(Material.BONE);
        ItemMeta capsMeta = caps.getItemMeta();
        capsMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Recive Wand!");
        capsMeta.setLore(CapsLore);
        caps.setItemMeta(capsMeta);


        @SuppressWarnings("deprecation")
        ItemStack StanedGlass = new ItemStack(Material.BLUE_STAINED_GLASS_PANE, 1,  DyeColor.BLUE.getDyeData());
        ItemMeta StanedGlassMeta = StanedGlass.getItemMeta();
        StanedGlassMeta.setDisplayName(ChatColor.GRAY + " ");
        StanedGlass.setItemMeta(StanedGlassMeta);

        @SuppressWarnings("deprecation")
        ItemStack RedStainedGlass = new ItemStack(Material.RED_STAINED_GLASS_PANE,1,  DyeColor.RED.getDyeData());
        ItemMeta RedStainedGlassMeta = RedStainedGlass.getItemMeta();
        RedStainedGlassMeta.setDisplayName(ChatColor.BLUE + " ");
        RedStainedGlass.setItemMeta(RedStainedGlassMeta);


        ItemStack BOX = new ItemStack(Material.PAPER, 1);
        ItemMeta BoxMeta = BOX.getItemMeta();
        BoxMeta.setDisplayName(ChatColor.BLUE + "Cap Changer");
        BOX.setItemMeta(BoxMeta);
        BoxMeta.setLore(BoxLore);


        //ItemSettings

        CapsGUI.setItem(0, caps);
        CapsGUI.setItem(1, RedStainedGlass);
        CapsGUI.setItem(2, StanedGlass);
        CapsGUI.setItem(3, RedStainedGlass);
        CapsGUI.setItem(4, ED);
        CapsGUI.setItem(5, RedStainedGlass);
        CapsGUI.setItem(6, StanedGlass);
        CapsGUI.setItem(7, RedStainedGlass);
        CapsGUI.setItem(8, BOX);



        //Final

        player.openInventory(CapsGUI);

    }



    public void applyChangerUI(Player player) {

        Inventory ChangerGUI = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Caps Changer");

        @SuppressWarnings("deprecation")
        ItemStack RedStainedGlass = new ItemStack(Material.RED_STAINED_GLASS_PANE,1,  DyeColor.RED.getDyeData());
        ItemMeta RedStainedGlassMeta = RedStainedGlass.getItemMeta();
        RedStainedGlassMeta.setDisplayName(ChatColor.BLUE + " ");
        RedStainedGlass.setItemMeta(RedStainedGlassMeta);

        ItemStack LEATHER_HELMET = new ItemStack(Material.LEATHER_HELMET, 1);

        ItemStack DIAMOND_HELMET = new ItemStack(Material.DIAMOND_HELMET, 1);

        ItemStack GOLD_HELMET = new ItemStack(Material.GOLDEN_HELMET, 1);

        ItemStack IRON_HELMET = new ItemStack(Material.IRON_HELMET, 1);

        ItemStack CHAINMAIL_HELMET = new ItemStack(Material.CHAINMAIL_HELMET, 1);

        ChangerGUI.setItem(0, LEATHER_HELMET);
        ChangerGUI.setItem(1, RedStainedGlass);
        ChangerGUI.setItem(2, DIAMOND_HELMET);
        ChangerGUI.setItem(3, RedStainedGlass);
        ChangerGUI.setItem(4, GOLD_HELMET);
        ChangerGUI.setItem(5, RedStainedGlass);
        ChangerGUI.setItem(6, IRON_HELMET);
        ChangerGUI.setItem(7, RedStainedGlass);
        ChangerGUI.setItem(8, CHAINMAIL_HELMET);

        player.openInventory(ChangerGUI);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Magical Dreams: MWMCaps Disabled");

    }
}