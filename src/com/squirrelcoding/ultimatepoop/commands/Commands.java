package com.squirrelcoding.ultimatepoop.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {return true;}
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("lore")) {
            player.sendMessage(ChatColor.GREEN + "A long time ago, there was a pig called the 'evil pig'.");
            player.sendMessage(ChatColor.GREEN + "It ravaged towns, brutally murdered fellow pigs and was unstoppable.");
            player.sendMessage(ChatColor.GREEN + "Legend has it that it is hiding amongst its own kind, and when slained, it will drop a mystical item.");
            return true;
        }
        return true;
    }
}
