package practice;

import java.util.Scanner;

// ���� a, b�� �Է��ϰ� b - a�� ��� 

public class Quiz10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.print("a�� �� : ");
		a = stdIn.nextInt();
		do {
			System.out.print("b�ǰ� : ");
			b = stdIn.nextInt();
			if (b <= a)
				System.out.println("a���� ū  ���� �Է��ϼ���!");
		} while (b <= a);
		if (b > a) {
			System.out.println("b - a�� " + (b-a) + "�Դϴ�.");
		}
	}
}
