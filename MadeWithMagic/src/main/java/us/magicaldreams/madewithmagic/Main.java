package us.magicaldreams.madewithmagic;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("MadeWithMagic Enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("MadeWithMagic Disabled");

    }
}
