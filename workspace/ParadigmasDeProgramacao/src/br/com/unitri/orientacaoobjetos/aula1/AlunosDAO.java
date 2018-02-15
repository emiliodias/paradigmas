package br.com.unitri.orientacaoobjetos.aula1;

public interface AlunosDAO {

	public void salva(Aluno aluno);
	
	public Aluno busca(long id);
	
	public void remove(long id);
	
}