package me.viharev.wepapp.service;

import me.viharev.wepapp.model.Recipe;

public interface RecipeService {
    public void addRecipe(Recipe recipe);
    public Recipe getRecipe(Long id);
}