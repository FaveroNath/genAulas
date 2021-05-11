package ProjetoJava;
import java.util.*;

public class testaProduto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		produtoEletro[] prod = new produtoEletro[6];
		int i = 1;
		String nome, desc;
		int id, estoque;
		double preco;
		
		while(i <= 2) {
			System.out.printf("Digite o nome do produto %d:",i);
			nome = in.nextLine();
			System.out.print("Digite o estoque:");
			estoque = in.nextInt();
			in.nextLine();
			System.out.print("Digite uma descrição:");
			desc = in.nextLine();
			System.out.print("Digite o preço:");
			preco = in.nextDouble();
			in.nextLine();
			
			prod[i] = new produtoEletro(nome, preco , i , false, estoque, desc);
		
			prod[i].verificaEstoque();
				
			i++;
		}
		for(int j = 1; j <= 2; j++) {
			 System.out.println(prod[j].conultaProduto());
			 prod[j].aplicarDesconto();
			 System.out.println("Novo preço: "+prod[j].getPreco()+" descrição: "+prod[j].getDescricao());
			 
		} 
			
		
	
		
	}

}
