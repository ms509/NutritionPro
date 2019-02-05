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

	public List<Ingredient> get(String searchText) {
		List<Ingredient> ingredients = new ArrayList<>();
		List<Ingredient> finalList = new ArrayList<>();
		Ingredient in1 = new Ingredient();
		in1.setName("Toor Dal");
		in1.setDescription("Toor Dal");
		
		Ingredient in2 = new Ingredient();
		in2.setName("Onions");
		in2.setDescription("Onions");
		
		ingredients.add(in1);
		ingredients.add(in2);
		
		for(Ingredient in:ingredients)
		{
			if(in.getName().toLowerCase().contains(searchText))
			{
				finalList.add(in);
			}
		}
//		try {
//			ingredients = IteratorUtils.toList(this.repo.findAll().iterator());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		return finalList;
	}
}
