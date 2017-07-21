package ${package}.util;

import ${package}.${artifactId};

public class ConfigManager {

    private ${artifactId} plugin;

    public ConfigManager() {
        this.plugin = ${artifactId}.getInstance();
        this.plugin.getConfig().options().copyDefaults(true);
        this.plugin.saveDefaultConfig();
        this.plugin.saveConfig();
    }
}