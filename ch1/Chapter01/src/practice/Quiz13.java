package practice;
// 위쪽과 왼쪽을 더하는 덧셈 출력

public class Quiz13 {
	public static void main(String[] args) {
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+--------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d| ", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);
			System.out.println();
		}
	}
}
