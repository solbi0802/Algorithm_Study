package practice;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int num;
		do {
			System.out.print("������ �Է��Ͻÿ� : ");
			num = stdIn.nextInt();
		} while (num <= 0);
		
		int digit = 0; // �ڸ����� ����
		while(num > 0) {
			num/=10;
			digit++;
		}
		System.out.println("�� ���� " + digit + "�ڸ��Դϴ�.");
	}
}
