package chap05;
// �� ��, ���� 1���� ���� ��ġ�ϴ� ������ ��������� �����մϴ�.

public class QueenBB {
	static boolean[] flag = new boolean[8];			//�� �࿡ ���� ��ġ�ߴ��� üũ
	static int[] pos = new int[8];							// �� ���� ���� ��ġ
	
	// �� ���� ���� ��ġ�� ����մϴ�.
	static void print() {
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}
	
	// i���� �˸��� ��ġ�� ���� ��ġ�մϴ�.
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag[j] == false) {			// j�࿡�� ���� ���� ��ġ���� �ʾҴٸ�
				pos[i] = j;						// ���� j�࿡ ��ġ�մϴ�.
				if (i == 7)						// ��� ���� ��ġ�� ���
					print();
				else {
					flag[j] = true;
					set ( i + 1);
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
