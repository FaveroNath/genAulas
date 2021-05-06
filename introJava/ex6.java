package lista1;
import java.util.*;
public class ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1, y1, x2, y2, d;
		
		System.out.println("Digite a primeira coordenada: ");
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		
		System.out.println("Digite a primeira coordenada: ");
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		System.out.printf("A distãncia entre os pontos é: %2.2f",d);
		
		
	}

}
