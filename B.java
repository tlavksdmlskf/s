package aa;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		if (a%2==0){
			System.out.println(a+"´Â Â¦¼ö¾ß");
		}else {
			System.out.println(a+"´Â È¦¼ö¾ß");
		}
	}

}
