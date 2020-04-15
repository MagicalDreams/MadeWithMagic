package us.magicaldreams.madewithmagic;

import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReferanceCommand implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {


            Main.applyMadeWithMagicUI((Player) sender);
            ((Player) sender).playSound(((OfflinePlayer) sender).getPlayer().getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 2.0F, 1.0F);
        }else {
            System.out.println("Cannot Use in Console!");
        }

        return false;
    }
}
