package net.benwoodworth.fastcraft.dependencies.item.recipe

/**
 * Provides recipe from the server.
 */
interface RecipeProvider {

    /**
     * Get recipe sources.
     *
     * @return the recipe sources
     */
    fun getRecipeSources(): List<RecipeSource>

    /**
     * Get the recipes provided by the native server.
     *
     * @return the server crafting recipes
     */
    fun getServerCraftingRecipes(): List<Recipe>
}