package quiz;
// ����2

// ������ ��ü�� �����͸� ���� �� �ִ� ���׸� ���� Ŭ���� �ۼ�

public class Gstack<E> {
	private int max; // ���� �뷮
	private int ptr; // ���� ������
	private E[] stk; // ���� ��ü

	public static class EmptyStackException extends RuntimeException {
		public EmptyStackException() {

		}
	}

	public static class OverflowStackException extends RuntimeException {
		public OverflowStackException() {

		}
	}

	// ������
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}

	// ���ÿ� x�� Ǫ��
	public E push(E x) throws OverflowStackException {
		if (ptr >= max) // ������ ���� ��
			throw new OverflowStackException();
		return stk[ptr++] = x;
	}

	// ���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public E pop() throws EmptyStackException {
		if (ptr <= 0)
			throw new EmptyStackException();
		return stk[--ptr];
	}

	// ���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
	public E peek() throws EmptyStackException {
		if (ptr <= 0)
			throw new EmptyStackException();
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i].equals(x))
				return i;
		return -1;
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
		else 
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
		System.out.println();
	}
}