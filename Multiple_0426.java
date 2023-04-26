package asd;

import java.util.Scanner;

public class Multiple_0426 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int j = 0;
		for (int i = 1 ;i <= a ;i++) {
			if (i%2==0||i%3==0) {
				continue;
			}
			j+=i;
		}
		System.out.println(j);
	}

}
