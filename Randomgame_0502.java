package abc;

import java.util.Random;
import java.util.Scanner;

public class Randomgame_0502 {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		Random rd = new Random();
		
		int a = rd.nextInt(49)+1;
		
		int c = 1;
		
		while (true) {
			System.out.print("1���� 50 �߿� �ѹ� ����� : ");
			
			int b = sc.nextInt();
			
			if(a>b) {
				c++;
				System.out.println("up");
			}else if (a<b) {
				System.out.println("down");
			}else if (a==b){
				System.out.println("����!");
				System.out.println(c+"��° ���� ���豸��!");
				break;
			}else {
				System.out.println("���ڸ� �Է�����");
			}
		}
	}
}
