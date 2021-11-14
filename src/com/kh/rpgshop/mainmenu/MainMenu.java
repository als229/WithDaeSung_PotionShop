package com.kh.rpgshop.mainmenu;

import java.util.Scanner;

import com.kh.rpgshop.model.vo.Potion;
import com.kh.rpgshop.model.vo.Weapon;

public class MainMenu {

	private Scanner sc = new Scanner(System.in);
	Potion p = new Potion();
	Weapon w = new Weapon();
	
	public void ManinMenu() {
		while(true){
			System.out.println("안녕하세여 상점입니다. ");
			System.out.println("1. 포션 ");
			System.out.println("2. 무기 ");
			System.out.println("9. 상점을 나갑니다. ");
			int input = sc.nextInt();

			if (input != 1 && input != 2 && input != 9) {
				System.out.println("잘못 입력했따. 다시해라");
				continue;
			}
			else if(input == 1) {
				
				
			}
		}
	}

	
	

}
