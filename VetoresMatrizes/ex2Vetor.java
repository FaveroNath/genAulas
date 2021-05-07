package ProjetoJava;
import java.util.*;
public class ex2Vetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[6];
		int somaP = 0, cntI = 0;
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um valor: ");
			a[i] = in.nextInt();
			if(a[i]%2 == 0) somaP += a[i];
			else cntI++;
		}
		System.out.println("Pares:");	
		for(int i = 0; i < 6; i++) if(a[i]%2 == 0) System.out.print(a[i]+" ");
		System.out.println("\nSoma pares: "+somaP);
		
		System.out.println("Ímapres:");
		for(int i = 0; i < 6; i++) if(a[i]%2 != 0) System.out.print(a[i]+" ");
		System.out.println("\nNúmeros de ímpares: "+cntI);
	}

}
