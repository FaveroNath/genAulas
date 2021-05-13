package PacoteJava;

import java.util.*;

public class MapAluno {
	public static void main(String[] args) {
		Map<String,Aluno> mp = new TreeMap<String, Aluno>();
		Aluno a = new Aluno("Jo�o","Java",6.8);
		Aluno b = new Aluno("zeee","Java2",6.9);
		Aluno c = new Aluno("Z�","Java3",7.8);
		Aluno d = new Aluno("l�","Java2",9.9);
		
		mp.put("Jo�o", a);
		mp.put("zeee", b);
		mp.put("Z�", c);
		mp.put("l�", d);
		
		System.out.println(mp);
		System.out.println(mp.get("l�"));
		Collection<Aluno> alunos = mp.values();
		for(Aluno i: alunos) System.out.println(i);
		
	}
}
