package com.raghu.nutritionpro.model.nutrition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.raghu.nutritionpro.model.NutritionSpecification;

@Entity
@Table(name = "Nutrition_Info")
public class NutritionInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private CarbsInfo carbs;
	
	@OneToOne
	private NutritionSpecification protein;
	
	@OneToOne
	private FatInfo fats;
	
	@OneToOne
	private NutritionSpecification cholesterol;
	
	@OneToOne
	private NutritionSpecification sodium;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarbsInfo getCarbs() {
		return carbs;
	}

	public void setCarbs(CarbsInfo carbs) {
		this.carbs = carbs;
	}

	public NutritionSpecification getProtein() {
		return protein;
	}

	public void setProtein(NutritionSpecification protein) {
		this.protein = protein;
	}

	public FatInfo getFats() {
		return fats;
	}

	public void setFats(FatInfo fats) {
		this.fats = fats;
	}

	public NutritionSpecification getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(NutritionSpecification cholesterol) {
		this.cholesterol = cholesterol;
	}

	public NutritionSpecification getSodium() {
		return sodium;
	}

	public void setSodium(NutritionSpecification sodium) {
		this.sodium = sodium;
	}
}
