package ProjetoJava;
import java.util.*;
public class ex2For {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, cntP = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			n = in.nextInt();
			if(n%2 == 0) cntP++;
		}
		System.out.println("A quantidade de números pares é: "+cntP+"\nA quantidade números impares é: "+(10-cntP));
	}

}
