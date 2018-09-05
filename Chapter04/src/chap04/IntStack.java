package chap04;
// int�� ����

public class IntStack {
	private int max; // ���� �뷮
	private int ptr; // ���� ������
	private int[] stk; // ���� ��ü

	// ���� �� ���� : ������ �������
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// ���� �� ���� : ������ ���� ��
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// ������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}

	// ���ÿ� x�� Ǫ��
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) // ������ ���� ��
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	// ���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	// ���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr -1];
	}
	
	// ���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = ptr -1; i >= 0; i--)	//���� �ʿ��� ���� �˻�
			if (stk[i] == x)
				return i;	// �˻� ����
			return -1;		// �˻� ����
	}
	
	// ������ ���
	public void clear() {
		ptr = 0;
	}
	
	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// ���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}
	
	// ������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// ������ ���� á�°�?
	public boolean isFull() {
		return ptr >= max;
	}
	
	// ���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}