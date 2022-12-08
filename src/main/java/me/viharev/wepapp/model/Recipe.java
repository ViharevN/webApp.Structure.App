package me.viharev.wepapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
public class Recipe {
    private String name;
    private int time;
    private List<Ingredient> ingredientList = new ArrayList<>();
    private LinkedList<String> steps = new LinkedList<>();
}
