package me.gacekmpl2.Listener;

import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.Main;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


public abstract class AbstractRecipe {
    static Main plugin;

    public ItemStack Farmer;

    public AbstractRecipe(Main m) {
        plugin = m;
        setRecipe();
    }

    public abstract String getName();

    public abstract String getDescription();

    public abstract Material getMaterial();

    public void setRecipe() {
        ItemStack item = new ItemStack(getMaterial(), 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatUtils.color(getName()));
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatUtils.color(getDescription()));
        meta.setLore(lore);
        item.setItemMeta(meta);
        this.Farmer = item;
        ShapedRecipe recipe = new ShapedRecipe(item);
        recipe.shape(new String[] { "123", "456", "789" });
        recipe.setIngredient('1', getMaterial());
        recipe.setIngredient('2', getMaterial());
        recipe.setIngredient('3', getMaterial());
        recipe.setIngredient('4', getMaterial());
        recipe.setIngredient('5', Material.GOLDEN_APPLE);
        recipe.setIngredient('6', getMaterial());
        recipe.setIngredient('7', getMaterial());
        recipe.setIngredient('8', getMaterial());
        recipe.setIngredient('9', getMaterial());
        plugin.getServer().addRecipe((Recipe)recipe);
    }

    public ItemStack getFarmer() {
        return this.Farmer;
    }
}