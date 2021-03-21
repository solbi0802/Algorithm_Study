package test;
import java.util.Scanner;

//팰린드롬인 수의 개수 구하기
public class Palindrome {
	public static int solution(int n, int m) {
		int answer = 0; // 팰린드롬의 갯수를 저장하는 변수
		String originNum = null;
		String[] pdr = new String[m];
		for (int i = n; i <= m; i++) {
			originNum = Integer.toString(i);
			String reverseNum = Integer.toString(reverse(i));
			if (originNum.equals(reverseNum)) {
				answer++;
				pdr[i] = originNum;
			}
		}
		System.out.println(n + " 이상 " + m + " 이하의 팰린드롬은 다음과 같이 " + answer + "개가 있습니다.");
		return answer;
	}

	private static int reverse(int num) {
		int result = 0;
		while (num != 0) {
			result = result * 10 + num % 10;
			num /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n :");
		int n = stdIn.nextInt();
		System.out.print("m :");
		int m = stdIn.nextInt();
		solution(n, m);

	}
}
