package me.skyforge;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class AFKListener implements Listener {

    private final AFKManager afkManager;

    public AFKListener(AFKManager afkManager) {
        this.afkManager = afkManager;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        afkManager.updateActivity(event.getPlayer());
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getTo() == null) {
            return;
        }

        if (event.getFrom().getX() != event.getTo().getX()
                || event.getFrom().getY() != event.getTo().getY()
                || event.getFrom().getZ() != event.getTo().getZ()) {

            afkManager.updateActivity(event.getPlayer());
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        afkManager.removePlayer(event.getPlayer());
    }
}