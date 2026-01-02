package dev.novatea.simplegraves;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleGraves extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        if (e.getKeepInventory()) return;

    }
}
