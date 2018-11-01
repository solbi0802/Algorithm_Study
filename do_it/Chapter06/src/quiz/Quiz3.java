package quiz;

import java.util.Scanner;
// 버블정렬 (버전 2) 비교 / 교환 과정을 자세하게 출력

public class Quiz3 {

	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	static void bubbleSort(int[] a, int n) {
		int ccount = 0;		// 비교 횟수
		int scount = 0;		// 교환 횟수
		
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;				// 패스의 교환 횟수를 기록합니다.
			System.out.printf("패스%d：\n", i + 1);
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
			if (exchg == 0) break;	// 교환이 이루어지지 않으면 종료합니다.
		}
		System.out.println("비교를 " + ccount + "회 했습니다.");
		System.out.println("교환을 " + scount + "회 했습니다.");
}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수: ");
		int n = stdIn.nextInt();

		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, n);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < n; i++)
			System.out.println("x[" + i + "] =" + x[i]);
	}
}
