package com.raghu.nutritionpro.model.nutrition;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.raghu.nutritionpro.model.NutritionSpecification;

@Entity
@Table(name = "Nutrition_Fats")
public class FatInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	private NutritionSpecification totalFat;

	
	@OneToOne
	private NutritionSpecification saturatedFat;
	
	@OneToOne
	private NutritionSpecification transFat;

	public NutritionSpecification getTotalFat() {
		return totalFat;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
