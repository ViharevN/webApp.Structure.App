package me.viharev.wepapp.controllers;

import me.viharev.wepapp.model.Ingredient;
import me.viharev.wepapp.service.IngredientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private IngredientService ingredientService;

    @GetMapping("/")
    public String hello() {
        return "App run!";
    }

    @GetMapping("/add")
    public void addIngredient(@RequestParam Ingredient ingredient) {
        this.ingredientService.addIngredient(ingredient);
    }

    @GetMapping("/get")
    public void getIngredients(@RequestParam Long id) {
        this.ingredientService.getIngredients(id);
    }
}