package dev.novatea.simplegraves;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleGraves extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }
}
