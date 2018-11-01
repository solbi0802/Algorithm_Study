package quiz;

import java.util.Scanner;
// �������� 3
// �迭 a�� ��� ����� �ִ����� ���ϱ�

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

		System.out.print("��� ������ �ִ������� ���մϱ�? ");
		int num;
		do {
			num = stdIn.nextInt();
		} while (num <= 1);

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}

		System.out.println("�ִ� ������� " + gcdArray(x, 0, num) + "�Դϴ�.");
	}
}