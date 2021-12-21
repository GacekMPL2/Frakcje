package me.gacekmpl2.Utils;

import org.bukkit.configuration.file.YamlConfiguration;

public class Messages {
    public static String prefix = "&aFrakcje";

    public static String youTubeBroadcastMessage = "&aZapraszamy na &cLive: &f";

    public static void loadMessages() {
        YamlConfiguration messages = Configs.load("messages.yml");
        assert messages != null;
        prefix = messages.getString("prefix");
        youTubeBroadcastMessage = messages.getString("youTubeBroadcastMessage");
    }
}
