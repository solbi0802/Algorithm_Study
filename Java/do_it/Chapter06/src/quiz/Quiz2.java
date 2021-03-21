package quiz;

import java.util.Scanner;

// 연습문제 2번
// 버블 정렬 ( 비교 / 교환 과정을 자세히 출력, 비교 횟수와 교환 횟수 출력)
public class Quiz2 {
	// a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		int ccount = 0; // 비교 횟수
		int scount = 0; // 교환 횟수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d：\n", i + 1);
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
		System.out.println("비교를 " + ccount + "회 했습니다.");
		System.out.println("교환을 " + scount + "회 했습니다.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬(버전 1)");
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