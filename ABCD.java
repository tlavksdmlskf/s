package abc;

import java.util.Scanner;

public class ABCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��غ�");
		int a = sc.nextInt();
		
		System.out.println("�� �� ��");
		int b = sc.nextInt();
		
		System.out.println("+, -, /, * �߿� �ϳ� ����");
		String c = sc.next();
		 switch (c) {
		 case "+" :
			 System.out.println("a+b="+(a+b));
			 break;
		 case "-" :
			 System.out.println("a-b="+(a-b));
			 break;
		 case "/":
			 System.out.println("a/b="+(a/b));
			 break;
		 case "*":
			 System.out.println("a*b="+(a*b));
			 break;
		default:
			System.out.println("ó������");
			break;
		 }
		
		
	}
}
