package practice;

import java.util.Scanner;

//���콺�� ������ �̿��Ͽ� 1���� n������ ���� ���� ���Ͻÿ� 

public class Quiz8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = (n * (n + 1)) / 2;
		}

		System.out.println("1���� " + n + "������ �� = " + sum);
	}
}
