public class A5_Q6 {
    public static void main(String[] args) {

        // Pattern (a)
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) System.out.print("* ");
			System.out.println();
		}
		
		// Pattern (b)
        System.out.println();

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) System.out.print(i+"  ");
			System.out.println();
		}
		
		// Pattern (c)
        System.out.println();

		int count = 1;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(count+"  ");
				count++;
			}
			System.out.println();
		}
		
		// Pattern (d)
        System.out.println();

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) System.out.print(j+"  ");
			System.out.println();
		}
		
    }
}
