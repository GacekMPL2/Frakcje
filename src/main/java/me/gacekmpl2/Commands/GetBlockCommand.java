package me.gacekmpl2.Commands;

import me.gacekmpl2.Utils.ChatUtils;
import me.gacekmpl2.Utils.OtherUtils;
import me.gacekmpl2.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GetBlockCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("EasyHC.command.farmer")) {
            if (args.length != 3 && args.length != 4) {
                sender.sendMessage(ChatUtils.color("&4Poprawne uzycie komendy: &c&l/bf give boyfarmer/sandfarmer/fosafarmer <ilosc> <nick>"));
                return true;
            }
            if (!OtherUtils.isInteger(args[2])) {
                sender.sendMessage(ChatUtils.color("&4Poprawne uzycie komendy: &c&l/bf give boyfarmer/sandfarmer/fosafarmer <ilosc> <nick>"));
                return true;
            }
            int amount = Integer.parseInt(args[2]);
            Main.BoyFarmer.setAmount(amount);
            Main.SandFarmer.setAmount(amount);
            Main.FosaFarmer.setAmount(amount);
            if (args[0].equalsIgnoreCase("give")) {
                if (args[1].equalsIgnoreCase("boyfarmer")) {
                    if (args.length == 4) {
                        String nick = args[3];
                        Player target = Bukkit.getPlayer(nick);
                        if (target == null) {
                            sender.sendMessage(ChatUtils.color("&4Gracz o nicku &c" + nick + "&4 jest offline."));
                        } else {
                            target.getInventory().addItem(new ItemStack[] { Main.BoyFarmer });
                            target.sendMessage(ChatUtils.color("&dOtrzymales(as) &5&lBOYFARMER &5(&dx" + amount + "&5)"));
                            sender.sendMessage(ChatUtils.color("&5Przyznales(as) &d&lBOYFARMER &5(&dx" + amount + "&5) graczowi &d&l" + nick));
                        }
                    } else {
                        if (!(sender instanceof Player)) {
                            sender.sendMessage("Kolo nie z konsoli debilu");
                            return true;
                        }
                        Player player = (Player)sender;
                        player.getInventory().addItem(new ItemStack[] { Main.BoyFarmer });
                        sender.sendMessage(ChatUtils.color("&dOtrzymales(as) &5&lBOYFARMER &5(&dx" + amount + "&5)"));
                    }
                } else if (args[1].equalsIgnoreCase("sandfarmer")) {
                    if (args.length >= 4) {
                        String nick = args[3];
                        Player target = Bukkit.getPlayer(nick);
                        if (target == null) {
                            sender.sendMessage(ChatUtils.color("&4Gracz o nicku &c" + nick + "&4 jest offline."));
                        } else {
                            target.getInventory().addItem(new ItemStack[] { Main.SandFarmer });
                            target.sendMessage(ChatUtils.color("&6Otrzymales(as) &e&lSANDFARMER &6(&ex" + amount + "&6)"));
                            sender.sendMessage(ChatUtils.color("&6Przyznales(as) &e&lSANDFARMER  &6(&ex" + amount + "&6) graczowi &e&l" + nick));
                        }
                    } else {
                        if (!(sender instanceof Player)) {
                            sender.sendMessage("Nie no nie swiruj z konsoli");
                            return true;
                        }
                        Player player = (Player)sender;
                        player.getInventory().addItem(new ItemStack[] { Main.SandFarmer });
                        sender.sendMessage(ChatUtils.color("&6Otrzymales(as) &e&lSANDFARMER &6(&ex" + amount + "&6)"));
                    }
                } else if (args[1].equalsIgnoreCase("fosafarmer")) {
                    if (args.length >= 4) {
                        String nick = args[3];
                        Player target = Bukkit.getPlayer(nick);
                        if (target == null) {
                            sender.sendMessage(ChatUtils.color("&4Gracz o nicku &c" + nick + "&4 jest offline."));
                        } else {
                            target.getInventory().addItem(new ItemStack[] { Main.FosaFarmer });
                            target.sendMessage(ChatUtils.color("&aOtrzymales(as) &2&lFOSAFARMER &2(&ax" + amount + "&2)"));
                            sender.sendMessage(ChatUtils.color("&aPrzyznales(as) &2&lFOSAFARMER &2(&ax" + amount + "&2) graczowi &a&l" + nick));
                        }
                    } else {
                        if (!(sender instanceof Player)) {
                            sender.sendMessage("Nie no nie swiruj z konsoli");
                            return true;
                        }
                        Player player = (Player)sender;
                        player.getInventory().addItem(new ItemStack[] { Main.FosaFarmer });
                        sender.sendMessage(ChatUtils.color("&aOtrzymales(as) &2&lFOSAFARMER &2(&ax" + amount + "&2)"));
                    }
                } else {
                    sender.sendMessage(ChatUtils.color("&4Poprawne uzycie komendy: &c&l/bf give boyfarmer/sandfarmer/fosafarmer <ilosc> <nick>"));
                }
            } else {
                sender.sendMessage(ChatUtils.color("&4Poprawne uzycie komendy: &c&l/bf give boyfarmer/sandfarmer/fosafarmer <ilosc> <nick>"));
            }
        } else {
            sender.sendMessage(ChatUtils.color("&4Nie masz permisji do tej komendy!"));
        }
        return true;
    }
}