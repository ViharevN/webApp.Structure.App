package me.viharev.wepapp.service.impl;

import me.viharev.wepapp.model.Recipe;
import me.viharev.wepapp.service.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class RecipeServiceImpl implements RecipeService {
    private Map<Integer, Recipe> recipeMap = new HashMap<>();

    @Override
    public void addRecipe(Integer id, Recipe recipe) {
        recipeMap.put(id, recipe);
    }

    @Override
    public void getRecipe() {
        for (Map.Entry<Integer, Recipe> entry : recipeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
