package me.viharev.wepapp.controllers;

import me.viharev.wepapp.model.Recipe;
import me.viharev.wepapp.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private RecipeService recipeService;

    @GetMapping("/")
    public String hello() {
        return "Recipe page";
    }

    @GetMapping("/addRecipe")
    public void addRecipe(@RequestParam Recipe recipe) {
        this.recipeService.addRecipe(recipe);
    }

    @GetMapping("/getRecipe")
    public void getRecipeById(@RequestParam Long id) {
        this.recipeService.getRecipe(id);
    }
}
