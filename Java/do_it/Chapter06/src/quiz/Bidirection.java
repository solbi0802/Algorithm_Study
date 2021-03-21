package quiz;

import java.util.Scanner;

// 연습문제 5
// 양방향 버블 정렬
public class Bidirection {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	// 양방향 버블 정렬
	static void bubbleSort(int[] a, int n) {
		int left = 0;							// a[k]보다 앞쪽은 정렬을 마친 상태
		int right =n - 1;
		int last = right;
		while (left < right) {
		for(int j = right; j > left; j--) {
			if (a[j - 1] > a[j]) {
				swap(a, j -1, j);
				last = j;
			}
		}
		left = last;
		for (int j = left; j <right; j++) {
			if (a[j] > a[j +1]) {
				swap(a, j, j+1);
				last = j;
			}
		}
		right = last;
	}
}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("양방향 버블 정렬");
		System.out.print("요솟수 :");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] =" + x[i]);
	}
}