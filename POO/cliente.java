package ProjetoJava;

public class cliente {
	private String nome;
	private int idade;
	private int id;
	private int tel;
	private int tempoFidelidade;
	private Boolean status;
	
	public cliente(String nome, int idade, int id, int tel, int tempoFidelidade, boolean status) {
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.tel = tel;
		this.tempoFidelidade = tempoFidelidade;
		this.status = status;
	}
	public void retornaCadastro() {
		System.out.printf("O cliente %s tem idade %d e seu telefone é %d", nome, idade, tel);
	} 
	public void infoSituacao() {
		System.out.printf("O cliente de ID %d tem seu status ", id);
		if(this.status) System.out.println("Ativo");
		else System.out.println("Inativo");
	}
	
	public void verificaFidelidade() {
		if(this.tempoFidelidade > 5 && this.status ) System.out.printf("Cliente possui fidelidade de %d  anos e tem direito a benefícios!",this.tempoFidelidade);
		else System.out.println("Cliente não tem fidelidade e não tem direito a benefícios!");
	}
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public void settempoFidelidade(int tempoFidelidade) {
		this.tempoFidelidade = tempoFidelidade;
	}
	public int gettempoFidelidade() {
		return tempoFidelidade;
	}
}
