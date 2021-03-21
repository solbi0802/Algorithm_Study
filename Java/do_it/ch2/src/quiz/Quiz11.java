package quiz;

import java.util.Scanner;

public class Quiz11 {
	static class YMD {
		int y; // 년
		int m; // 월(1 ~12)
		int d; // 일(1 ~31)

		static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

		static int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}

		// 생성자
		YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}

		// n일 뒤의 날짜를 반환
		YMD after(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			if (n < 0)
				return (before(-n));
			temp.d += n;

			while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
				temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
				if (++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			return temp;

		}

		// n일 앞의 날짜를 반환
		YMD before(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			if (n < 0)
				return (after(-n));
			temp.d -= n;

			while (temp.d < 1) {
				if (--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
				temp.d += mdays[isLeap(temp.y)][temp.m - 1];
			}
			return temp;

		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("년 :");
		int year = stdIn.nextInt();
		System.out.print("월 :");
		int month = stdIn.nextInt();
		System.out.print("일 :");
		int day = stdIn.nextInt();

		YMD date = new YMD(year, month, day);
		System.out.print("몇 일 앞 / 뒤 날짜 ?");
		int n = stdIn.nextInt();

		YMD after = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년%d월%d일입니다.\n", n, after.y, after.m, after.d);

		YMD before = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년%d월%d일입니다.\n", n, before.y, before.m, before.d);
	}
}
