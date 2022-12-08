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

    @GetMapping("/hello")
    public String hello() {
        return "App run";
    }

    @GetMapping("/add")
    public void addRecipe(@RequestParam Integer id,
                          @RequestParam Recipe recipe) {
        recipeService.addRecipe(id, recipe);
    }

    @GetMapping("/all")
    public void getRecipes() {
        recipeService.getRecipe();
    }

    @GetMapping("/bye")
    public String printBye() {
        return "Good Bye";
    }
}
