package me.akariiinnn.manyworlds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandgetWorld implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String str, String[] args)
    {
        Player p = (Player) sender;
        System.out.println(p.getLocation().getWorld().getUID());
        return true;
    }
}
