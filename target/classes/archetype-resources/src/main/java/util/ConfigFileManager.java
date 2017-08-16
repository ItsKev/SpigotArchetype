package ${package}.util;

import ${package}.${artifactId};
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerialization;

import java.io.File;
import java.io.IOException;

public class ConfigFileManager {

    static {
        ConfigurationSerialization.registerClass(Template.class, "Template");
    }

    private final String configFileName = "config.yml";
    private YamlConfiguration config;

    private ${artifactId} plugin;

    public ConfigFileManager() {
        this.plugin = ${artifactId}.getInstance();
        this.config = this.loadFile(configFileName);
    }

    public YamlConfiguration getConfig() {
        return this.config;
    }

    private YamlConfiguration loadFile(String fileName) {
        File file = new File(this.plugin.getDataFolder(), fileName);
        if (!file.exists()) {
            this.plugin.saveResource(fileName, false);
        }
        YamlConfiguration yamlConfiguration = new YamlConfiguration();
        try {
            yamlConfiguration.load(file);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        return yamlConfiguration;
    }

    private void saveYamlConfiguration(YamlConfiguration yamlConfiguration, String fileName) {
        try {
            yamlConfiguration.save(new File(this.plugin.getDataFolder(), fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
