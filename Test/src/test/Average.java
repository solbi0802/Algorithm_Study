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
		int one = stdIn.nextInt(); // ������ ����
		int two = stdIn.nextInt(); // ���� ����
		int three = stdIn.nextInt(); // ����� ����
		int four = stdIn.nextInt(); // �� ����
		int five = stdIn.nextInt(); // ���� ����

		if (one < 40)
			one = 40;
		if (two < 40)
			two = 40;
		if (three < 40)
			three = 40;
		if (four < 40)
			four = 40;
		if (five < 40)
			five = 40;
		int avg = (one + two + three + four + five) / 5;
		System.out.println(avg);
	}
}