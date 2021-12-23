package me.gacekmpl2.Utils;

import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;
import java.util.UUID;


public class ConfigLoad {
    public static void loadAll() {
        load();
        loadNotify();
        Messages.loadMessages();
    }

    public static void load() {
        YamlConfiguration configuration = Configs.load("config.yml");
        assert configuration != null;
        Configs.save(configuration, "config.yml");

    }
    public static void loadNotify() {
        YamlConfiguration notifyConf = Configs.load("notifycations.yml");
        Storage.notifications.clear();
        assert notifyConf != null;
        List<String> list = notifyConf.getStringList("notify");
        for (String l : list)
            Storage.notifications.add(UUID.fromString(l));
        Debug.log("&aZaladowano notify: " + Storage.notifications);
    }
}
