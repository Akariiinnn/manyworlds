package me.akariiinnn.manyworlds;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.*;

public class CommandDispatch implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String str, String[] args)
    {
        Player p = (Player) sender;
        World origin = Bukkit.getWorld(p.getLocation().getWorld().getUID());
        List<Player> players =  origin.getPlayers();
        Location loc;
        for (Player player: players) {
            loc = new Location(Bukkit.getWorld("speedrun" + player.getName()), -204, 77, -209);
            player.teleport(loc);
            player.setGameMode(GameMode.SURVIVAL);
        }
        return true;
    }
}
