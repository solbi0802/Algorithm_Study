package practice;

import java.util.Scanner;
//n�� 7�̸� 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 �� ����ϴ� ���α׷� �ۼ�

public class Quiz7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i == n)
				System.out.print(i + " ");
			else
				System.out.print(i + " + ");
		}
		System.out.println("= " + sum);
	}
}
