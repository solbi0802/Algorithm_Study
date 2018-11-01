package quiz;

import java.util.Scanner;
//연습문제 4
// 버블 정렬(버전 3)의 비교 / 교환 과정을 자세히 출력. 

public class Quiz4 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	// 버블 정렬(버전 3)
	static void bubbleSort(int[] a, int n) {
		int ccount = 0; // 비교 횟수
		int scount = 0; // 교환 횟수
		int i = 0;
		int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
		while (k < n - 1) {
			System.out.printf("패스%d：\n", i++);
			int last = n - 1; // 마지막으로 요소를 교환한 위치
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
		System.out.println("비교를 " + ccount + "회 했습니다.");
		System.out.println("교환을 " + scount + "회 했습니다.");
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬(버전 3)");
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