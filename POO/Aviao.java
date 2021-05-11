package ProjetoJava;

public class Aviao {
	private String modelo;
	private int capacidade;
	private boolean supersonico;
	private boolean ligado;
	private String companiaArea;
	private int vel;

	public  Aviao(String modelo, int capacidade, boolean supersonico, boolean ligado, String companiaArea, int vel) {
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.supersonico = false;
		this.ligado = ligado;
		this.companiaArea = companiaArea;
		this.vel = 0;
	}
	
	public void ligar() {
		if(!this.ligado) this.ligado = true;
		else System.out.println("O avião já está ligado");
	}
	public void acelerar(int a, int t) {
		if(this.ligado) this.vel += a*t;
	}
	public void testarSupersonico() {
		if(this.vel > 120) this.supersonico = true;
	
	}
	public void mostraInfos() {
		System.out.printf("O avião modelo (%s) tem capacidade de %d lugares da companhia Aérea (%s)",this.modelo,this.capacidade,this.companiaArea);
	}

	public String retornaSupersonico() {
		if(this.supersonico) return " é superônico";
		else return " infelizmente não é supersônico";
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isSupersonico() {
		return supersonico;
	}

	public void setSupersonico(boolean supersonico) {
		this.supersonico = supersonico;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getCompaniaArea() {
		return companiaArea;
	}

	public void setCompaniaArea(String companiaArea) {
		this.companiaArea = companiaArea;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}
	
	
	
	
}

