package quiz;

import java.util.Scanner;

// 연습문제 6
// 요소의 교환과정을 자세하게 출력하는 단순 선택 정렬
public class Quiz6 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// 단순 선택 정렬
	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i; // 미정렬된 부분 최소 요소의 index
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min])
					min = j;
			for (int m = 0; m < n; m++)
				System.out.print((m == i) ? "   * " : (m == min) ? "   + " : "    ");
			System.out.println();

			for (int m = 0; m < n; m++)
				System.out.printf("%3d ", a[m]);
			System.out.println("\n");
			swap(a, i, min); // 미정렬된 부분 머리요소와 최소 요소를 교환
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수 :");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		selectionSort(x, nx); // 배열 x를 단순 삽입 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
	}
}