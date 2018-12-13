package com.raghu.nutritionpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.nutritionpro.model.Ingredient;
import com.raghu.nutritionpro.repo.IngredientRepo;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepo repo;

	public Ingredient save(Ingredient ingredient) {
		ingredient = this.repo.save(ingredient);
		return ingredient;
	}
}
