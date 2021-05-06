package ProjetoJava;
import java.util.*;
public class ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, s = 0, i = 0;
		double media = 0;
		do {
			System.out.println("Digite um valor: ");
			n = in.nextInt();
			
			if(n%3 == 0 && n != 0) {
				s += n;
				i++;
			}
			
			
		}while(n != 0);
		
		media = ((double)s)/(i);
		
		System.out.printf("A média dos múltiplos de 3 é: %2.2f",media);
	}

}
