package me.akariiinnn.manyworlds;

import org.bukkit.Bukkit;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.World;
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
            double x = p.getLocation().getX();
            double y = p.getLocation().getY();
            double z = p.getLocation().getZ();
            World world = p.getWorld();
            Location lastLoc = new Location(world, x, y ,z);
            Location loc = new Location(Bukkit.getWorld("Lobby"), 8, -60, 9);
            p.teleport(loc);
            return true;
        }
        return false;
    }
}
