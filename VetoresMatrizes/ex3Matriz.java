package ProjetoJava;
import java.util.*;

public class ex3Matriz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] m = new int[3][3];
		int cnt = 0;
		
		/*criei um vetor com o tamanho máximo para armazenar os valores maiores que 10
		 como a matriz é 3x3 só cabe 9 valores */
		
		int[] a = new int[10];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("Digite um valor para a matriz[%d][%d]:",(i+1),(j+1));
				m[i][j] = in.nextInt();
				if(m[i][j] > 10) a[cnt++] = m[i][j];	
			}
		}
		System.out.println("Quantidade de valores maiores que 10: "+cnt);
		System.out.print("Valores maiores que 10: ");
		for(int i = 0; i < cnt; i++) System.out.print(a[i]+" ");
	}
}
