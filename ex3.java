package ProjetoJava;

import java.util.*;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade = in.nextInt();
		
		if(10 <= idade && idade <= 14) System.out.println("Infantil");
		else if(14 < idade && idade <= 17) System.out.println("Juvenil");
		else if(17 < idade && idade <= 25) System.out.println("Adulto");
	}

}
