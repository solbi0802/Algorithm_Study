package quiz;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
// �÷¿� ���� �������� ������ ��ü�˻� �����Ϳ��� Ư�� �÷��� ���� ����� �˻��ϴ� ���α׷�

public class Quiz7 {
	static class PhyscData {
		private String name;		// �̸�
		private int height;			// Ű
		private double vision;		// �÷�
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		// ���ڿ��� ��ȯ�ϴ� �޼���(���� Ȯ�ο�)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// ������������ �����ϱ� ���� comparator
		public static final Comparator<PhyscData> VISION_ORDER 
		= new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision > d2.vision) ? 1 : 
					   (d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
			new PhyscData("�̳���", 162, 0.3),
			new PhyscData("������", 168, 0.4),
			new PhyscData("���Ѱ�", 169, 0.8),
			new PhyscData("ȫ�ر�", 171, 1.5),
			new PhyscData("������", 173, 0.7),
			new PhyscData("��ȣ��", 174, 1.2),
			new PhyscData("�̼���", 175, 2.0),
		};
		System.out.print("�÷��� ���� ����� ã�� �ֳ���? :");
		double vision = stdIn.nextDouble();			// �÷� �� �Է�
		int idx = Arrays.binarySearch(
				x,								// �迭 x����
				new PhyscData("", 0, vision),	// �÷� vision�� ��Ҹ�
				PhyscData.VISION_ORDER 			// VISION_ORDER �� ���� �˻�
				);
		
		if (idx < 0) 
			System.out.println("��Ұ� �����ϴ�.");
		else {
			System.out.println("x["+ idx + "]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ :" + x[idx]);
		}
	}
}
