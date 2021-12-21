package me.gacekmpl2.Utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.HashMap;
import java.util.Map;


public class ChatUtils {
    public static String color(String toColor) {
        return toColor.replaceAll("&", String.valueOf('§'));
    }

    public static void sendMessage(Player player, String message) {
        player.sendMessage(color(message));
    }
    public static void giveItems(Player p, ItemStack... items) {
        PlayerInventory playerInventory = p.getInventory();
        HashMap<Integer, ItemStack> notStored = playerInventory.addItem(items);
        for (Map.Entry<Integer, ItemStack> e : notStored.entrySet())
            p.getWorld().dropItemNaturally(p.getLocation(), e.getValue());
    }
}