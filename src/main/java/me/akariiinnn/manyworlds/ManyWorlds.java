package me.akariiinnn.manyworlds;

import org.bukkit.plugin.java.JavaPlugin;

public final class ManyWorlds extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        SQLConnect sql = new SQLConnect();
        sql.createTable();
        try {
            this.getCommand("dispatch").setExecutor(new CommandDispatch());
            this.getCommand("lobby").setExecutor(new CommandLobby());
            this.getCommand("create").setExecutor(new CommandCreate());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("ManyWorlds has been enabled");
    }

    @Override
    public void onDisable() {

    }
}
