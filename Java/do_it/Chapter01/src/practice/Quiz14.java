package practice;

import java.util.Scanner;

//�Է��� ���� �� ������ �ϴ� ���簢���� *��ȣ�� ���

public class Quiz14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		int dan = stdIn.nextInt();
		for(int i = 1; i <= dan; i++) {
			for(int j = 1; j <= dan; j++)
			System.out.print("*");
			System.out.println("");
		}
	}
}
