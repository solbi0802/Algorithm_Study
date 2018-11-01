package quiz;

import java.util.Scanner;

// 연습문제 6
// 하노이탑) 문자열로 기둥 이름 출력
public class Hanoi {
	// no개의 원반을 a기둥에서 b 기둥으로 옮김
	static String[] name = { "A기둥", "B기둥", "C기둥" };

	static void move(int no, int x, int y) {
		if (no > 1)
			move(no - 1, x, 6 - x - y);

		System.out.println("원반[" + no + "]을 " + name[x - 1] + "기둥에서 " + name[y - 1] + "기둥으로 옮김");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("하노이의 탑");
		System.out.print("원반 개수 :");
		int n = stdIn.nextInt();

		move(n, 1, 3);
	}
}
