package me.gacekmpl2.Utils;

import org.bukkit.configuration.file.YamlConfiguration;


public class ConfigLoad {
    public static void loadAll() {
        load();
        Messages.loadMessages();
    }

    public static void load() {
        YamlConfiguration configuration = Configs.load("config.yml");
        assert configuration != null;
        Configs.save(configuration, "config.yml");
    }
}
