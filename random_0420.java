package as;

import java.util.Random;

public class random_0420 {
	public static void main(String[] args) {
		int b = 0;
		while (true) {
			int a = (int)(Math.random()*100);
			System.out.println(a);
			if (a==39) {
				b++;
				if (b==39) {
					break;
				}
			}	
		}
	}	
}
