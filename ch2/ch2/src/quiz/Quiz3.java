package quiz;

import java.util.Scanner;
// �迭 a�� ��� ����� �հ踦 ���϶�.

public class Quiz3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();

		int x[] = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[ " + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.println("�迭 ����� �հ� :" + sumOf(x));
	}
}
