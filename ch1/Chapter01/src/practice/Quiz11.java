package practice;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int num;
		do {
			System.out.print("정수를 입력하시오 : ");
			num = stdIn.nextInt();
		} while (num <= 0);
		
		int digit = 0; // 자릿수를 저장
		while(num > 0) {
			num/=10;
			digit++;
		}
		System.out.println("그 수는 " + digit + "자리입니다.");
	}
}
