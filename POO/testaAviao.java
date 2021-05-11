package ProjetoJava;

import java.util.Scanner;

public class testaAviao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Aviao aviao1 = new Aviao("",0, false, false, "", 0);
		String mod, comp;
		int cap, vel, a, t;
		
		System.out.println("Digite o modelo do avião:");
		mod = in.nextLine();
		System.out.println("Digite a compania área do avião:");
		comp = in.nextLine();
		System.out.println("Digite a capacidade em lugares do avião:");
		cap = in.nextInt();
		System.out.println("Digite a velocidade do avião:");
		vel = in.nextInt();
		System.out.println("Digite a aceleração do avião:");
		a = in.nextInt();
		System.out.println("Digite o tempo do percurso do avião:");
		t = in.nextInt();
				
		aviao1.setCompaniaArea(comp);
		aviao1.setModelo(mod);
		aviao1.setCapacidade(cap);
		aviao1.setVel(vel);
		
		
		aviao1.ligar();
		aviao1.acelerar(a,t);
		aviao1.testarSupersonico();
		
		//Mostrar dados
		aviao1.mostraInfos();
		
		//verificar se é um avião supersônico
		System.out.println(aviao1.retornaSupersonico()+" Sua velocidade é "+ aviao1.getVel() + " Km/h");
		
	}

}
