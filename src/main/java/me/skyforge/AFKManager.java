package me.skyforge;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AFKManager {

    private static final long AFK_TIMEOUT = 5 * 60 * 1000L;

    private final Map<UUID, Long> lastActivity = new HashMap<>();
    private final Map<UUID, Boolean> afkStatus = new HashMap<>();

    public void updateActivity(Player player) {
        UUID uuid = player.getUniqueId();

        lastActivity.put(uuid, System.currentTimeMillis());

        if (isAFK(player)) {
            afkStatus.put(uuid, false);
            player.sendMessage("§aYou are no longer AFK.");
        }
    }

    public boolean isAFK(Player player) {
        return afkStatus.getOrDefault(player.getUniqueId(), false);
    }

    public void checkAFK(Player player) {
        if (isAFK(player)) {
            return;
        }

        long inactiveTime =
                System.currentTimeMillis() - getLastActivity(player);

        if (inactiveTime >= AFK_TIMEOUT) {
            setAFK(player);
        }
    }

    public void setAFK(Player player) {
        afkStatus.put(player.getUniqueId(), true);
        player.sendMessage("§eYou are now AFK.");
    }

    public long getLastActivity(Player player) {
        return lastActivity.getOrDefault(
                player.getUniqueId(),
                System.currentTimeMillis()
        );
    }

    public void removePlayer(Player player) {
        UUID uuid = player.getUniqueId();

        lastActivity.remove(uuid);
        afkStatus.remove(uuid);
    }
}