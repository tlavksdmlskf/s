package asd;

import java.util.Scanner;

public class Num_slice_0426 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		while (a>0) {
//			System.out.println(a%10);
//			a/=10;
		for (;a>0;a/=10) {
			System.out.println(a%10);
		}
		

	}

}
