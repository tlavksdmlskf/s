package abc;

import java.util.Scanner;

public class Array_0502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for (int i = 0;i<5;i++) {
			System.out.print("값을 입력해주세요.");
			a[i] = sc.nextInt();		
		}
		for (int j = 0;j<5;j++) {
			System.out.println(a[j]);
		}
	}
}
