package lista1;
import java.util.*;

public class ex7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite A: ");
		a = in.nextDouble();
		
		System.out.println("Digite B: ");
		b = in.nextDouble();
		
		System.out.println("Digite C: ");
		c = in.nextDouble();
		
		System.out.println("Digite D: ");
		d = in.nextDouble();
		
		System.out.println("Digite E: ");
		e = in.nextDouble();
		
		System.out.println("Digite F: ");
		f = in.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("x = %2.2f",x);
		System.out.printf(" y = %2.2f",y);
		
	}

}
