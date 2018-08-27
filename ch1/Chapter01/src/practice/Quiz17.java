package practice;

import java.util.Scanner;
//피라미드 모양으로  출력 
public class Quiz17 {
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++)
				System.out.print(i % 10);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 단 ? ");
		int dan = stdIn.nextInt();
		npira(dan);
	}
}