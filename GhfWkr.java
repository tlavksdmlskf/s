package ASDF;

import java.util.Scanner;

public class GhfWkr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = 0;
		int w = 0;
		
		int a = sc.nextInt();
		
		for (int i = 1; a>=i;i++) {
			if (i%2==0) {
				g+=i;
			}else {
				w+=i;
			}
		}
		System.out.println(g);
		System.out.println(w);
		

	}

}
