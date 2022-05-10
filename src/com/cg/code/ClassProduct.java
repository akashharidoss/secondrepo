package com.cg.code;

import java.util.Objects;

public class ClassProduct {
	private int proCode;
	private String prodName;
	private float price;
	private float ratings;
	public ClassProduct(int proCode, String prodName, float price, float ratings) {
		super();
		this.proCode = proCode;
		this.prodName = prodName;
		this.price = price;
		this.ratings = ratings;
	}
	public int getProCode() {
		return proCode;
	}
	public void setProCode(int proCode) {
		this.proCode = proCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "ClassProduct [proCode=" + proCode + ", prodName=" + prodName + ", price=" + price + ", ratings="
				+ ratings + "]";
	}
	
	}
	
	

