package practice;

import java.util.Scanner;

// ���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���϶� 
public class Quiz9 {
	static int sumof(int a, int b) {
		int sum = 0;
		if (a > b) {
			for (int i = b; i <= a; i++)
				sum += i;
		} else {
			for (int i = a; i <= b; i++)
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println(a + "��" + b + "������ �� = " + sumof(a, b));
	}
}