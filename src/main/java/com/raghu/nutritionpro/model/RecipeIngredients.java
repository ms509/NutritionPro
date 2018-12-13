package com.raghu.nutritionpro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class RecipeIngredients {

	private Integer id;

	private Recipe recipe;

	private Ingredient ingredient;
}
