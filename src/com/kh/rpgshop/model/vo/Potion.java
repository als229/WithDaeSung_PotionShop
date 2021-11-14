package com.kh.rpgshop.model.vo;

public class Potion extends Product{
	private static final String REDPOTION = "HP 50 증가"; 
	private static final String BLUEPOTION = "MP 50 증가"; 
	private static final String GREENPOTION = "MP 25 증가, HP 25 증가"; 
	private String[] potion = {REDPOTION , BLUEPOTION , GREENPOTION};

	public Potion () {}
	
	
	
	public String[] getPotion() {
		return potion;
	}

	public void setPotion(String[] potion) {
		this.potion = potion;
	}

	public static String getRedpotion() {
		return REDPOTION;
	}

	public static String getBluepotion() {
		return BLUEPOTION;
	}

	public static String getGreenpotion() {
		return GREENPOTION;
	}

	public String toString(int a) {
		return super.toString() + " 효과는 " + potion[a] + "입니다.";
	}
	
	
}
