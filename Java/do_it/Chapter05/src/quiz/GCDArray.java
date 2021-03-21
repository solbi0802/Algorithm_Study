package quiz;

import java.util.Scanner;
// 연습문제 3
// 배열 a의 모든 요소의 최대공약수 구하기

public class GCDArray {
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}

	static int gcdArray(int[] a, int start, int num) {
		if (num == 1)
			return a[start];
		else if (num == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, num - 1));
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("몇개의 정수의 최대공약수를 구합니까? ");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num <= 1);

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}
}