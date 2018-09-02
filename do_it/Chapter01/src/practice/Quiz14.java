package practice;

import java.util.Scanner;

//입력한 수를 한 변으로 하는 정사각형을 *기호로 출력

public class Quiz14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		int dan = stdIn.nextInt();
		for(int i = 1; i <= dan; i++) {
			for(int j = 1; j <= dan; j++)
			System.out.print("*");
			System.out.println("");
		}
	}
}
