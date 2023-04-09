package me.akariiinnn.manyworlds;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.*;

public class CommandDispatch implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String str, String[] args)
    {
        Player p = (Player) sender;
        World origin = Bukkit.getWorld(p.getLocation().getWorld().getUID());
        List<Player> players =  origin.getPlayers();
        WorldCreator wc;
        Location loc;
        int i = 0;
        for (Player player: players) {
            loc = new Location(Bukkit.getWorld("speedrun" + i), -204, 77, -209);
            player.teleport(loc);
            player.setGameMode(GameMode.SURVIVAL);
            i++;
        }
        return true;
    }
}
