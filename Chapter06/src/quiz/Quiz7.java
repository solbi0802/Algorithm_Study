package quiz;

import java.util.Scanner;

// 연습문제 7
// 단순 삽입정렬에서 배열의 첫번째 요소를 보초로 하여 삽입
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
		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수 :");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}
		insertSort(x, nx); // 배열 x를 단순 삽입 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
	}
}
