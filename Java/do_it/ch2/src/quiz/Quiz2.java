package quiz;

import java.util.Scanner;

public class Quiz2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println("a[" + idx1 + "] 과 a[" + idx2 + "]를 교환합니다.");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
		System.out.println();
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수는 ：");
		int num = stdIn.nextInt(); // 요솟수

		int[] x = new int[num]; // 요솟수 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
