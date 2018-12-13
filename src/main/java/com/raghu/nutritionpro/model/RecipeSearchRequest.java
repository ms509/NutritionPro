package com.raghu.nutritionpro.model;

public class RecipeSearchRequest {

	private String text;
	private RecipeType type;
	private Integer page;
	private Integer perPage;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RecipeType getType() {
		return type;
	}

	public void setType(RecipeType type) {
		this.type = type;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
}
