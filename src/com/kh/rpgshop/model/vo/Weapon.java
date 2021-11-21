package com.kh.rpgshop.model.vo;

public class Weapon extends Product{
	
	
	private static final String SWORD = "공격력 10"; 
	private static final String BOW = "공격력 20"; 
	private static final String SHIELD = "방어력 30"; 
	private String[] Weapon = {SWORD , BOW , SHIELD};

	public Weapon() {
		super("포션",20);
	}
	
	public String[] getWeapon() {
		return Weapon;
	}
	
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}

	public static String getSword() {
		return SWORD;
	}

	public static String getBow() {
		return BOW;
	}

	public static String getShield() {
		return SHIELD;
	}

	
	public String toString(int a) {
		return super.toString() + " 능력은 " + Weapon[a] + "입니다.";
	}
	

}
