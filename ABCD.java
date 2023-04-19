package abc;

import java.util.Scanner;

public class ABCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력해봐");
		int a = sc.nextInt();
		
		System.out.println("한 번 더");
		int b = sc.nextInt();
		
		System.out.println("+, -, /, * 중에 하나 골라봐");
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
			System.out.println("처음으로");
			break;
		 }
		
		
	}
}
