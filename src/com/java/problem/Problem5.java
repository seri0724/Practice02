//배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력 - 미니로또(중복체크 할 것)
package com.java.problem;

public class Problem5 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		int i, j, x;
		
		for (i = 0; i < 6; i++) {
			x = (int) ((Math.random() * 45) + 1); 
			lotto[i] = x;
		}
		for (j = 0; i < j; j++) {
			if (lotto[i] == lotto[j]) { //생성된 수와 이전에 저장된 수를 비교->같은 숫자 발견되면 다시 수를 생성->다시 처음부터 같은 숫자가 있는가 비교
				x = (int) ((Math.random() * 45) + 1);
				lotto[i] = x;
				i = i - 1; //중복이 발생하면 i값을 1을 줄이면서 다시 랜덤값을 할당받아 중복이 나오지 않을 때까지 돌게함
				break;
			}
		}
		for (i = 0; i < 6; i++) {
			System.out.print(" "+lotto[i]+" ");
		}

	}

}
