package quiz;

import java.util.Scanner;
// �������� 1

public class Factorial {
	static int factorial(int n) {
		int factorial = 1;

		while (n > 1)
			factorial *= n--;
		return factorial;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���: ");
		int x = stdIn.nextInt();

		System.out.println(x + "�� ���丮���� " + factorial(x) + "�Դϴ�.");
	}
}
