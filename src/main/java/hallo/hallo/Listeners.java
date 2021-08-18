package hallo.hallo;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlock().getType().equals(Material.CHEST)) {


            Player player = (Player) Bukkit.getOnlinePlayers();
            World world = player.getWorld();
            Location location = event.getBlock().getLocation();

            int r = Integer.valueOf(args[0]);

            int x = location.getBlockX();
            int y = location.getBlockY();
            int z = location.getBlockZ();
        }

    }
}