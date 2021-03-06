package net.benwoodworth.fastcraft.implementations.bukkit.server

import net.benwoodworth.fastcraft.dependencies.server.FcTask
import net.benwoodworth.fastcraft.util.Adapter
import org.bukkit.scheduler.BukkitTask

/**
 * Bukkit implementation of [FcTask].
 */
class BukkitFcTask(
        task: BukkitTask
) : FcTask, Adapter<BukkitTask>(task) {

    override fun cancel() = base.cancel()
}
