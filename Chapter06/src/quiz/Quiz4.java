package quiz;

import java.util.Scanner;
//�������� 4
// ���� ����(���� 3)�� �� / ��ȯ ������ �ڼ��� ���. 

public class Quiz4 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// ���� ����(���� 3)
	static void bubbleSort(int[] a, int n) {
		int ccount = 0; // �� Ƚ��
		int scount = 0; // ��ȯ Ƚ��
		int i = 0;
		int k = 0; // a[k]���� ������ ������ ��ģ ����
		while (k < n - 1) {
			System.out.printf("�н�%d��\n", i++);
			int last = n - 1; // ���������� ��Ҹ� ��ȯ�� ��ġ
			for (int j = n - 1; j > k; j--) {
				for (int l = 0; l < n - 1; l++)
					System.out.printf("%3d %c", a[l], (l != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
				ccount++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
					scount++;
				}
			}
			k = last;
		}
		System.out.println("�񱳸� " + ccount + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + scount + "ȸ �߽��ϴ�.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� ����(���� 3)");
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