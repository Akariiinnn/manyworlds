package me.akariiinnn.manyworlds;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;

public final class ManyWorlds extends JavaPlugin {


    @Override
    public void onEnable() {
        this.getCommand("dispatch").setExecutor(new CommandDispatch());
        this.getCommand("lobby").setExecutor(new CommandLobby());
        this.getCommand("create").setExecutor(new CommandCreate());
    }

    @Override
    public void onDisable() {

    }
}
