package quiz;

import java.util.Scanner;
// �������� (���� 2) �� / ��ȯ ������ �ڼ��ϰ� ���

public class Quiz3 {

	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	static void bubbleSort(int[] a, int n) {
		int ccount = 0;		// �� Ƚ��
		int scount = 0;		// ��ȯ Ƚ��
		
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;				// �н��� ��ȯ Ƚ���� ����մϴ�.
			System.out.printf("�н�%d��\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < n -1; k++) 
					System.out.printf("%3d %c", a[k], (k!= j -1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
					System.out.printf("%3d\n", a[n - 1]);
					ccount++;
					if ( a[j- 1] > a[j]) {
						swap(a, j -1, j);
						exchg++;
						scount++;
					}
				}			
			for (int k = 0; k < n; k++)
				System.out.printf("%3d" , a[k]);
			System.out.println();
			if (exchg == 0) break;	// ��ȯ�� �̷������ ������ �����մϴ�.
		}
		System.out.println("�񱳸� " + ccount + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + scount + "ȸ �߽��ϴ�.");
}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int n = stdIn.nextInt();

		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, n);

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < n; i++)
			System.out.println("x[" + i + "] =" + x[i]);
	}
}
