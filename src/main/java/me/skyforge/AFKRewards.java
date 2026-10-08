package me.skyforge;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AFKRewards extends JavaPlugin {

    private AFKManager afkManager;

    @Override
    public void onEnable() {
        afkManager = new AFKManager();

        Bukkit.getPluginManager().registerEvents(
                new AFKListener(afkManager),
                this
        );

        Bukkit.getScheduler().runTaskTimer(
                this,
                () -> {
                    Bukkit.getOnlinePlayers().forEach(player -> {
                        afkManager.checkAFK(player);
                    });
                },
                20L,
                20L
        );

        getLogger().info("AFKRewards has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AFKRewards has been disabled!");
    }
}