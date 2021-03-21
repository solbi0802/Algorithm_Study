package quiz;

import java.util.Scanner;

public class Quiz1 {
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	static int seqSearchSen(int[] a, int n, int key) {
		int i;

		a[n] = key; // ���ʸ� �߰�

		for (i = 0; a[i] != key; i++)
			;
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ� :");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // ��ڼ� num + 1

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}

		System.out.print("�˻��� �� : "); // Ű ���� �Է�
		int ky = stdIn.nextInt();

		int idx = seqSearchSen(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
