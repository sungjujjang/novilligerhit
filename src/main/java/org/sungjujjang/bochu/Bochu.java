package org.sungjujjang.bochu;

import org.bukkit.ChatColor;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bochu extends JavaPlugin {

    // switch villiger git
    public static boolean isVilligerHit = false;

    @SuppressWarnings("DataFlowIssue")
    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("vlh").setExecutor( new CommandVlh() );
        getServer().getPluginManager().registerEvents(new event(), this);
        getLogger().info("[ Bochu ] Plugin Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("[ Bochu ] Plugin Disabled");
    }
}
