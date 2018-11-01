package quiz;

import java.util.Scanner;
//연습문제 2
// 재귀 메서드 호출을 사용하지 않고 유클리드 호제법으로 최대공약수 구하기

public class GCD {
	// 정수 x, y의 최대 공약수를 구하여 반환합니다.
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("두 정수의 최대 공약수를 구합니다.");

		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요: ");
		int y = stdIn.nextInt();

		System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	}
}
