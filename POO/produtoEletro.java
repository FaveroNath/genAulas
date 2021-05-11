package ProjetoJava;

public class produtoEletro {
	private String nome;
	private double preco;
	private int id;
	private boolean status;
	private int estoque;
	private String descricao;
	
	public produtoEletro(String nome, double preco, int id, boolean status, int estoque, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.id = id;
		this.status = status;
		this.estoque = estoque;
		this.descricao = descricao;
	}

	// Método de consulta
	public String conultaProduto() {
		String ans = null;
		if(this.status) ans = "O produto " + this.nome + " com ID " + this.id  + " de preço " + this.preco + " possui estoque";
		else ans = "O produto " + this.nome + " com ID " + this.id  + " de preço " + this.preco + " não possui estoque é necessário repor!!!!";
		return ans;
	}
	
	// Método para avaliar se ainda possui estoque, abaixo de 5 produtos é necessário repor, e o status fica falso até repor;
	
	public void verificaEstoque() {
		if(this.estoque > 5) this.status = true;
		else this.status = false;
	}
	
	// Método que avalia se o produto pode ganhar um desconto se o estoque for maior que 100 produtos;
	// 50 produtos ganha 5% de desconto
	
	public void aplicarDesconto() {
		double desc = 0;
		if(this.estoque > 100) {
			int est = this.estoque - 100;
			int quant = est/50;
			desc = quant * 0.5;
			this.preco *= (1-desc);
		} 	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
