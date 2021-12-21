package me.gacekmpl2.System;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmorSystem {
    public static void setCustomArmor(Color c) {
        for(Player ps: Bukkit.getOnlinePlayers()) {
            PlayerInventory i = ps.getInventory();

            if(i.getHelmet() != null && i.getHelmet().getType() == Material.LEATHER_HELMET) {
                i.setHelmet(getColor(Material.LEATHER_HELMET, c));
            }

            if(i.getChestplate() != null && i.getChestplate().getType() == Material.LEATHER_CHESTPLATE) {
                i.setChestplate(getColor(Material.LEATHER_CHESTPLATE, c));
            }
            if(i.getLeggings() != null && i.getLeggings().getType() == Material.LEATHER_LEGGINGS) {
                i.setLeggings(getColor(Material.LEATHER_LEGGINGS, c));
            }
            if(i.getBoots() != null && i.getBoots().getType() == Material.LEATHER_BOOTS) {
                i.setBoots(getColor(Material.LEATHER_BOOTS, c));
            }
        }

    }
    public static ItemStack getColor(Material mat, Color c) {
        ItemStack item = new ItemStack(mat,1 );
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();

        meta.setColor(c);

        item.setItemMeta(meta);

        return  item;
    }
}