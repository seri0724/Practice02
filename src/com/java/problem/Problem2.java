//5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램
package com.java.problem;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double input = 0.0;
		double sum = 0.0;

		for (int i = 0; i < 5; i++) {
			input = sc.nextDouble();
			sum += input;
		}
		System.out.println("평균은" + sum / 5 + "입니다.");
	}
}
