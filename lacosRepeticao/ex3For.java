package ProjetoJava;
import java.util.*;
public class ex3For {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt1 = 0, cnt2 = 0, idade;
		while(true) {
			System.out.println("Digite sua idade: ");
			idade = in.nextInt();
			if(idade == -99) break;
			if(idade < 21) cnt1++;
			else if(idade > 50) cnt2++;
		}
		System.out.println("Pesssoas com menos de 21: "+cnt1+"\nPessoas com mais de 50: "+cnt2);
	}

}
