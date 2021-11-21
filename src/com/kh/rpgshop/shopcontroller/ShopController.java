package com.kh.rpgshop.shopcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.rpgshop.model.vo.Buyer;
import com.kh.rpgshop.model.vo.Potion;
import com.kh.rpgshop.model.vo.Weapon;

public class ShopController {
	Scanner sc = new Scanner(System.in);
	Potion p = new Potion();
	Weapon w = new Weapon();
	int money = (int) (Math.random() * 200) + 100;
	Buyer b = new Buyer(money);
	
	
	List<Potion> list = new ArrayList<>();

	{
		list.add(new Potion("RedPotion", 30, "체력 50회복"));
		list.add(new Potion("BluePotion", 30, "마나 50회복"));
		list.add(new Potion("Greenotion", 50, "체력, 마나 30 회복"));
	}

	public Buyer printBuyer() {
		return b;
	}
	public List<Potion> printPotion() {
		return list;
	}

	public void insertNickName(String nickName) {
		b.setNickName(nickName);
	}

	public int money() {
		b.getMoney();
		return money;
	}

	public void buyProduct(int product) {
		if(b.getMoney() > list.get(product-1).getPrice()) {
			
			b.setMoney(b.getMoney() - list.get(product-1).getPrice());
		}else System.out.println("돈이 없구나 거지야 썩 나가렴 ~"); return;
	}

	public String potionEffect(int menu) {

		return list.get(menu - 1).toString();
	}

	public void WeaPonShop() {

		while (true) {
			System.out.println("무기 샵입니다.");
			System.out.println("1번은 검");
			System.out.println("2번은 활");
			System.out.println("3번은 방패");
			System.out.println("9번은 상점으로 돌아갑니다.");

			int num = sc.nextInt();

			if (num != 1 && num != 2 && num != 3 && num != 9) {
				System.out.println("잘못 눌렀습니다. 다시 고르세용");
				continue;
			} else if (num == 1) {
				System.out.println(w.toString(0));
			} else if (num == 2) {
				System.out.println(w.toString(1));
			} else if (num == 3) {
				System.out.println(w.toString(2));
			} else if (num == 9) {
				return;
			}
		}
	}

}
