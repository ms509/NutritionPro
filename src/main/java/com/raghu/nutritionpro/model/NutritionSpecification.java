package com.raghu.nutritionpro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nutrition_Specification")
public class NutritionSpecification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer dailyValue;
	private Double amount;
	private String unit;

	public Integer getDailyValue() {
		return dailyValue;
	}

	public void setDailyValue(Integer dailyValue) {
		this.dailyValue = dailyValue;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
