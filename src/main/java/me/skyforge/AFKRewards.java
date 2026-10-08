package me.skyforge;

import org.bukkit.plugin.java.JavaPlugin;

public final class AFKRewards extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AFKRewards has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AFKRewards has been disabled!");
    }
}
