package a;

import java.util.Scanner;

public class tkclrdustks_0427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		while (true) {
			System.out.println("------------------------");
			System.out.println("1. ���� ����, 2. ����");
			System.out.println("------------------------");
			a = sc.nextInt();
			if (a==1) {
				System.out.println("------------------------");
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				System.out.println("------------------------");
				c=sc.nextInt();
				System.out.println("------------------------");
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				System.out.println("------------------------");
				b=sc.nextInt();
				System.out.println("------------------------");
				System.out.println("1. ���ϱ�, 2. ����, 3. ���ϱ�, 4. ������");
				System.out.println("------------------------");
				a = sc.nextInt();
				System.out.println("------------------------");
				if (a==1) {
					System.out.println(b+" + "+c+" = "+(b+c));
					continue;
				}else if (a==2) {
					System.out.println(b+" - "+c+" = "+(b-c));
					continue;
				}else if (a==3) {
					System.out.println(b+" * "+c+" = "+(b*c));
					continue;
				}else if (a==4) {
					System.out.println(b+" / "+c+" = "+(float)(b/c));
					continue;
				}else {
					System.out.println("�ٽ� �Է����ֽʽÿ�.");
				}
			}else if (a==2) {
				break;
			}else {
				System.out.println("�ٽ� �Է����ֽʽÿ�.");
			}
		}
	}
}
