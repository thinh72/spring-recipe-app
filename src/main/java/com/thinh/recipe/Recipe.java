package com.thinh.recipe;

import java.util.Objects;

public class Recipe {
    private Long id;
    private String name;
    private String description;

    public Recipe() {
    }

    public Recipe(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(id, recipe.id) && Objects.equals(name, recipe.name) && Objects.equals(description, recipe.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
}
