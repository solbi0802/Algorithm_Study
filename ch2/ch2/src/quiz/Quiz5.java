package quiz;
import java.util.Scanner;

public class Quiz5 {
	static void rcopy(int[] a, int[] b) {
		
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�迭 a�� ��ڼ� :");
		int na = stdIn.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("�迭 b�� ��ڼ� :");
		int nb = stdIn.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] :");
			b[i] = stdIn.nextInt();
		}
		
		rcopy(a,b);
	}
}
