package com.raghu.nutritionpro.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raghu.nutritionpro.model.Ingredient;

@Repository
public interface IngredientRepo extends CrudRepository<Ingredient, Integer>{

}
