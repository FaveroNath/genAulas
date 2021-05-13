package PacoteJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		//Collection - List
		Collection<String> nomes = new ArrayList();
		
		//Add
		nomes.add("Mário");
		nomes.add("Ju");
		nomes.add("Ka");
		nomes.add("La");
		
		//Junções de Listas
		Collection<String> nome1 = Arrays.asList("Antonio","Edson");
		nomes.addAll(nome1);
		System.out.print("Lista de nomes: "+nomes);
		for(String i: nomes) System.out.println(i);
		
		//verificar se está vazia
		if(nomes.isEmpty()) System.out.println("Lista vazia!");
		else System.out.print("Lista de nomes: "+nomes);
		
		//Remover 
		nomes.remove("Mário");
		
		System.out.print("Lista de nomes: "+nomes);
		
		//Limpar o set
		nomes.clear();
		System.out.println("Contém Ka?"+nomes.contains("Ka"));
		System.out.print("Lista de nomes: "+nomes);
		
		//Verificar se o campo está vazio
		String nome = in.nextLine();
		while(nome.isEmpty()) {
			System.out.println("Este campo está vázio, por favor digite algo!!!!");
			nome = in.nextLine();
		}
		System.out.println(nome);

	}

}
