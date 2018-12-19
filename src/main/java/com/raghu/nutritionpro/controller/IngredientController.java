package com.raghu.nutritionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.nutritionpro.model.Ingredient;
import com.raghu.nutritionpro.service.IngredientService;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

	@Autowired
	private IngredientService service;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Ingredient save(@ModelAttribute Ingredient ingredient) {

		return this.service.save(ingredient);
	}

	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public List<Ingredient> get() {

		return this.service.get();
	}
}
