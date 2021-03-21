package chap02;
// 1,000 이하의 소수를 열거 (버전2)

public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0; // 나눗셈 횟수
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열

		prime[ptr++] = 2;

		for (int n = 3; n <= 1000; n += 2) {
			int i;
			for (i = 1; i < ptr; i++) {
				counter++;
				if (n % prime[i] == 0)
					break;
			}
			if (ptr == i)
				prime[ptr++] = n;
		}

		for (int i = 0; i < ptr; i++)
			System.out.println(prime[i]);

		System.out.println("나눗셈을 수행한 횟수 :" + counter);
	}
}
