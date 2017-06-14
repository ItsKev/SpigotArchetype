package ${package}.util;

import ${package}.${artifactId};
import org.bukkit.plugin.java.JavaPlugin;

public class WriteConfig {

    private static WriteConfig instance;

    public static WriteConfig getInstance() {
        return instance == null ? instance = new WriteConfig() : instance;
    }

    private ${artifactId} plugin;

    private WriteConfig() {
        this.plugin = ${artifactId}.getInstance();
        this.plugin.getConfig().options().copyDefaults(true);
        this.plugin.saveDefaultConfig();
        this.plugin.saveConfig();
    }
}