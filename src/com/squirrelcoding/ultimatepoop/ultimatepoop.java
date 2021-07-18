package com.squirrelcoding.ultimatepoop;

import com.squirrelcoding.ultimatepoop.commands.Commands;
import com.squirrelcoding.ultimatepoop.events.pluginEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ultimatepoop extends JavaPlugin {
    @Override
    public void onEnable() {
        Commands commands = new Commands();
        getServer().getPluginManager().registerEvents(new pluginEvents(), this);
        getCommand("lore").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN  + "ultimatepoop plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED  + "ultimatepoop plugin is disabled");
    }

}
