package haxlyst.chickenParachute

import org.bukkit.plugin.java.JavaPlugin

class ChickenParachute : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(PlayerMoveListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
