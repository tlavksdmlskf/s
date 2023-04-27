package a;

import java.util.Scanner;

public class tkclrdustks_0427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		while (true) {
			System.out.println("------------------------");
			System.out.println("1. 계산기 실행, 2. 종료");
			System.out.println("------------------------");
			a = sc.nextInt();
			if (a==1) {
				System.out.println("------------------------");
				System.out.println("숫자를 입력하시오.");
				System.out.println("------------------------");
				c=sc.nextInt();
				System.out.println("------------------------");
				System.out.println("숫자를 입력하시오.");
				System.out.println("------------------------");
				b=sc.nextInt();
				System.out.println("------------------------");
				System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기");
				System.out.println("------------------------");
				a = sc.nextInt();
				System.out.println("------------------------");
				if (a==1) {
					System.out.println(b+" + "+c+" = "+(b+c));
					continue;
				}else if (a==2) {
					System.out.println(b+" - "+c+" = "+(b-c));
					continue;
				}else if (a==3) {
					System.out.println(b+" * "+c+" = "+(b*c));
					continue;
				}else if (a==4) {
					System.out.println(b+" / "+c+" = "+(float)(b/c));
					continue;
				}else {
					System.out.println("다시 입력해주십시오.");
				}
			}else if (a==2) {
				break;
			}else {
				System.out.println("다시 입력해주십시오.");
			}
		}
	}
}
