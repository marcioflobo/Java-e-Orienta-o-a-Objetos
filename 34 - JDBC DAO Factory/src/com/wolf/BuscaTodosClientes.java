
package com.wolf;

import com.wolf.dao.ClienteDAO;
import com.wolf.dao.DAOFactory;
import com.wolf.modelo.Cliente;
import java.util.List;


public class BuscaTodosClientes {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		
		List<Cliente> clientes = clienteDAO.buscarTodos();
		
		for (Cliente cliente : clientes) {
			System.out.println("------ Cliente ------");
			System.out.printf("Código: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}
	}
	
}