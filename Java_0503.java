package ABC;

import java.util.Scanner;

public class Java_0503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 정해봐 : ");
		int b = sc.nextInt();
		int[] a = new int [b];
		
		for (int i = 0; i<a.length; i++) {
			System.out.print("원하는 값을 입력해줘 : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("정렬 전 : ");
		for (int i = 0; i<a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		int d = 0;
		int c = 0;
		for (int i = 0 ; i<a.length;i++) {
			c=i;
			for (int j = i+1 ; j<a.length ; j++) {
				if (a[c]>a[j]) {
					c=j;
				}
				
			}
			d = a[i];
			a[i] = a[c];
			a[c] = d;
		}
		System.out.print("정렬 후 : ");
		for (int j = 0 ; j<a.length ; j++) {
			System.out.print(" "+a[j]);
		}
	}
}
