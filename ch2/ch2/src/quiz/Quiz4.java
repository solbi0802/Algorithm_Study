package quiz;

import java.util.Scanner;

public class Quiz4 {
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�迭 a�� ��ڼ� :");
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("�迭 b�� ��ڼ� :");
		int nb = stdIn.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] :");
			b[i] = stdIn.nextInt();
		}
		copy(a, b);
		System.out.println("�迭 b�� ��� ��Ұ� �����  a �迭 ���");
		for (int i = 0; i < na; i++) {
			System.out.print(" " + a[i]);
		}
	}
}
