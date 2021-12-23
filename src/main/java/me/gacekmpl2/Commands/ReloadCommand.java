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
        if (args.length == 0) {
            if (sender.hasPermission("EasyHC.command.reload")) {
                ConfigLoad.loadAll();
                sender.sendMessage(ChatUtils.color("&aPrzeladowano"));
            } else {
                sender.sendMessage(ChatUtils.color("&cBrak uprawnie"));
                return true;
            }
        }
        return true;
    }
}