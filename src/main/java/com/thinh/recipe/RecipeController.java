package com.thinh.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipe")
public class RecipeController {

    @GetMapping
    public List<Recipe> getRecipes() {
        return List.of(
                new Recipe(
                        1L,
                        "Baoz",
                        "Chinese Food"

        ),
                new Recipe(
                        2L,
                        "BBH",
                        "VN Rice Noodle Soup"
                )
        );
    }

}
