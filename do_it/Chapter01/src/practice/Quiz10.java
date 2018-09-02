package practice;

import java.util.Scanner;

// 정수 a, b를 입력하고 b - a를 출력 

public class Quiz10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		do {
			System.out.print("b의값 : ");
			b = stdIn.nextInt();
			if (b <= a)
				System.out.println("a보다 큰  값을 입력하세요!");
		} while (b <= a);
		if (b > a) {
			System.out.println("b - a는 " + (b-a) + "입니다.");
		}
	}
}
