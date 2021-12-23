package me.gacekmpl2.Utils;

import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ConfigSave {
    public static void saveAll() {
        saveNotify();
    }

    public static void saveNotify() {
        YamlConfiguration notifyConf = Configs.load("notifycations.yml");
        List<String> list = new ArrayList<>();
        for (UUID uuid : Storage.notifications)
            list.add(uuid.toString());
        notifyConf.set("notify", list);
        Configs.save(notifyConf, "notifycations.yml");
    }
}

