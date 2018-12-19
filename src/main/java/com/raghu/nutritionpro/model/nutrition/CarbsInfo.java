package com.raghu.nutritionpro.model.nutrition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.raghu.nutritionpro.model.NutritionSpecification;

@Entity
@Table(name = "Nutrition_Carbs")
public class CarbsInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private NutritionSpecification fiber;
	
	@OneToOne
	private NutritionSpecification sugars;
	
	@OneToOne
	private NutritionSpecification addedSugars;

	public NutritionSpecification getFiber() {
		return fiber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFiber(NutritionSpecification fiber) {
		this.fiber = fiber;
	}

	public NutritionSpecification getSugars() {
		return sugars;
	}

	public void setSugars(NutritionSpecification sugars) {
		this.sugars = sugars;
	}

	public NutritionSpecification getAddedSugars() {
		return addedSugars;
	}

	public void setAddedSugars(NutritionSpecification addedSugars) {
		this.addedSugars = addedSugars;
	}
}
