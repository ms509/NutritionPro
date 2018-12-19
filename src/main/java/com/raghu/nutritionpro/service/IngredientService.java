package com.raghu.nutritionpro.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
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

	public List<Ingredient> get() {
		List<Ingredient> ingredients = new ArrayList<>();
		try {
			ingredients = IteratorUtils.toList(this.repo.findAll().iterator());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ingredients;
	}
}
