package a;

public class AAAAAAA {

	public static void main(String[] args) {
		
		int aa = 39;
		int aa1 = ++aa;
		System.out.println(aa1);
		
		aa=39;
		aa1=aa++;
		System.out.println(aa1);
		
		aa1=aa;
		System.out.println(aa1);

		System.out.println(true);
		
		System.out.println(!true);
		
		int a = 1_000_000;
		int b = 2_000_000;
		long c = a * b;
		System.out.println(c);
		
		c = (long)a * b;
		System.out.println(c);
		
	}

}
