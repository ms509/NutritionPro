package com.raghu.nutritionpro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.nutritionpro.model.Recipe;
import com.raghu.nutritionpro.model.RecipeSearchRequest;

@RestController("/recipes")
public class RecipeController {

	@RequestMapping(value = "/recipes", method = RequestMethod.GET)
	@ResponseBody
	public List<Recipe> recipes() {
		List<Recipe> recipes = new ArrayList<Recipe>();
		recipes.add(new Recipe("recipe1", "desc1"));
		recipes.add(new Recipe("recipe2", "desc2"));
		return recipes;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<Recipe> search(@ModelAttribute RecipeSearchRequest request) {
		List<Recipe> recipes = new ArrayList<Recipe>();
		recipes.add(new Recipe("recipe1", "desc1"));
		recipes.add(new Recipe("recipe2", "desc2"));
		return recipes;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public Recipe add()
	{
		return null;
		
	}
}
