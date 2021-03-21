package chap03;
// 제네릭 클래스의 예

public class GenericClassTester {
	static class GenericClass<T> {
		private T xyz;

		GenericClass(T t) { // 생성자
			this.xyz = t;
		}

		T getXyz() { // xyz를 반환합니다.
			return xyz;
		}
	}

	public static void main(String[] args) {
		// 다음과 같이 파라미터에 String을 넘길 수 도 있고 Integer를 넘길 수 도 있습니다.
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}
}
