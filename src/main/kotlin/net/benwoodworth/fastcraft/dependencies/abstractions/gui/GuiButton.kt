package net.benwoodworth.fastcraft.dependencies.abstractions.gui

import net.benwoodworth.fastcraft.dependencies.abstractions.event.EventGuiButtonClick
import net.benwoodworth.fastcraft.dependencies.abstractions.event.EventGuiLayoutChange
import net.benwoodworth.fastcraft.dependencies.abstractions.item.Item
import net.benwoodworth.fastcraft.dependencies.abstractions.event.Listener

/**
 * A button in a GUI.
 */
interface GuiButton {

    /**
     * A listener for layout changes.
     */
    val changeListener: Listener<EventGuiLayoutChange>

    /**
     * A listener for button clicks.
     */
    val clickListener: Listener<EventGuiButtonClick>

    /**
     * The item representing this button.
     */
    var item: Item?

    /**
     * Implementation of [GuiButton].
     */
    class Impl : GuiButton {

        override val changeListener = Listener.Impl<EventGuiLayoutChange>()

        override val clickListener = Listener.Impl<EventGuiButtonClick>()

        override var item: Item? = null
            set(value) {
                field = value
                changeListener.notifyHandlers(EventGuiLayoutChange.Impl())
            }
    }
}