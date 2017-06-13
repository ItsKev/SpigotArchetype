package ${package}.util;

public class ReadConfig {

    private static ReadConfig instance;

    public static ReadConfig getInstance() {
        return instance == null ? instance = new ReadConfig() : instance;
    }

    private ReadConfig() {
    }
}