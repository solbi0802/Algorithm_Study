package chap02;
// 1,000 ������ �Ҽ��� ���� (����2)

public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0; // ������ Ƚ��
		int ptr = 0; // ã�� �Ҽ��� ����
		int[] prime = new int[500]; // �Ҽ��� �����ϴ� �迭

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

		System.out.println("�������� ������ Ƚ�� :" + counter);
	}
}
