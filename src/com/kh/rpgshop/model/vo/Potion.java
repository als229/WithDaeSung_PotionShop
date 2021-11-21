package com.kh.rpgshop.model.vo;


public class Potion extends Product{
	private String effect;
	
	
	public Potion () {}
	
	public Potion(String name, int price, String effect) {
		super(name,price);
		this.effect = effect;
	}
	
	public String getEffect() {
		return effect;
	}


	@Override
	public String toString() {
		return 
		super.toString()+ "효과 : " + this.effect;
	}
}
