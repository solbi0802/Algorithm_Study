package quiz;

import java.util.Scanner;

import quiz.IntStack.EmptyIntStackException;
import quiz.IntStack.OverflowIntStackException;
//int ����

public class Quiz1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(30);

		while (true) {
			System.out.println("���� ������ �� :" + s.size() + " / " + s.capacity());
			System.out.print(
					"(1)Ǫ��	 (2)��   (3)��ũ	" + "(4)����  (5)���� (6)�ε���	" + "(7)������ �������	(8)������ ���� á����  (0)����: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // Ǫ��
				System.out.print("������ :");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2: // ��
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;

			case 4: // ����
				s.dump();
				break;

			case 5: // ����
				s.clear();
				System.out.println("�����Ͱ� ��� �����Ǿ����ϴ�.");
				break;

			case 6:
				System.out.print("ã�� �� :");
				int y = stdIn.nextInt();
				System.out.println(y + " �� " + s.indexOf(y) + "�� �ֽ��ϴ�.");
				break;

			case 7: // ������ �������
				boolean emp = s.isEmpty();
				if (emp == true)
					System.out.println("������ ��� �ֽ��ϴ�.");
				else
					System.out.println("������ ������� �ʽ��ϴ�.");
				break;

			case 8: // ������ ����á����
				boolean full = s.isFull();
				if (full == true)
					System.out.println("������ ���� á���ϴ�.");
				else
					System.out.println("������ ���� ������ �ʽ��ϴ�.");
				break;
			}
		}
	}
}

class IntStack {
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
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) // ���� �ʿ��� ���� �˻�
			if (stk[i] == x)
				return i; // �˻� ����
		return -1; // �˻� ����
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
