
package com.wolf.dao;

import com.wolf.modelo.Cliente;
import java.util.List;


public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();
	
}
