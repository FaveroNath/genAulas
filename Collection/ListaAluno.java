package PacoteJava;

import java.util.*;

public class ListaAluno {

	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("João","Java",6.8);
		Aluno b = new Aluno("zé","Java2",6.9);
		Aluno c = new Aluno("Zé","Java3",7.8);
		Aluno d = new Aluno("zé","Java2",6.9);
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		System.out.println(conjunto);
		
	}

}
