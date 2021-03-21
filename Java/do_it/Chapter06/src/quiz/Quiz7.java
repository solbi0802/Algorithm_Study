package quiz;

import java.util.Scanner;

// �������� 7
// �ܼ� �������Ŀ��� �迭�� ù��° ��Ҹ� ���ʷ� �Ͽ� ����
public class Quiz7 {
	static void insertSort(int[] a, int n) {
		for (int i = 2; i < n; i++) {
			int j = i;
			int tmp = a[0] = a[i];
			for (; a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			if (j > 0)
				a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܼ� ���� ����");
		System.out.print("��ڼ� :");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		insertSort(x, nx); // �迭 x�� �ܼ� ���� ����

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
	}
}
