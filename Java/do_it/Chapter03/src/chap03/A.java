package chap03;
// �ڿ������� ������ �Ϸ��� ������ ���� ������� Ŭ������ �����մϴ�.

public class A implements Comparable<A> {
	
	// �ʵ� , �޼��� ��
	
	public int compareTo(A c) {
		//this�� c���� ũ�� ���� �� ��ȯ
		//this�� c���� ������ ���� �� ��ȯ
		//this�� c�� ������ 0 ��ȯ
		return 0;
	}
	
	public boolean equals(Object c) {
		//this�� c�� ������ true ��ȯ
		//this�� c�� ���� ������ false ��ȯ
		return false;
	}
}
