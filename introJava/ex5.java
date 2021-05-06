package lista1;
import java.util.*;
public class ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, m;
		
		System.out.println("Digite nota 1:");
		n1 = in.nextDouble();
		System.out.println("Digite nota 2:");
		n2 = in.nextDouble();
		System.out.println("Digite nota 3:");
		n3 = in.nextDouble();
		
		m = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.printf("A sua média ponderada é: %2.2f",m);
		
	}

}
