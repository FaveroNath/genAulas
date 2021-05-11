package ProjetoJava;

import java.util.Scanner;

public class testaCliente {

	public static void main(String[] args) {
		// criando meu objeto cliente1
		cliente cliente1 = new cliente("Richard Feynman", 35, 1, 117654765, 20, true);
		
		// consultando seu cadastro
		cliente1.retornaCadastro();
		System.out.println();
		//verificar sua situação
		cliente1.infoSituacao();
		//Verificar se é um cleinte fiel e se tem direito a benefícios;
		cliente1.verificaFidelidade();
		System.out.println();
		cliente cliente2 = new cliente("",0,2,0,0,false);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = in.nextLine();
		System.out.println("Digite sua idade:");
		int idade = in.nextInt();
		
		while(idade <= 1 || idade >= 120) {
			System.out.println("Digite uma idade correta");
			idade = in.nextInt();
		}
		
		System.out.println("Digite seu telefone:");
		int tel = in.nextInt();
		
		System.out.println("Digite tempo de fidelidade:");
		int tempo = in.nextInt();
		
		cliente2.setNome(nome);
		cliente2.setIdade(idade);
		cliente2.setTel(tel);
		cliente2.settempoFidelidade(tempo);
		
		System.out.println();
		cliente2.retornaCadastro();
		System.out.println();
		//verificar sua situação
		cliente2.infoSituacao();
		//Verificar se é um cleinte fiel e se tem direito a benefícios;
		cliente2.verificaFidelidade();
		
	
	}

}
