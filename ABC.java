package abc;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� ��������");
		
		System.out.println("���������� �տ� ����.");
		System.out.println("���� ���� �ִ´�");
		System.out.println("1. ���� Ų��.		2.�������ϱ� �׳� �ܴ�.");
		int �� = sc.nextInt();
		
		
		if (��==1) {
			System.out.println("���� �״�");
			System.out.println();
			System.out.println("���� ������");
			System.out.println("1. ��� ������ �ִ´�		2. �� ���߿� �Ծ����~");
			int �� = sc.nextInt();
			if (��==1) {
				System.out.println("��� ������ �־���");
				System.out.println();
				System.out.println("2�� �� ������");
				System.out.println("��� �ϼ�!");	
				System.out.println("����� ���ְ� �Ծ���	^��^ =b");
			}else if (��==2) {
				System.out.println("���� ġ�� �� ����� ������ �Ա�� �Ͽ���");
			}else {
				System.out.println("�������� �ִ´�� ���!");
			}
		}else if (��==2) { 
			System.out.println("�׳� �ڷ� ����");	
		}else {
			System.out.println("�������� �ִ´�� ���");
		}
	}
}

