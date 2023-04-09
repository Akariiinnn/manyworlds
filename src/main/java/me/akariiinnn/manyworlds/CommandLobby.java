package me.akariiinnn.manyworlds;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandLobby implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String str, String[] args)
    {
        if(sender instanceof Player)
        {
            Player p = (Player) sender;
            Location loc = new Location(Bukkit.getWorld("Lobby"), 3, -43, 9);
            p.teleport(loc);
            return true;
        }
        return false;
    }
}
