package abc;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("라면을 끓여보자");
		
		System.out.println("가스레인지 앞에 섰다.");
		System.out.println("냄비에 물을 넣는다");
		System.out.println("1. 불을 킨다.		2.귀찮으니까 그냥 잔다.");
		int ㄻ = sc.nextInt();
		
		
		if (ㄻ==1) {
			System.out.println("불을 켰다");
			System.out.println();
			System.out.println("물이 끓었다");
			System.out.println("1. 면과 스프를 넣는다		2. 걍 나중에 먹어야지~");
			int ㅁ = sc.nextInt();
			if (ㅁ==1) {
				System.out.println("면과 스프를 넣었다");
				System.out.println();
				System.out.println("2분 더 끓였다");
				System.out.println("라면 완성!");	
				System.out.println("라면을 맛있게 먹었다	^오^ =b");
			}else if (ㅁ==2) {
				System.out.println("전부 치운 뒤 라면은 다음에 먹기로 하였다");
			}else {
				System.out.println("선택지에 있는대로 골라!");
			}
		}else if (ㄻ==2) { 
			System.out.println("그냥 자러 갔다");	
		}else {
			System.out.println("선택지에 있는대로 골라");
		}
	}
}

