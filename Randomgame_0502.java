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
			System.out.print("1부터 50 중에 한번 맞춰봐 : ");
			
			int b = sc.nextInt();
			
			if(a>b) {
				c++;
				System.out.println("up");
			}else if (a<b) {
				System.out.println("down");
			}else if (a==b){
				System.out.println("정답!");
				System.out.println(c+"번째 만에 맞췄구나!");
				break;
			}else {
				System.out.println("숫자를 입력해줘");
			}
		}
	}
}
