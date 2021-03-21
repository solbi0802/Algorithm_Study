package quiz;
// 연습문제 9
// 8퀸 문제를 비재귀적으로 구현

public class EightQueen2 {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8];
	
	// 각 열의 퀸의 위치를 출력
		static void print() {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++)
				System.out.printf("%s", j == pos[i] ? "■" : "□");
			System.out.println();
			}
			System.out.println();
		}
	
	// i열에 알맞은 위치에 퀸을 배치
	static void set(int i) {
		int j;
		int[] jstk = new int[8];
		Start: while (true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
						pos[i] = j;
						if (i == 7) // 모든 열에 배치 마침
							print();
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							jstk[i++] = j; // i 열의 행을 Push
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1)
					return;
				j = jstk[i]; // i 열의 행을 Pop
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
