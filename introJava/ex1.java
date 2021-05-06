package lista1;
import java.util.*;

public class ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anos, meses, dias, diasTotal;
		
		System.out.println("Digite os anos: ");
		anos = in.nextInt();
		System.out.println("Digite os meses: ");
		meses = in.nextInt();
		System.out.println("Digite os dias: ");
		dias = in.nextInt();
		
		diasTotal = (anos*365) + (dias*30) + dias;
		
		System.out.println("O total de dias vividos é: "+diasTotal);
		
	}

}
