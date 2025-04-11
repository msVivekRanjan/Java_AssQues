public class A5_Q7 {
    public static void main(String[] args) {
        int n = 5;
        
		// Pattern (a)
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				char bit = (char) (64+j);
				System.out.print(bit + " ");
			}
			System.out.println();
		}
		
		// Pattern (b)
        System.out.println();

		for (int i=n; i>=1; i--) {
			for (int j=1; j<=i; j++) System.out.print("$ ");
			System.out.println();
		}
		
		// Pattern (c)
        System.out.println();

		for (int i=1; i<=n; i++) {
			for (int j=n; j>i; j--) System.out.print(" ");
			for (int k=1; k<=i; k++) System.out.print(i);
			System.out.println();
		}

    }
}
