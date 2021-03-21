package quiz;

import java.util.Scanner;

// �� �� ���� �� ��(12�� 31���̸� 0, 12�� 30���̸� 1)�� ���Ͻÿ�.

public class Quiz9 {
	// �� ���� �ϼ�
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int leftDayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return 365 + isLeap(y) - d;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;

		System.out.println("�� �� ���� �� ���� ���մϴ�.");

		do {
			System.out.print("�� : ");
			int year = stdIn.nextInt();
			System.out.print("�� : ");
			int month = stdIn.nextInt();
			System.out.print("�� : ");
			int day = stdIn.nextInt();

			System.out.printf("�� �� ���� �� ���� %d���Դϴ�.\n", leftDayOfYear(year, month, day));

			System.out.print("�ѹ� �� �ұ�� ? (1.�� / 0.�ƴϿ�) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
