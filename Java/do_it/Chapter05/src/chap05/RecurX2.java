package chap05;

public class RecurX2 {
	// ���� ��͸� �����߽��ϴ�.
	static void recur(int n) {
		IntStack s = new IntStack(n);

		while (true) {
			if (n > 0) {
				s.push(n); // n�� ���� Ǫ��
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) { // ������ ��� ���� �ʴٸ�
				n = s.pop(); // �����ϰ� �ִ� ������ ���� ��
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
}
