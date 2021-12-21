package me.gacekmpl2.Farmer;

import me.gacekmpl2.Listener.AbstractRecipe;
import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.Main;
import org.bukkit.Material;

public class SandFarmer extends AbstractRecipe {
    public SandFarmer(Main m) {
        super(m);
    }

    public String getName() {
        return ChatUtils.color("&aSandFarmer");
    }

    public String getDescription() {
        return ChatUtils.color("&7Postaw, aby stworzyc piasek do samego dolu");
    }

    public Material getMaterial() {
        return Material.SAND;
    }
}
