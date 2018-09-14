package chap06;
import java.util.Scanner;

public class SelectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	// �ܼ� ���� ����
	static void selectionSort(int[] a, int n) {
		for (int i =0; i < n -1; i++) {
			int min = i;							// ���� ���ĵ��� ���� �κп��� ���� ���� ����� �ε����� ����մϴ�.
			for (int j = i +1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			swap(a, i, min);					// ���� ���ĵ��� ���� �κ��� ù ��ҿ� ���� ���� ��Ҹ� ��ȯ�մϴ�.
		}
	}
	
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ܼ� ���� ����");
		System.out.print("��ڼ� :");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		selectionSort(x, nx);

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] =" + x[i]);
	}
}
