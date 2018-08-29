package quiz;

import java.util.Random;
// 사람수 , 키를 난수로 생성하여 최댓값 구하기

public class quiz1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("키의 최댓값을 구합니다.");
		int num = 1 + rand.nextInt(101); //난수를 생성하여 사람수 1 - 100명으로 범위 설정
		System.out.println("사람 수 : " + num + "명");

		int[] height = new int[num];

		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] :" + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
