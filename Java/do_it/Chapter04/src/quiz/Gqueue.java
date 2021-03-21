package quiz;
// ������ ��ü�� �����͸� �׾� ���� �� �ִ� ���׸� ť Ŭ���� 

import quiz.IntAryQueue.OverflowQueException;

public class Gqueue<E> {
	private int max;	// ť�� �뷮
	private int num;	// ���� ������ ��
	private int front;	// ����Ʈ ��� Ŀ��
	private int rear;	// ���� ��� Ŀ��
	private E [] que;	// ť�� ��ü
	
	// ���� �� ���� : ť�� ��� ����
	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() { }
	}
	
	// ���� �� ���� : ť�� ���� ��
	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() { }
	}
	
	// ������
	public Gqueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[])new Object[max];		// ť ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) {		// ������ �� ����
			max = 0;
		}
	}
	
	// ť�� �����͸� ��ť
	public E enque(E x) throws OverflowQueException {
		if (num >= max)
			throw new OverflowGqueueException();	// ť�� ���� ��
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}
	
	// ť�� �����͸� ��ť
	public E deque() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();	// ť�� ��� ����
		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}
	
	// ť���� �����͸� ��ũ
	public E peek() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();	// ť�� ��� ����
		return que[front];
	}
	
	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexof(E x) {
		for (int i = 0; i < num; i++) 
			if (que[(i + front) % max] == x)	// �˻� ����
				return i + front;	
		return -1;			  				   // �˻� ����
	}
	
	// ť���� x�� �˻��Ͽ� �Ӹ����� �� �� °�ΰ�(ã�� ���ϸ� -1)�� ��ȯ
	public int search(E x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max].equals(x))   // �˻� ����
		        return i + 1;
		return -1;                            	 // �˻� ����
	}
	// ť�� ���
	public void clear() {
		num = front = rear = 0;
	}
	
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}
	
	// ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}
	
	// ť ���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		if (num <= 0) 
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.println(que[ (i + front) % max].toString() + " ");
			System.out.println();
		}
	}
}