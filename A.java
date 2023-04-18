package aa;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		if (num<18) {
			System.out.println(num+"은 18보다 작음ㅋ");
		}else if (num>18) {
			System.out.println(num+"은 18보다 큼");
		}else {
			System.out.println(num+"은 18이랑 같음");
		
		}

	}

}
