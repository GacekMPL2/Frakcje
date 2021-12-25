package me.gacekmpl2.Commands;

import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.Utils.ConfigLoad;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("EasyHC.command.lowerpermission")) {
            sender.sendMessage(ChatUtils.color("&cBrak uprawnie"));
            return true;
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("reload")) {
                ConfigLoad.loadAll();
                sender.sendMessage(ChatUtils.color("&aPrzeladowano"));
                return true;
            }
        }
        return true;
    }
}

