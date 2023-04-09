package me.akariiinnn.manyworlds;

import org.bukkit.plugin.java.JavaPlugin;

public final class ManyWorlds extends JavaPlugin {

    @Override
    public void onEnable() {
    this.getCommand("dispatch").setExecutor(new CommandDispatch());
    this.getCommand("lobby").setExecutor(new CommandLobby());
    this.getCommand("create").setExecutor(new CommandCreate());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
