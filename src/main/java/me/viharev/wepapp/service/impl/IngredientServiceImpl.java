package me.viharev.wepapp.service.impl;

import me.viharev.wepapp.model.Ingredient;
import me.viharev.wepapp.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private static Long num;
    private final static Map<Long, Ingredient> ingredientMap = new LinkedHashMap<>();

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredientMap.put(num, ingredient);
        num++;
    }

    @Override
    public Ingredient getIngredients(Long id) {
        return ingredientMap.get(id);
    }
}