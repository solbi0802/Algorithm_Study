package quiz;

import java.util.Scanner;

// �������� 2��
// ���� ���� ( �� / ��ȯ ������ �ڼ��� ���, �� Ƚ���� ��ȯ Ƚ�� ���)
public class Quiz2 {
	// a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// ���� ����
	static void bubbleSort(int[] a, int n) {
		int ccount = 0; // �� Ƚ��
		int scount = 0; // ��ȯ Ƚ��

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("�н�%d��\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < n - 1; k++) {
					System.out.printf("%3d %c", a[k], (k != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
					System.out.printf("%3d\n", a[n - 1]);
					ccount++;
					if (a[j - 1] > a[j]) {
						scount++;
						swap(a, j - 1, j);
					}
				}
				for (int k = 0; k < n; k++)
					System.out.printf("%3d ", a[k]);
				System.out.println();
			}
		}
		System.out.println("�񱳸� " + ccount + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + scount + "ȸ �߽��ϴ�.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� ����(���� 1)");
		System.out.print("��ڼ� :");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] =" + x[i]);
	}
}