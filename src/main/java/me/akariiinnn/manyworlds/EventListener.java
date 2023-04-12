package me.akariiinnn.manyworlds;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (!event.getPlayer().hasPlayedBefore())
            PlayerStats.createStats(event.getPlayer());
    }

    @EventHandler
    public void onPLayerRespawn(PlayerRespawnEvent e)
    {
        e.setRespawnLocation(Bukkit.getWorld("speedrun" + e.getPlayer().getName()).getSpawnLocation());
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        PlayerStats.saveStats(event.getPlayer());
    }
}
