package com.raghu.nutritionpro.model.nutrition;

import com.raghu.nutritionpro.model.NutritionSpecification;

public class CarbsInfo {

	private NutritionSpecification fiber;
	private NutritionSpecification sugars;
	private NutritionSpecification addedSugars;
	public NutritionSpecification getFiber() {
		return fiber;
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
