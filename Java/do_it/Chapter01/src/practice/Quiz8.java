package practice;

import java.util.Scanner;

//가우스의 덧셈을 이용하여 1부터 n까지의 정수 합을 구하시오 

public class Quiz8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = (n * (n + 1)) / 2;
		}

		System.out.println("1부터 " + n + "까지의 합 = " + sum);
	}
}
