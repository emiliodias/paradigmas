package br.com.unitri.orientacaoobjetos.aula1;

import java.util.HashMap;
import java.util.Map;

public class HashMapAlunosDAO implements AlunosDAO {
	
	private static Map<Long, Aluno> alunos = new HashMap<Long, Aluno>();

	@Override
	public void salva(Aluno aluno) {
		
		alunos.put(aluno.getId(), aluno);
		
	}

	@Override
	public Aluno busca(long id) {
		
		return alunos.get(id);
	}

	@Override
	public void remove(long id) {
		
		alunos.remove(id);
		
	}

}
