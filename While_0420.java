package as;

public class While_0420 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		while (a<=10) {
			while (b<=10) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
			b=1;
		}	

	}

}
