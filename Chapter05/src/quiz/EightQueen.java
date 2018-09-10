package quiz;
// �������� 8
//8�� ����

public class EightQueen {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8];
	
	// �� ���� ���� ��ġ�� ���
	static void print() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++)
			System.out.printf("%s", j == pos[i] ? "��" : "��");
		System.out.println();
		}
		System.out.println();
	}
	
	// i���� �˸��� ��ġ�� ���� ��ġ 
		static void set(int i) {
			for (int j = 0; j < 8; j++) {
				if (flag_a[j] == false &&			  		// ����(j��)�� ���� ��ġ���� �ʾҽ��ϴ�.
					 flag_b[i + j] == false &&		  		// �밢�� ���� ���� ��ġ���� �ʾҽ��ϴ�.
					 flag_c[i - j + 7] == false) {  			// �밢�� ���� ���� ��ġ���� �ʾҽ��ϴ�.
					pos[i] = j;									// ���� j�࿡ ��ġ�մϴ�.
					if (i == 7)									// ��� ���� ��ġ�Ѵٸ�
						print();
					else {
						flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
						set(i + 1);
						flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
					}
				}
			}
		}
	
	public static void main(String[] args) {
		set(0);
	}
}
