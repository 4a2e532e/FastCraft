package net.benwoodworth.fastcraft.implementations.bukkit.event

import net.benwoodworth.fastcraft.dependencies.event.FcEventPluginDisable
import net.benwoodworth.fastcraft.util.Adapter
import org.bukkit.event.server.PluginDisableEvent

/**
 * Bukkit implementation of [FcEventPluginDisable]
 */
class BukkitFcEventPluginDisable(
        baseEvent: PluginDisableEvent
) : FcEventPluginDisable, Adapter<PluginDisableEvent>(baseEvent)
