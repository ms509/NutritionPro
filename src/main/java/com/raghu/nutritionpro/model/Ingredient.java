package com.raghu.nutritionpro.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.raghu.nutritionpro.enums.CuisineType;

@Entity(name = "Ingredient")
public class Ingredient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String description;

	@Enumerated(EnumType.STRING)
	private RecipeType type;

	@Enumerated(EnumType.STRING)
	private CuisineType cuisineType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public RecipeType getType() {
		return type;
	}

	public void setType(RecipeType type) {
		this.type = type;
	}

	public CuisineType getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(CuisineType cuisineType) {
		this.cuisineType = cuisineType;
	}
}
