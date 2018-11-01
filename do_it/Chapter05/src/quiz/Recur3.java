package quiz;

import java.util.Scanner;

// 연습문제 5
// 비재귀 메서드 구현
public class Recur3 {
	static void recur3(int n) {
		int stk[] = new int[100];
		int stk2[] = new int[100];
		int ptr = -1;
		int sw = 0;
		while (true) {
			if (n > 0) {
				ptr++;
				stk[ptr] = n;
				stk2[ptr] = sw;
				if (sw == 0)
					n = n - 1;
				else if (sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			do {
				n = stk[ptr];
				sw = stk2[ptr--] + 1;
				
				if (sw == 2) {
					System.out.println(n);
					if (ptr < 0)
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 :");
		int x = stdIn.nextInt();
		
		recur3(x);
	}
}