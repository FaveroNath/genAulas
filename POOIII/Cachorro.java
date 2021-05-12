package ProjetoJava;
import java.util.*;
public class Cachorro extends Animal {
	Scanner in = new Scanner(System.in);
	private String brinquedoPreferido;
	private boolean statusAlegria;
	public Cachorro(int idade, String brinquedoPreferido, boolean statusAlegria) {
		super("Cachorro", idade);
		this.brinquedoPreferido = brinquedoPreferido;
		this.statusAlegria = statusAlegria;
	}
	
	@Override
	public void mostraInfo() {
		System.out.print("O nome do animal é: "+ getNome()+ "\nIdade: "+getIdade()
				+ "\nBrinquedo Preferido: " + getBrinquedoPreferido()+"\nSom: ");
	}

	public void brincar() {
		System.out.print(statusAlegria ? "Brincar com o brinquedo "+getBrinquedoPreferido() : "Não quer brincar" );

	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au");
	}
	
	@Override
	public void correr() {
		System.out.println("Corre");
	}
	
	public String getBrinquedoPreferido() {
		return brinquedoPreferido;
	}

	public void setBrinquedoPreferido(String brinquedoPreferido) {
		this.brinquedoPreferido = brinquedoPreferido;
	}
	
	public int validaIdade(int idade) {
		while(idade < 1) {
			System.out.println("*****************Digite a idade corretamente!!!!****************");
			System.out.print("Digite a idade do cachorro: ");
			idade = in.nextInt();
		}
		setIdade(idade);
		return getIdade();
	}
	public boolean validaOp(int op) {
		boolean ok;
		while(op != 1 && op != 0) {
			System.out.print("Digite corretamente a opção!!!!!!\n"
					+ "O rabinho do cachorro está balançando:\nDigite 1 - Sim ou 0-Não\n");
			op = in.nextInt();
		}
		return (op == 1 ? true : false);
	
	}

}
