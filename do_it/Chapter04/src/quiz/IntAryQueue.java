package quiz;
// 문제4

// 큐를 구현하는 프로그램

public class IntAryQueue {
	private int max; // 큐 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	// 실행 시 예외 : 큐가 비어있음
	public class EmptyQueException extends RuntimeException {
		public EmptyQueException() {

		}
	}

	// 실행 시 예외 : 큐가 가득 참
	public class OverflowQueException extends RuntimeException {
		public OverflowQueException() {

		}
	}

	// 생성자
	public IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	// 큐에서 데이터를 인큐
	public int enqueue(int x) throws OverflowQueException {
		if (num >= max) // 큐가 가득 참
			throw new OverflowQueException();
		que[num++] = x;
		return x;
	}

	// 큐에서 데이터를 디큐
	public int dequeue() throws EmptyQueException {
		if (num <= 0)
			throw new EmptyQueException();
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;

		return x;
	}

	// 큐에서 데이터를 피크
	public int peek() throws EmptyQueException {
		if (num <= 0)
			throw new EmptyQueException();
		return que[num - 1];
	}

	// 큐에서 x를 찾아 인덱스를 반환
	public int indexOf(int x) {
		for (int i = 0; i <= num; i--)
			if (que[i] == x)
				return i;
		return -1;
	}

	// 큐를 비움
	public void clear() {
		num = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
