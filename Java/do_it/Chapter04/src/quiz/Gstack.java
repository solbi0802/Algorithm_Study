package quiz;
// 문제2

// 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 작성

public class Gstack<E> {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private E[] stk; // 스택 본체

	public static class EmptyStackException extends RuntimeException {
		public EmptyStackException() {

		}
	}

	public static class OverflowStackException extends RuntimeException {
		public OverflowStackException() {

		}
	}

	// 생성자
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	// 스택에 x를 푸시
	public E push(E x) throws OverflowStackException {
		if (ptr >= max) // 스택이 가득 참
			throw new OverflowStackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public E pop() throws EmptyStackException {
		if (ptr <= 0)
			throw new EmptyStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public E peek() throws EmptyStackException {
		if (ptr <= 0)
			throw new EmptyStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i].equals(x))
				return i;
		return -1;
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else 
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
		System.out.println();
	}
}