package quiz;

//하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스 만들기
public class Quiz3 {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;

	public enum AorB {
		StackA, StackB;
	};

	// 실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// 생성자
	public Quiz3(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int push(AorB ab, int x) throws OverflowIntStackException {
		if (ptrA >= ptrB + 1) // 스택이 가득 참
			throw new OverflowIntStackException();
		switch (ab) {
		case StackA:
			stk[ptrA++] = x;
			break;
		case StackB:
			stk[ptrB--] = x;
			break;
		}
		return x;
	}

	public int pop(AorB ab) throws EmptyIntStackException {
		int x = 0;
		switch (ab) {
		case StackA:
			if (ptrA <= 0)
				throw new EmptyIntStackException();
			x = stk[--ptrA];
			break;
		case StackB:
			if (ptrB >= max - 1)
				throw new OverflowIntStackException();
			x = stk[++ptrB];
			break;
		}
		return x;
	}

	public int peek(AorB ab) throws EmptyIntStackException {
		int x = 0;
		switch (ab) {
		case StackA:
			if (ptrA <= 0)
				throw new EmptyIntStackException();
			x = stk[ptrA - 1];
			break;
		case StackB:
			if (ptrB >= max - 1)
				throw new OverflowIntStackException();
			x = stk[ptrB + 1];
		}
		return x;
	}

	public int indexOf(AorB ab, int x) {
		switch (ab) {
		case StackA:
			for (int i = ptrA - 1; i >= 0; i--)
				if (stk[i] == x)
					return i;
			break;
		case StackB:
			for (int i = ptrB + 1; i < max; i++)
				if (stk[i] == x)
					return i;
			break;
		}
		return -1;
	}

	public void clear(AorB ab) {
		switch (ab) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max - 1;
			break;
		}
	}

	public int capacity() {
		return max;
	}

	public int size(AorB ab) {
		switch (ab) {
		case StackA:
			return ptrA;
		case StackB:
			return max - ptrB - 1;
		}
		return 0;
	}

	public boolean isEmpty(AorB ab) {
		switch (ab) {
		case StackA:
			return ptrA <= 0;
		case StackB:
			return ptrB >= max - 1;
		}
		return true;
	}

	public boolean isFull() {
		return ptrA >= ptrB + 1;
	}

	public void dump(AorB ab) {
		switch (ab) {
		case StackA:
			if (ptrA <= 0)
				System.out.println("스택이 비어 있습니다.");
			else {
				for (int i = 0; i < ptrA; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		case StackB:
			if (ptrB >= max - 1)
				System.out.println("스택이 비었습니다.");
			else {
				for (int i = max - 1; i > ptrB; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}
}