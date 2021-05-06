package lista1;
import java.util.*;
public class ex8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cFab, cCons;
		
		System.out.println("Digite o custo de fábrica: ");
		cFab = in.nextDouble();
		
		cCons = (cFab)*1.73;
		
		System.out.printf("Custo consumidor: %2.2f",cCons);

	}

}
