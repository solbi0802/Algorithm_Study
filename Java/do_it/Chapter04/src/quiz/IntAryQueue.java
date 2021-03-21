package quiz;
// ����4

// ť�� �����ϴ� ���α׷�

public class IntAryQueue {
	private int max; // ť �뷮
	private int num; // ���� ������ ��
	private int[] que; // ť ��ü

	// ���� �� ���� : ť�� �������
	public class EmptyQueException extends RuntimeException {
		public EmptyQueException() {

		}
	}

	// ���� �� ���� : ť�� ���� ��
	public class OverflowQueException extends RuntimeException {
		public OverflowQueException() {

		}
	}

	// ������
	public IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}

	// ť���� �����͸� ��ť
	public int enqueue(int x) throws OverflowQueException {
		if (num >= max) // ť�� ���� ��
			throw new OverflowQueException();
		que[num++] = x;
		return x;
	}

	// ť���� �����͸� ��ť
	public int dequeue() throws EmptyQueException {
		if (num <= 0)
			throw new EmptyQueException();
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;

		return x;
	}

	// ť���� �����͸� ��ũ
	public int peek() throws EmptyQueException {
		if (num <= 0)
			throw new EmptyQueException();
		return que[num - 1];
	}

	// ť���� x�� ã�� �ε����� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i <= num; i--)
			if (que[i] == x)
				return i;
		return -1;
	}

	// ť�� ���
	public void clear() {
		num = 0;
	}

	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ť�� ��� �ִ°�?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ť�� ���� á�°�?
	public boolean isFull() {
		return num >= max;
	}

	// ť ���� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
