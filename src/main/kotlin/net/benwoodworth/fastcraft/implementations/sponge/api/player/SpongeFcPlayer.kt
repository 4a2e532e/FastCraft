package net.benwoodworth.fastcraft.implementations.sponge.api.player

import net.benwoodworth.fastcraft.dependencies.api.player.FcPlayer
import net.benwoodworth.fastcraft.dependencies.api.text.FcText
import net.benwoodworth.fastcraft.implementations.sponge.api.text.SpongeFcText
import net.benwoodworth.fastcraft.util.Adapter
import org.spongepowered.api.entity.living.player.Player
import java.util.*

/**
 * Sponge implementation of [FcPlayer].
 */
class SpongeFcPlayer(
        basePlayer: Player
) : FcPlayer, Adapter<Player>(basePlayer) {

    override val username: String
        get() = base.name

    override var displayName: FcText?
        get() = SpongeFcText(base.displayNameData.displayName().get())
        set(value) {
            base.displayNameData.displayName().set(
                    (value as SpongeFcText).base
            )
        }

    override val uuid: UUID
        get() = base.uniqueId

    override fun sendMessage(message: FcText) {
        base.sendMessage(
                (message as SpongeFcText).base
        )
    }

    override fun hasPermission(permission: String): Boolean {
        return base.hasPermission(permission)
    }
}
