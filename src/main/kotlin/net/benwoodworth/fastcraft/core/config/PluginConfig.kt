package net.benwoodworth.fastcraft.core.config

import net.benwoodworth.fastcraft.dependencies.config.Config

/**
 * A wrapper for the plugin config.
 */
class PluginConfig(
        override var config: Config
) : ConfigWrapper {

    var language: String
        get() = config.getString("language")!!
        set(value) = config.setString("language", value)

    var hiddenRecipes: List<String>
        get() = config.getStringList("hidden-recipes")!!
        set(value) = config.setStringList("hidden-recipes", value)
}