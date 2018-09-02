package test;
import java.util.Scanner;

//�Ӹ������ ���� ���� ���ϱ�
public class Palindrome {
	public static int solution(int n, int m) {
		int answer = 0; // �Ӹ������ ������ �����ϴ� ����
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
		System.out.println(n + " �̻� " + m + " ������ �Ӹ������ ������ ���� " + answer + "���� �ֽ��ϴ�.");
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
