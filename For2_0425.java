package java_class;

import java.util.Scanner;

public class For2_0425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �߿� ����� �غ���? : ");
		int s_num = sc.nextInt();
		System.out.print("����� �ұ�? : ");
//		for (int i=1;i<10;i++) {
//			System.out.println(s_num+"��"+i+"="+(i*s_num));
//		}
		int a = sc.nextInt();
		for (int l=1;l<=a;l++) {
			System.out.println(s_num+"��"+l+"="+(l*s_num));
		}
	}
}
