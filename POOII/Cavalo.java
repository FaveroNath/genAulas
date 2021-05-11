package ProjetoJava;


public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	public void mostraInfo() {
		System.out.println("O nome do animal é: "+getNome()+"\nIdade: "+getIdade());
		
	}
	public void emitirSom() {
		System.out.println("Relinchar");
	}
	public void correr() {
		System.out.println("Correrrr");
	}
}
