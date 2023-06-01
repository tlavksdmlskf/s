package asdf;

import java.util.Random;
import java.util.Scanner;

public class ASDF_0601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("가로?");
		int rows = sc.nextInt();
		
		System.out.println("세로");
		int cols = sc.nextInt();
		
		int a[] = new int[rows * cols];
		
		for (int i = 0 ; i < a.length ; i++) {
			a[i] = rd.nextInt(rows * cols)+1;
			for (int j = 0 ; j < i ; j++) {
				if (a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 1 ; i <= a.length ; i++) {
			System.out.print(a[i-1]+"  ");
			if (a[i-1]<10) {
				System.out.print(" ");
			}
			if (i%rows==0) {
				System.out.println();
			}	
		}
	}
}
