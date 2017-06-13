package ${package};

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class of the ${artifactId} plugin
 *
 * @author ItsKev
 */
public class ${artifactId} extends JavaPlugin{

    private static ${artifactId} instance;

    public static ${artifactId} getInstance() {return instance;}

    @Override
    public void onEnable() {
        instance = this;
        this.registerCommands();
        this.registerEvents();
    }

    @Override
    public void onDisable() {
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