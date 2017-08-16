package ${package}.util;

import ${package}.${artifactId};

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;

import java.util.Arrays;
import java.util.Collection;

public class Helper {

    public static String getStringFromConfig(String string) {
        return ChatColor.translateAlternateColorCodes('&',
                ${artifactId}.getInstance().getConfig().getString(string));
    }

    public static ItemStack getItemStack(Material material, String name, String... lore) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        if (lore.length > 0) {
            itemMeta.setLore(Arrays.asList(lore));
        }
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public static String getEntryIgnoreCase(Collection<String> list, String string){
        for (String entry : list) {
            if (entry.equalsIgnoreCase(string)){
                return entry;
            }
        }
        return "";
    }
}