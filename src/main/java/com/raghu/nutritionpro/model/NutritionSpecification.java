package com.raghu.nutritionpro.model;

public class NutritionSpecification {

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
