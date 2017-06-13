package ${package}.util;

import ${package}.${artifactId};
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

/**
 * A helper class to work with lambdas
 */
public class RunnableHelper {

    private static JavaPlugin plugin = ${artifactId}.getInstance();
    private static BukkitScheduler scheduler = plugin.getServer().getScheduler();

    public static void runAsync(Runnable task){
        scheduler.runTaskAsynchronously(plugin, task);
    }

    public static void runAsyncLater(Runnable task, long delay){
        scheduler.runTaskLaterAsynchronously(plugin, task, delay);
    }

    public static void runAsyncTimer(Runnable task, long delay, long period){
        scheduler.runTaskTimerAsynchronously(plugin, task, delay, period);
    }

    public static void runSync(Runnable task){
        scheduler.runTask(plugin, task);
    }

    public static void runSyncLater(Runnable task, long delay){
        scheduler.runTaskLater(plugin, task, delay);
    }

    public static void runSyncTimer(Runnable task, long delay, long period){
        scheduler.runTaskTimer(plugin, task, delay, period);
    }

}
