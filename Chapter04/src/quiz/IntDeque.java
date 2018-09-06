package quiz;

// ����� ��⿭�� ���� 
public class IntDeque {
	private int max;	// ���� �뷮
	private int num;	// ������ ��
	private int front;	// �� ��
	private int rear;	// �� ��
	private int[] que;	// ���� ��ü
	
	// ���� �� ���� : ť�� �������
	public class EmptyIntqueueException extends RuntimeException {
		public EmptyIntqueueException() { }
	}
	
	// ���� �� ���� : ť�� ���� ��
	public class OverflowIntqueueException extends RuntimeException {
		public OverflowIntqueueException() { }
	}
	
	// ������
	public IntDeque(int capacity) {
		max = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// �����͸� front�� ��ť
	public int enqueFront(int x) throws OverflowIntqueueException {
		if (num >= max)
			throw new OverflowIntqueueException();	// ���� ���� ��
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}
	
	// �����͸� rear�� ��ť
	public int enqueRear(int x) throws OverflowIntqueueException {
		if (num >= max)
			throw new OverflowIntqueueException();	// ���� ���� ��
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	// front���� �����͸� ��ť
	public int dequeFront() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// ���� ��� ����
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}
	
	// rear���� �����͸� ��ť
	public int dequeRear() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// ���� ��� ����
		num--;
		if (--rear < 0)
			rear  = max - 1;
		return que[rear];
	}
	
	// ���� front���� �����͸� ��ũ
	public int peekFront() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// ���� ��� ����
		return que[front];
	}
	
	// ���� rear���� �����͸� ��ũ
	public int peekRear() throws EmptyIntqueueException {
		if (num <= 0)
			throw new EmptyIntqueueException();	// ���� ��� ����
		return que[rear == 0 ? max - 1 : rear -1];
	}
	// ������ x�� �˻��ؼ� index�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x)	//�˻� ����
				return i + front;
		return -1;	// �˻� ����
	}
	
	// ������ x�� �˻��ؼ� front���� ��� ° ����(��ã���� 0) ��ȯ
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x)	// �˻� ����
				return i + 1;
		return 0;	// �˻� ����
	}
	
	// ��(deck)�� ���
	public void clear() {
		num = front = rear = 0;
	}

	// ��(deck)�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ��(deck)�� ���� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ��(deck)�� ��� �ִ°�?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ��(deck)�� ���� á�°�?
	public boolean isFull() {
		return num >= max;
	}
	
	// �� ���� �����͸� front -> rear ���ʷ� ��Ÿ��
	public void dump() {
		if (num <= 0)
			System.out.println("���� ������ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}