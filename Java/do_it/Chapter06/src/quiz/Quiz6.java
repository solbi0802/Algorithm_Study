package quiz;

import java.util.Scanner;

// �������� 6
// ����� ��ȯ������ �ڼ��ϰ� ����ϴ� �ܼ� ���� ����
public class Quiz6 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// �ܼ� ���� ����
	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i; // �����ĵ� �κ� �ּ� ����� index
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			for (int m = 0; m < n; m++)
				System.out.print((m == i) ? "   * " : (m == min) ? "   + " : "    ");
			System.out.println();

			for (int m = 0; m < n; m++)
				System.out.printf("%3d ", a[m]);
			System.out.println("\n");
			swap(a, i, min); // �����ĵ� �κ� �Ӹ���ҿ� �ּ� ��Ҹ� ��ȯ
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
		selectionSort(x, nx); // �迭 x�� �ܼ� ���� ����

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
	}
}