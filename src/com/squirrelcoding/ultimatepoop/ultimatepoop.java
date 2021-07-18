package com.squirrelcoding.ultimatepoop;

import com.squirrelcoding.ultimatepoop.events.pluginEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ultimatepoop extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new pluginEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN  + "ultimatepoop plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED  + "ultimatepoop plugin is disabled");
    }

}
