package quiz;

// 양방향 대기열을 구현 
public class IntDeque {
	private int max;	// 덱의 용량
	private int num;	// 데이터 수
	private int front;	// 맨 앞
	private int rear;	// 맨 뒤
	private int[] que;	// 덱의 본체
	
	// 실행 시 예외 : 큐가 비어있음
	public class EmptyIntqueueException extends RuntimeException {
		public EmptyIntqueueException() { }
	}
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntqueueException extends RuntimeException {
		public OverflowIntqueueException() { }
	}
	
	// 생성자
	public IntDeque(int capacity) {
		max = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 데이터를 front에 인큐
	public int enqueFront(int x) throws OverflowIntqueueException {
		if (num >= max)
			throw new OverflowIntqueueException();	// 덱이 가득 참
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}
	
	// 데이터를 rear에 인큐
	public int enqueRear(int x) throws OverflowIntqueueException {
		if (num >= max)
			throw new OverflowIntqueueException();	// 덱이 가득 참
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	// front부터 데이터를 디큐
	public int dequeFront() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// 덱이 비어 있음
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}
	
	// rear부터 데이터를 디큐
	public int dequeRear() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// 덱이 비어 있음
		num--;
		if (--rear < 0)
			rear  = max - 1;
		return que[rear];
	}
	
	// 덱의 front부터 데이터를 피크
	public int peekFront() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// 덱이 비어 있음
		return que[front];
	}
	
	// 덱의 rear부터 데이터를 피크
	public int peekRear() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// 덱이 비어 있음
		return que[rear == 0 ? max - 1 : rear -1];
	}
	// 덱에서 x를 검색해서 index를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x)	//검색 성공
				return i + front;
		return -1;	// 검색 실패
	}
	
	// 덱에서 x를 검색해서 front에서 몇번 째 인지(못찾으면 0) 반환
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x)	// 검색 성공
				return i + 1;
		return 0;	// 검색 실패
	}
	
	// 덱(deck)을 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 덱(deck)의 용량을 반환
	public int capacity() {
		return max;
	}

	// 덱(deck)에 쌓인 데이터 수를 반환
	public int size() {
		return num;
	}

	// 덱(deck)이 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 덱(deck)이 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}
	
	// 덱 내의 데이터를 front -> rear 차례로 나타냄
	public void dump() {
		if (num <= 0)
			System.out.println("덱이 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}