package com.kh.rpgshop.model.vo;

public class Product {
	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + "의 가격은 " + price + "골드야~~";
	}
	
}
