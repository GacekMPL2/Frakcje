package me.gacekmpl2.Farmer;

import me.gacekmpl2.Listener.AbstractRecipe;
import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.Main;
import org.bukkit.Material;

public class FosaFarmer extends AbstractRecipe {
    public FosaFarmer(Main m) {
        super(m);
    }

    public String getName() {
        return ChatUtils.color("&aFosa Farmer");
    }

    public String getDescription() {
        return ChatUtils.color("&7Postaw, aby usunac wszystkie bloki az do samego dolu");
    }

    public Material getMaterial() {
        return Material.STONE;
    }
}