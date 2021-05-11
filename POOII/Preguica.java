package ProjetoJava;


public class Preguica extends Animal {

	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	public void mostraInfo() {
		System.out.println("O nome do animal é: "+getNome()+"\nIdade: "+getIdade());
	}

	public void emitirSom() {
		System.out.println("???");
	}
	public void subirEmArvore() {
		System.out.println("Escalar");
	}
}
