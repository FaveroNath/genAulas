package ProjetoJava;
import java.util.*;
public class Cachorro extends Animal {
	Scanner in = new Scanner(System.in);
	private String brinquedoPreferido;
	private boolean statusAlegria;
	public Cachorro(String nome, int idade, String brinquedoPreferido, boolean statusAlegria) {
		super(nome, idade);
		this.brinquedoPreferido = brinquedoPreferido;
		this.statusAlegria = statusAlegria;
	}
	
	public void mostraInfo() {
		System.out.println("O nome do animal é: "+getNome()+"\nIdade: "+getIdade()
				+ "\nBrinquedo Preferido: " + getBrinquedoPreferido());
	}

	public void brincar() {
		System.out.print(statusAlegria ? "Brincar com o brinquedo "+getBrinquedoPreferido() : "Não quer brincar" );

	}
	public void emitirSom() {
		System.out.println("Au Au");
	}
	public void correr() {
		System.out.println("Correrrr");
	}
	public String getBrinquedoPreferido() {
		return brinquedoPreferido;
	}

	public void setBrinquedoPreferido(String brinquedoPreferido) {
		this.brinquedoPreferido = brinquedoPreferido;
	}
	
	public int validaIdade(int idade) {
		while(idade <= 1) {
			System.out.println("*****************Digite a idade corretamente!!!!****************");
			System.out.print("Digite a idade do cachorro: ");
			idade = in.nextInt();
		}
		setIdade(idade);
		return getIdade();
	}

}
