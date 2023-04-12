package me.akariiinnn.manyworlds;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.List;

public class CommandCreate implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String str, String[] args)
    {
        Player p = (Player) sender;
        World origin = Bukkit.getWorld(p.getLocation().getWorld().getUID());
        List<Player> players =  origin.getPlayers();
        try {
            new WorldCreator("speedrun").createWorld();
            for (Player player : players) {
                World world = Bukkit.getWorld("speedrun" + player.getName());
                Utils.unloadWorld(world);
                Utils.copyWorld(Bukkit.getWorld("speedrun"), "speedrun" + player.getName());
            }
            return true;
        } catch (Exception e) {
            p.sendMessage("Error: speedrun world not found add it to the server files");
            return false;
        }
    }
}

