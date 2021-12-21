package me.gacekmpl2.Utils;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TabCompliter implements TabCompleter {
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equalsIgnoreCase("boyfarmer")) {
            List<String> l = new ArrayList<>();
            if (args.length == 1) {
                l.add("give");
            } else if (args.length == 2) {
                l.add("boyfarmer");
                l.add("sandfarmer");
                l.add("fosafarmer");
            } else if (args.length == 4) {
                for (Player p : Bukkit.getOnlinePlayers())
                    l.add(p.getName());
            }
            return l;
        }
        return null;
    }
}