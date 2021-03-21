package chap03;
import java.util.Arrays;
import java.util.Scanner;
// ���ڿ��� �迭 (Java�� Ű����)���� �˻�

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// Java���� ����ϴ� Ű�����Դϴ�.
		String[] x = {
			"abstract",		"assert",		"boolean",		"break",		"byte",
			"case",			"catch",		"char",			"class",		"const",
			"continue",		"default",		"do",			"double",		"else",
			"enum",			"extends",		"final",		"finally",		"float",
			"for",			"goto",			"if",			"implements",	"import",
			"instanceof",	"int",			"interface",	"long",			"native",
			"new",			"package",		"private",		"protected",	"public",
			"return",		"short",		"static",		"strictfp",		"super",
			"switch",		"synchronized",	"this",			"throw",		"throws",
			"transient",	"try",			"void",			"volatile",		"while"
		};
		
		System.out.print("���ϴ� Ű���带 �Է��ϼ��� : "); 		// Ű ���� �Է�
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		else
			System.out.println("�ش� Ű����� x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
