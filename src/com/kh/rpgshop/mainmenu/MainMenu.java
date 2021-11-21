package com.kh.rpgshop.mainmenu;

import java.util.Scanner;

import com.kh.rpgshop.shopcontroller.ShopController;

public class MainMenu {

	private Scanner sc = new Scanner(System.in);
	ShopController c = new ShopController();

	public void mainMenu() {
		System.out.println("-------------------------------------");
		System.out.println("안녕? 반가워! 닉네임을 입력해 줄래?? ");
		String nickname = sc.nextLine();
		c.insertNickName(nickname);
		while (true) {
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.println("고마워~ 상점이야. 뭘 도와줄까????");
			System.out.println("1. 포션 ");
			System.out.println("2. 무기 ");
			System.out.println("3. 아이템 팔기");
			System.out.println("4. 아이템 조회");
			System.out.println("9. 상점을 나갑니다. ");
			System.out.println("                             잔액 : " + c.printBuyer().getMoney() + "골드");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				potionShop();
				break;
//			case 2 : WeaponShop(); break;
//			case 3 : sellProduct(); break;
//			case 4 : searchProduct(); break;
//			case 9 : potionShop(); break;
			}
		}
	} // mainMenu 끝

	public void potionShop() {
		System.out.println();
		System.out.println("------------------뾰로롱--------------------");
		System.out.println("안녕? 포션샵이야 뭘 사고 싶니?");
		for (int i = 0; i < c.printPotion().size(); i++) {
			System.out.println((i + 1) + " " + c.printPotion().get(i));
		}
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			System.out.println(c.printPotion().get(menu).getName() + "을 샀구나 ~ " + c.potionEffect(menu));
			c.buyProduct(menu);
			System.out.println(c.printBuyer().toString());
			break;
		case 2:
			System.out.println("RedPotion을 사셨습니다. " + c.potionEffect(menu));
			c.buyProduct(menu);
			System.out.println(c.printBuyer().toString());
			break;
		case 3:
			System.out.println("RedPotion을 사셨습니다. " + c.potionEffect(menu));
			c.buyProduct(menu);
			System.out.println(c.printBuyer().toString());
			break;
		default : System.out.println("잘못입력하셨습니다.... 똑바로 입력하시게나...");
		}

	}

}
