public class no4 {
    public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.print(a + " "+ b +" "+c);
		for (int d = 0 ; d<=37; d++){
			d = a+b+c;
			a = b;
			b = c;
			c = d;
			System.out.print(" "+d);
		}
	}
}
