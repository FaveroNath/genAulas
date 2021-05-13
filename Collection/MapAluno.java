package PacoteJava;

import java.util.*;

public class MapAluno {
	public static void main(String[] args) {
		Map<String,Aluno> mp = new TreeMap<String, Aluno>();
		Aluno a = new Aluno("João","Java",6.8);
		Aluno b = new Aluno("zeee","Java2",6.9);
		Aluno c = new Aluno("Zé","Java3",7.8);
		Aluno d = new Aluno("lé","Java2",9.9);
		
		mp.put("João", a);
		mp.put("zeee", b);
		mp.put("Zé", c);
		mp.put("lé", d);
		
		System.out.println(mp);
		System.out.println(mp.get("lé"));
		Collection<Aluno> alunos = mp.values();
		for(Aluno i: alunos) System.out.println(i);
		
	}
}
