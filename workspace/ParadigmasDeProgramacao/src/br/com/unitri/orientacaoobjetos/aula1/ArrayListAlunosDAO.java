package br.com.unitri.orientacaoobjetos.aula1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAlunosDAO implements AlunosDAO {
	
	private static List<Aluno> alunos = new ArrayList<Aluno>();

	@Override
	public void salva(Aluno aluno) {
		
		alunos.add(aluno);
		
	}

	@Override
	public Aluno busca(long id) {
		
		for(Aluno a : alunos) {
			
			if(a.getId() == id)
				return a;
			
		}
		
		return null;
	}

	@Override
	public void remove(long id) {
		
		for(Aluno a : alunos) {
			
			if(a.getId() == id)
				alunos.remove(a);
			
		}
		
	}

}
