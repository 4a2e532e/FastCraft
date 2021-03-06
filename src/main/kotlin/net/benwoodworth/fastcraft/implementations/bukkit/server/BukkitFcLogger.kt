package net.benwoodworth.fastcraft.implementations.bukkit.server

import net.benwoodworth.fastcraft.dependencies.server.FcLogger
import net.benwoodworth.fastcraft.util.Adapter
import java.util.logging.Level
import java.util.logging.Logger

/**
 * Bukkit implementation of [FcLogger].
 */
class BukkitFcLogger(
        logger: Logger
) : FcLogger, Adapter<Logger>(logger) {

    override fun error(message: String) = base.log(Level.SEVERE, message)

    override fun info(message: String) = base.log(Level.INFO, message)

    override fun warn(message: String) = base.log(Level.WARNING, message)
}
