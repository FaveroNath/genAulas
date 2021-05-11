package ProjetoJava;

import java.util.Scanner;

public class testaAviao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Aviao aviao1 = new Aviao("",0, false, false, "", 0);
		String mod, comp;
		int cap, vel, a, t;
		
		System.out.println("Digite o modelo do avi�o:");
		mod = in.nextLine();
		System.out.println("Digite a compania �rea do avi�o:");
		comp = in.nextLine();
		System.out.println("Digite a capacidade em lugares do avi�o:");
		cap = in.nextInt();
		System.out.println("Digite a velocidade do avi�o:");
		vel = in.nextInt();
		System.out.println("Digite a acelera��o do avi�o:");
		a = in.nextInt();
		System.out.println("Digite o tempo do percurso do avi�o:");
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
		
		//verificar se � um avi�o supers�nico
		System.out.println(aviao1.retornaSupersonico()+" Sua velocidade � "+ aviao1.getVel() + " Km/h");
		
	}

}
