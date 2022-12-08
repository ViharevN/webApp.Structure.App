package me.viharev.wepapp.service;

import me.viharev.wepapp.model.Recipe;

public interface RecipeService {
    public void addRecipe(Integer id, Recipe recipe);
    public void getRecipe();

}
