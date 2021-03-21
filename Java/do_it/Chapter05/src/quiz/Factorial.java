package quiz;

import java.util.Scanner;
// 연습문제 1

public class Factorial {
	static int factorial(int n) {
		int factorial = 1;

		while (n > 1)
			factorial *= n--;
		return factorial;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int x = stdIn.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
