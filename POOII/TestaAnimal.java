package ProjetoJava;

import java.util.*;

public class TestaAnimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Cachorro cachorro1 = new Cachorro("Cachorro (apelido: Au Au)", 5, "Bolinha azul",false);
		Cavalo cavalo1 = new Cavalo("Cavalo (Apelido: pocotó)",8);
		Preguica preguica1 = new Preguica("Preguiça (Apelido: preguicinha)",12);
		
		cachorro1.mostraInfo();
		System.out.print("Som: ");
		cachorro1.emitirSom();
		cachorro1.correr();
		cachorro1.brincar();
		System.out.println("\n*****************************************************");
		cavalo1.mostraInfo();
		cavalo1.emitirSom();
		cavalo1.correr();
		System.out.println("*****************************************************");
		preguica1.mostraInfo();
		preguica1.emitirSom();
		preguica1.subirEmArvore();
		System.out.println("*****************************************************");
		String nome,  brinquedoPreferido;
		int idade, op;
		boolean ok;
		System.out.print("Digite o nome do cachorro: ");
		nome = in.nextLine();
		System.out.print("Digite a idade do cachorro: ");
		idade = in.nextInt();
		in.nextLine();
		idade = cachorro1.validaIdade(idade);
		System.out.print("Digite o brinquedo Preferido: ");
		brinquedoPreferido = in.nextLine();
		System.out.print("O rabinho do cachorro está balançando:\nDigite 1 - Sim ou 0-Não\n");
		op = in.nextInt();
		while(op != 1 && op != 0) {
			System.out.print("Digite corretamente a opção!!!!!!\n"
					+ "O rabinho do cachorro está balançando:\nDigite 1 - Sim ou 0-Não\n");
			op = in.nextInt();
		}
		if(op == 1) ok = true;
		else ok = false;
		
		Cachorro cachorro2 = new Cachorro(nome,idade,brinquedoPreferido,ok);
		System.out.println("*****************************************************");
		cachorro2.mostraInfo();
		cachorro2.emitirSom();
		cachorro2.correr();
		cachorro2.brincar();
	}

}
