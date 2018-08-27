package practice;

import java.util.Scanner;

//���� �̵ �ﰢ���� ���

public class Quiz15 {
	// ���� �Ʒ��� ������ �̵ �ﰢ���� ���
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	// ���� ���� ������ �̵ �ﰢ���� ���
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print('*');
			System.out.println();
		}
	}

	// ������ ���� ������ �̵ �ﰢ���� ���
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	// ������ �Ʒ��� ������ �̵ �ﰢ���� ���
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.print("�� �� �ﰢ���Դϱ�? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		System.out.println("���� �Ʒ��� ������ �ﰢ��");
		triangleLB(n);

		System.out.println("���� ���� ������ �ﰢ��");
		triangleLU(n);

		System.out.println("������ ���� ������ �ﰢ��");
		triangleRU(n);

		System.out.println("������ �Ʒ��� ������ �ﰢ��");
		triangleRB(n);
	}
}
