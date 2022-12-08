package me.viharev.wepapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Ingredient {
    private String nameIngredient;
    private int timeOfPreparing;
    private String unit;
}
