package me.gacekmpl2.Utils;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

public class Debug {
    private static final ConsoleCommandSender console = Bukkit.getConsoleSender();

    private static final String prefix = "[EasyHC";

    public static void log(String a) {
        a = "[EasyHC]" + a;
        console.sendMessage(a.replace("&", "§"));
    }

    public static void sendError(String a) {
        log("&c============");
        log("&c" + a);
        log("&c============");
    }

    public static void log(Object a) {
        a = "[EasyHC]" + a;
        console.sendMessage(String.valueOf(a).replace("&", "§"));
    }
}
