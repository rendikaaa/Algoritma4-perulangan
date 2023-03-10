public class no3 {
    public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a + " "+ b );
		for (int c = 0 ; c<=13; c++){
			c = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
		}
	}
}

