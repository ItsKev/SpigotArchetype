package ${package}.util;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;

import java.util.HashMap;
import java.util.Map;

@SerializableAs("Template")
public class Template implements ConfigurationSerializable {

    private String name;
    private int nr;

    public Template(String name, int nr) {
        this.name = name;
        this.nr = nr;
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> map = new HashMap<>();
        map.put("Name", name);
        map.put("Nr", nr);
        return map;
    }

    public static Template deserialize(Map<String, Object> map) {
        return new Template((String) map.get("Name"), (int) map.get("Nr"));
    }
}