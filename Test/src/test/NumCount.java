package test;

/*
 ���� 2577�� ����
�� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 
0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� 
A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 */
import java.util.Scanner;

public class NumCount {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int arr[] = new int[10];
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int result = a * b * c;

		while (result != 0) {
			arr[result % 10] += 1;
			result /= 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
