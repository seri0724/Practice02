//주어진 문자열의 공백을 ','(콤마) 로 변경 후 출력
//char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
package com.java.problem;

public class Problem3 {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (char alphabet : c) {
			System.out.print(alphabet);
		}
		System.out.println();
		for (char alphabet : c) {
			if (alphabet == ' ') {
				alphabet = ',';
			}
			System.out.print(alphabet);
		}
	}
}
