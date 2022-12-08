package me.viharev.wepapp.service;

import me.viharev.wepapp.model.Ingredient;

public interface IngredientService {
    public void addIngredient(Ingredient ingredient);

    public Ingredient getIngredients(Long id);
}
