package ${package};

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import ${package}.util.ConfigManager;
import ${package}.util.VersionCheck;

/**
 * Main class of the ${artifactId} plugin
 *
 * @author ItsKev
 */
public class ${artifactId} extends JavaPlugin {

    private static ${artifactId} instance;

    public static ${artifactId} getInstance() {return instance;}

    private ConfigManager configManager;

    @Override
    public void onEnable() {
        instance = this;
        this.configManager = new ConfigManager();
        this.registerCommands();
        this.registerEvents();
        VersionCheck.getInstance();
    }

    @Override
    public void onDisable() {
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

    private void registerCommands() {
        //this.getCommand("test").setExecutor(new ${artifactId}Commands());
        //this.getCommand("test").setTabCompleter(new TabComplete());
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        //pm.registerEvents(new PortalEvent(), this);
    }
}