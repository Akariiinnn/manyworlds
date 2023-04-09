package me.akariiinnn.manyworlds;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CommandCreate implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String str, String[] args)
    {
        Player p = (Player) sender;
        World origin = Bukkit.getWorld(p.getLocation().getWorld().getUID());
        List<Player> players =  origin.getPlayers();
        WorldCreator wc;
        for (Player player: players) {
            wc = new WorldCreator("speedrun" + player.getName());
            wc.environment(World.Environment.NORMAL);
            wc.type(WorldType.NORMAL);
            wc.seed(5280170466361302551L);
            wc.createWorld();
        }
        return true;
    }
}
