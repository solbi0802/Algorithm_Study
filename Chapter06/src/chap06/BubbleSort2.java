package chap06;
import java.util.Scanner;

public class BubbleSort2 {
	// a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	// 버블 정렬(버전 2)
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;						// 패스의 교환 횟수를 기록합니다.
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			if (exchg == 0)	break;		// 교환이 이루어지지 않으면 종료합니다.
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 2)");
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