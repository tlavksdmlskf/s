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
				System.out.println("����");
				break;
			}if(d==b||d==c&&e==a||e==c&&f==a||f==b) {
				System.out.println("3 ��");
			}if(d==b||d==c||e==a||e==c||f==a||f==b) {
				if(a==d||b==e||c==f) {
					System.out.println("1 ��Ʈ����ũ 1��");
				}else {
					System.out.println("1 ��");					
				}
			}if(d==b&&d==c||e==a&&e==c||f==a&&f==b) {
				if(a==d||b==e||c==f) {
					System.out.println("1 ��Ʈ����ũ 2��");
				}else {
					System.out.println("2 ��");					
				}
			}if(a==d&&b==e||a==d&&c==f||b==e||c==f) {
				System.out.println("2 ��Ʈ����ũ");
			}if(a==d||b==e||c==f) {
				System.out.println("1 ��Ʈ����ũ");
			}
		}
		//		for()
//			a = sc.nextInt();
//			b = sc.nextInt();
//			c = sc.nextInt();

		
		
	}
}
