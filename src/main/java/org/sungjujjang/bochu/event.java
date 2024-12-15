package org.sungjujjang.bochu;

import org.bukkit.ChatColor;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerKickEvent;

import static org.bukkit.Bukkit.getServer;

public class event implements Listener {
    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if(event.getEntity() instanceof Villager) {
            if (Bochu.isVilligerHit) {
                return;
            }
            if (!event.getDamager().isOp() && event.getDamager() instanceof Player) {
                event.setCancelled(true);
                String name = event.getDamager().getName();
                String message = ChatColor.RED + name + "<< 주민때림";
                getServer().broadcastMessage(message);
            }
            if (!(event.getDamager() instanceof Player)) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onkickplayer(PlayerKickEvent event) {
        Player player = event.getPlayer();
        event.setLeaveMessage(ChatColor.RED + player.getName() + " 님이 운지당했습니다.");
    }
}
