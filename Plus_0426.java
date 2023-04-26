package asd;

import java.util.Scanner;

public class Plus_0426 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 0;
		int j = 0;
		while (true) {
			j++;
			i+=j;
			if (j==a) {
				break;
			}
		}
		System.out.println(i);
//		for (int b = 1;b<=a;b++ ) {
//			i+=b;
//		}
//			System.out.println(i);	
		
	}
}
