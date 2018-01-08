//키보드에서 정수로 된 돈의 액수를 입력받아 
//오만원권, 만원권, 오천원권, 천원권, 
//500원동전, 100원동전, 50원동전, 1원동전 
//각 몇 개로 변환 되는지 작성 하세요.
package com.java.problem;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0;

		System.out.print("금액: ");
		money = sc.nextInt();

		System.out.println("50000원:" + money / 50000 + "개");
		money = money % 50000;
		
		System.out.println("10000원:" + money / 10000 + "개");
		money = money % 10000;
		
		System.out.println("5000원:" + money / 5000 + "개");
		money = money % 5000;
		
		System.out.println("1000원:" + money / 1000 + "개");
		money = money % 1000;
		
		System.out.println("500원:" + money / 500 + "개");
		money = money % 500;
		
		System.out.println("100원:" + money / 100 + "개");
		money = money % 100;
		
		System.out.println("50원:" + money / 50 + "개");
		money = money % 50;
		
		System.out.println("10원:" + money / 10 + "개");
		money = money % 10;
		
		System.out.println("5원:" + money / 5 + "개");
		money = money % 5;
		
		System.out.println("1원:" + money / 1 + "개");

	}

}
