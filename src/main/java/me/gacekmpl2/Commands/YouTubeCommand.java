package me.gacekmpl2.Commands;


import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.Utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YouTubeCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("frakcje.command.yt")) {
            sender.sendMessage(ChatUtils.color("&cBrak uprawnien"));
            return true;
        }
        if (args.length != 1) {
            sender.sendMessage(ChatUtils.color("&c/Uzycie: " + label + " <link>"));
            return true;
        }
        for (Player player : Bukkit.getOnlinePlayers())
            player.sendMessage(ChatUtils.color("" + Messages.prefix + " " + Messages.youTubeBroadcastMessage + " " + args[0]));
        return true;
    }
}
