package chap01;
//3개의 정숫갑 가운데 최댓값을 구하여 출력

public class Max3m {
	// a, b, c의 최댓값을 구하여 반환
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}
	
	public static void main(String args[]) {
		System.out.println("max(3,2,1) = " + max3(3, 2, 1));
		System.out.println("max(3,2,2) = " + max3(3, 2, 2));
		System.out.println("max(3,1,2) = " + max3(3, 1, 2));
		System.out.println("max(3,2,3) = " + max3(3, 2, 3));
		System.out.println("max(2,1,3) = " + max3(2, 1, 3));
		System.out.println("max(3,3,2) = " + max3(3, 3, 2));
		System.out.println("max(3,3,3) = " + max3(3, 3, 3));
		System.out.println("max(2,2,3) = " + max3(2, 2, 3));
		System.out.println("max(2,3,1) = " + max3(2, 3, 1));
		System.out.println("max(2,3,2) = " + max3(2, 3, 2));
		System.out.println("max(1,3,2) = " + max3(1, 3, 2));
		System.out.println("max(2,3,3) = " + max3(2, 3, 3));
		System.out.println("max(1,2,3) = " + max3(1, 2, 3));
	}
}
