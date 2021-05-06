package lista1;
import java.util.*;
public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, r, s;
		double d;
		
		System.out.println("Valor A: ");
		a = in.nextInt();
		
		System.out.println("Valor B: ");
		b = in.nextInt();
		
		System.out.println("Valor C: ");
		c = in.nextInt();
		
		r = (int) Math.pow((a+b), 2);
		s = (int) Math.pow((b+c), 2);
		
		d = (r+s)/2;
		
		System.out.printf("O valor é: %2.2f",d);
		
		
	}

}
