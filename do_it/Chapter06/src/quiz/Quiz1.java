package quiz;
import java.util.Scanner;
// 연습문제 1 
//버블 정렬 (비교 / 교환을 왼쪽부터 수행)
public class Quiz1 {
	
	// a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	//  버블 정렬
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = 0;  j < n - 1; j++)
				if (a[j] > a[j+ 1])
					swap(a, j, j + 1);
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
