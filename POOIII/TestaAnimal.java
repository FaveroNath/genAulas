package ProjetoJava;

import java.util.*;

public class TestaAnimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Cachorro cachorro1 = new Cachorro(5, "Bolinha azul",false);
		Cavalo cavalo1 = new Cavalo(8);
		Preguica preguica1 = new Preguica(12);
		Animal animal = null;
		
		animal = cachorro1;
		cachorro1.mostraInfo(); System.out.print("Som: "); animal.emitirSom(); animal.correr(); cachorro1.brincar();
		
		System.out.println("\n*****************************************************");
		
		animal = cavalo1;
		cavalo1.mostraInfo(); animal.emitirSom(); animal.correr();
		
		System.out.println("*****************************************************");
		animal = preguica1;
		preguica1.mostraInfo(); animal.emitirSom(); animal.correr();
		System.out.println("*****************************************************");
		
		String nome,  brinquedoPreferido; 
		int idade, op; 
		
		System.out.print("Digite a idade do cachorro: "); idade = in.nextInt(); idade = cachorro1.validaIdade(idade); 
		System.out.print("O rabinho do cachorro está balançando:\nDigite 1 - Sim ou 0-Não\n"); op = in.nextInt(); in.nextLine();
		boolean ok = cachorro1.validaOp(op);
		System.out.print("Digite o brinquedo Preferido: "); brinquedoPreferido = in.nextLine();
		Cachorro cachorro2 = new Cachorro(idade,brinquedoPreferido,ok);
		animal = cachorro2;
		
		System.out.println("*****************************************************");
		
		cachorro2.mostraInfo(); animal.emitirSom(); animal.correr();
		cachorro2.brincar();
	}

}
