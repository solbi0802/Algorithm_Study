package test;

/* ���� 10039�� ����
�����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.
���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. 
�⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. 
������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. 
�����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int arr[] = new int[5];
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = stdIn.nextInt();
			if (arr[i] < 40)
				arr[i] = 40;
			avg += arr[i];
		}
		
		System.out.println(avg/5);
	}
}