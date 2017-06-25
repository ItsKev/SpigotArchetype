package ${package}.util;

import ${package}.${artifactId};

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class VersionCheck {

    private static VersionCheck instance;

    public static VersionCheck getInstance() {
        return instance == null ? instance = new VersionCheck() : instance;
    }

    private ${artifactId} plugin;
    private Date date;

    private VersionCheck() {
        this.plugin = ${artifactId}.getInstance();
        Calendar instance = Calendar.getInstance();
        instance.set(2017, Calendar.JUNE, 15);
        date = instance.getTime();
        this.checkVersion();
    }

    private void checkVersion(){
        long time = System.currentTimeMillis();
        long twoDays = this.date.getTime() + TimeUnit.DAYS.toMillis(3);
        if(time > twoDays){
            ${artifactId} instance = ${artifactId}.getInstance();
            instance.getServer().getPluginManager().disablePlugin(instance);
        }
    }
}