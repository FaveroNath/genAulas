package lista1;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int diasTotal, anos, meses, dias;
		
		System.out.println("Digite os dias totais vividos: ");
		diasTotal = in.nextInt();
		
		anos = diasTotal/365;
		meses = (diasTotal%365)/30;
		dias = ((diasTotal%365)%30);
		
		System.out.println(anos + " anos " + meses + " meses " + dias + " dias ");

	}

}
