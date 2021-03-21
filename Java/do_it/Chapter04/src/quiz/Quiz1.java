package quiz;

import java.util.Scanner;

import quiz.IntStack.EmptyIntStackException;
import quiz.IntStack.OverflowIntStackException;
//int 스택

public class Quiz1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(30);

		while (true) {
			System.out.println("현재 데이터 수 :" + s.size() + " / " + s.capacity());
			System.out.print(
					"(1)푸시	 (2)팝   (3)피크	" + "(4)덤프  (5)삭제 (6)인덱스	" + "(7)스택이 비었는지	(8)스택이 가득 찼는지  (0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터 :");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;

			case 5: // 삭제
				s.clear();
				System.out.println("데이터가 모두 삭제되었습니다.");
				break;

			case 6:
				System.out.print("찾는 값 :");
				int y = stdIn.nextInt();
				System.out.println(y + " 는 " + s.indexOf(y) + "에 있습니다.");
				break;

			case 7: // 스택이 비었는지
				boolean emp = s.isEmpty();
				if (emp == true)
					System.out.println("스택이 비어 있습니다.");
				else
					System.out.println("스택이 비어있지 않습니다.");
				break;

			case 8: // 스택이 가득찼는지
				boolean full = s.isFull();
				if (full == true)
					System.out.println("스택이 가득 찼습니다.");
				else
					System.out.println("스택이 가득 차있지 않습니다.");
				break;
			}
		}
	}
}

class IntStack {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체

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
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}

	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) // 스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) // 정상 쪽에서 선형 검색
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
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
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
