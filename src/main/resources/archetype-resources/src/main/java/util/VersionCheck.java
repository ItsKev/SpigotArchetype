package ${package}.util;

import java.util.Calendar;

import ${package}.${artifactId};

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class VersionCheck {

    private Date date;

    public VersionCheck() {
        Calendar instance = Calendar.getInstance();
        instance.set(2017, Calendar.JULY, 20);
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