package ASDF;

import java.util.Random;
import java.util.Scanner;

public class Tntwkdirn {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int a =0;
		int b =0;		
		int c =0;
		int d = rd.nextInt(9)+1;
		int e = rd.nextInt(9)+1;
		int f = rd.nextInt(9)+1;
		while(true) {
			if (d==e||d==f) {
				d = rd.nextInt(9)+1;
			}else if (e==f) {
				e = rd.nextInt(9)+1;
			}else {
				break;
			}
		}
		while (true) {
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if (a==d&&b==e&&c==f) {
				System.out.println("삼진");
				break;
			}if(d==b||d==c&&e==a||e==c&&f==a||f==b) {
				System.out.println("3 볼");
			}if(d==b||d==c||e==a||e==c||f==a||f==b) {
				if(a==d||b==e||c==f) {
					System.out.println("1 스트라이크 1볼");
				}else {
					System.out.println("1 볼");					
				}
			}if(d==b&&d==c||e==a&&e==c||f==a&&f==b) {
				if(a==d||b==e||c==f) {
					System.out.println("1 스트라이크 2볼");
				}else {
					System.out.println("2 볼");					
				}
			}if(a==d&&b==e||a==d&&c==f||b==e||c==f) {
				System.out.println("2 스트라이크");
			}if(a==d||b==e||c==f) {
				System.out.println("1 스트라이크");
			}
		}
		//		for()
//			a = sc.nextInt();
//			b = sc.nextInt();
//			c = sc.nextInt();

		
		
	}
}
