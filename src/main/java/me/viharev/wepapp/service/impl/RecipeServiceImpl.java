package me.viharev.wepapp.service.impl;

import me.viharev.wepapp.model.Recipe;
import me.viharev.wepapp.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class RecipeServiceImpl implements RecipeService {
    private static Long id;
    private final static Map<Long, Recipe> recipeMap = new LinkedHashMap<>();

    @Override
    public void addRecipe(Recipe recipe) {
        recipeMap.put(id++, recipe);
        id++;
    }

    @Override
    public Recipe getRecipe(Long id) {
        return recipeMap.get(id);
    }

}
