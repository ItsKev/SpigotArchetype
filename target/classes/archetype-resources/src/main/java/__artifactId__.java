package ${package};

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import ${package}.util.ConfigFileManager;
import ${package}.util.VersionCheck;
import ${package}.commands.TestCommand;
import ${package}.events.PlayerEvents;

/**
 * Main class of the ${artifactId} plugin
 *
 * @author Infernal Development
 */
public class ${artifactId} extends JavaPlugin {

    private static ${artifactId} instance;

    public static ${artifactId} getInstance() {return instance;}

    private ConfigFileManager configFileManager;
    private boolean debugMode = false;

    @Override
    public void onEnable() {
        instance = this;
        this.configFileManager = new ConfigFileManager();
        this.registerCommands();
        this.registerEvents();
        new VersionCheck();
    }

    @Override
    public void onDisable() {
    }

    public ConfigFileManager getConfigFileManager() {
        return this.configFileManager;
    }

    public void logMessage(Object object){
        if(debugMode){
            this.getLogger().info(object.toString());
        }
    }

    private void registerCommands() {
        this.getCommand("test").setExecutor(new TestCommand());
        //this.getCommand("test").setTabCompleter(new TabComplete());
    }

    private void registerEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerEvents(), this);
    }
}