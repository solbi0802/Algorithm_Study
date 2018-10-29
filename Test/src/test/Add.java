package test;

import java.util.Scanner;
// BAEK JOON 2558번 문제 
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class Add {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt(); // 첫번째 입력값 저장
		int b = stdIn.nextInt(); // 두번째 입력값 저장
		System.out.println(a + b);
	}
}