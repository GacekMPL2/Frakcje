package me.gacekmpl2;

import me.gacekmpl2.Commands.GetBlockCommand;
import me.gacekmpl2.Commands.YouTubeCommand;
import me.gacekmpl2.Farmer.BoyFarmer;
import me.gacekmpl2.Farmer.FosaFarmer;
import me.gacekmpl2.Farmer.SandFarmer;
import me.gacekmpl2.Listener.BlockPlace;
import me.gacekmpl2.System.ArmorSystem;
import me.gacekmpl2.Utils.TabCompliter;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;


public final class Main extends JavaPlugin {

    private static Main plugin;

    public static ItemStack BoyFarmer;

    public static ItemStack SandFarmer;

    public static ItemStack FosaFarmer;

    public void onEnable() {
        getLogger().info("Plugin sie wlaczyl");
        getCommand("boyfarmer").setTabCompleter((TabCompleter) new TabCompliter());
        getCommand("boyfarmer").setExecutor((CommandExecutor) new GetBlockCommand());
        getCommand("yt").setExecutor((CommandExecutor)new YouTubeCommand());
        Bukkit.getPluginManager().registerEvents((Listener) new BlockPlace(), (Plugin) this);
        BoyFarmer bf = new BoyFarmer(this);
        BoyFarmer = bf.getFarmer();
        SandFarmer sf = new SandFarmer(this);
        SandFarmer = sf.getFarmer();
        FosaFarmer ff = new FosaFarmer(this);
        FosaFarmer = ff.getFarmer();

        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
            Random r = new Random();

            public void run() {
                Color c = Color.fromBGR(r.nextInt(255), r.nextInt(255), r.nextInt(255));
                ArmorSystem.setCustomArmor(c);
            }
        }, 0L, 5L);
    }
        public static Main getPlugin () {
            return plugin;
        }
    }

