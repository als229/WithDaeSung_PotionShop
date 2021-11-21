package com.kh.rpgshop.model.vo;

public class Buyer {

	private String nickName;
	private int money;
	
	public Buyer() {}

	public Buyer(String nickName, int money) {
		this.nickName = nickName;
		this.money = money;
	}
	
	public Buyer(int money) {
		this.money = money;
	}


	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return this.nickName + "님의 골드는" + this.money + "골드야 ~ 거지구나?";
	}
}
