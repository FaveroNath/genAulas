package ProjetoJava;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, maxAns = -1000000000;
		System.out.println("Digite um valor: ");
		a = in.nextInt();
		System.out.println("Digite um valor: ");
		b = in.nextInt();
		System.out.println("Digite um valor: ");
		c = in.nextInt();
		
		if(maxAns < a) maxAns = a;
		if(maxAns < b) maxAns = b;
		if(maxAns < c) maxAns = c;
			
		
		System.out.println("O maior valor é: "+maxAns);
		
	}

}
