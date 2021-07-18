package com.squirrelcoding.ultimatepoop.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Random;


public class pluginEvents implements Listener {

    @EventHandler

    public static void onEntityDeath(EntityDeathEvent event) {
        ItemStack drop = new ItemStack(Material.DIRT);
        drop.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1000);
        ItemMeta dropData = drop.getItemMeta();
        dropData.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "ULTIMATE POOP");
        drop.setItemMeta(dropData);
        EntityType entity = event.getEntityType();
        if (entity == EntityType.PIG) {
            Random rand = new Random();
            int chance = rand.nextInt(5) + 1;
            if (chance == 3) {
                Player player = event.getEntity().getKiller();
                String playerName = player.getName();
                event.getDrops().clear();
                event.getDrops().add(drop);
                for(Player p : Bukkit.getOnlinePlayers()) {
                    p.playSound(p.getLocation(), Sound.BLOCK_END_PORTAL_SPAWN, 1, 0);
                }
                player.sendMessage(ChatColor.RED + playerName + " has obtained the ultimate poop. Beware...");
            }
        }
    }
}
