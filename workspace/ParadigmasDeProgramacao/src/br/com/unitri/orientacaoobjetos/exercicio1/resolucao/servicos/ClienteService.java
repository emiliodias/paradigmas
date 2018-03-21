package br.com.unitri.orientacaoobjetos.exercicio1.resolucao.servicos;

import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.dominio.Cliente;
import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.exceptions.IdadeInvalidaException;
import br.com.unitri.orientacaoobjetos.exercicio1.resolucao.repositorios.RepositorioCliente;

public class ClienteService {

	private RepositorioCliente repositorio = new RepositorioCliente();
	
	public Cliente buscar(long id) {
		
		Cliente cliente = repositorio.buscar(id);
		
		return cliente;
		
	}
	
	public Cliente salvar(Cliente cliente) {
		
		if(cliente.getIdade() == null){
			
			throw new IdadeInvalidaException();
			
		}
		
		if(cliente.getNome() == null){
			
		}
		
		if(cliente.getTelefone() == null){
			
		}
		
		return repositorio.salvar(cliente);
		
	}
	
	public void remover(Integer id) {
		
		repositorio.remover(id);
		
	}
	
	public void atualizar(Cliente cliente) {
		
		repositorio.atualizar(cliente);
		
	}
	
}