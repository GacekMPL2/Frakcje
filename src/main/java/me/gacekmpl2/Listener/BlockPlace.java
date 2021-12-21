package me.gacekmpl2.Listener;

import me.gacekmpl2.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void OnPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();
        if (e.getItemInHand().getItemMeta().equals(Main.BoyFarmer.getItemMeta())) {
            for (int a = b.getY(); a > 0; a--) {
                Location loc = new Location(p.getLocation().getWorld(), b.getX(), a, b.getZ());
                loc.getBlock().setType(Material.OBSIDIAN);
            }
        } else if (e.getItemInHand().getItemMeta().equals(Main.SandFarmer.getItemMeta())) {
            for (int a = b.getY(); a > 0; a--) {
                Location loc = new Location(p.getLocation().getWorld(), b.getX(), a, b.getZ());
                loc.getBlock().setType(Material.SAND);
            }
        } else if (e.getItemInHand().getItemMeta().equals(Main.FosaFarmer.getItemMeta())) {
            for (int a = b.getY(); a > 0; a--) {
                Location loc = new Location(p.getLocation().getWorld(), b.getX(), a, b.getZ());
                loc.getBlock().setType(Material.AIR);
            }
        }
    }
}
