package com.raghu.nutritionpro.model.nutrition;

import com.raghu.nutritionpro.model.NutritionSpecification;

public class FatInfo {

	private NutritionSpecification totalFat;
	private NutritionSpecification saturatedFat;
	private NutritionSpecification transFat;

	public NutritionSpecification getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(NutritionSpecification totalFat) {
		this.totalFat = totalFat;
	}

	public NutritionSpecification getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(NutritionSpecification saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public NutritionSpecification getTransFat() {
		return transFat;
	}

	public void setTransFat(NutritionSpecification transFat) {
		this.transFat = transFat;
	}

}
