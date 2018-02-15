package br.com.unitri.orientacaoobjetos.aula1;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Abstraindo-se o conceito de armazenamento a partir de uma
		 * interface, podemos trocar sua implementação sem impactos
		 * no restante do código.
		 * 
		 * A linha: AlunosDAO dao = new ArrayListAlunosDAO();
		 * 
		 * pode ser trocada por AlunosDAO dao = new HashMapAlunosDAO();
		 * 
		 * sem que o restante do código seja impactado.
		 * 
		 * A esta abstração damos o nome de polimorfismo.
		 * 
		 */
		
		AlunosDAO dao = new ArrayListAlunosDAO();
		
		
		
		Aluno a1 = new Aluno(1l, "Aluno 1", "Rua 1");
		
		dao.salva(a1);
		
		//Irá imprimir o "toString" da classe Aluno
		System.out.println(dao.busca(1));
		
		//Irá imprimir null (Aluno não existe)
		System.out.println(dao.busca(2));
		
		//Remove o aluno com id 2
		dao.remove(2l);
		
		//Remove o aluno com id 3
		dao.remove(3l);
	}

}