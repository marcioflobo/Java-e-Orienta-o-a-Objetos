package com.wolf;

import com.wolf.dao.ClienteDAO;
import com.wolf.dao.DAOFactory;
import com.wolf.modelo.Cliente;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SalvaCliente {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Cliente cliente = new Cliente();

        String nome = JOptionPane.showInputDialog(null, "Nome do cliente",
                 "Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);

        if (nome != null) {
            cliente.setNome(nome);

            ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
            clienteDAO.salvar(cliente);
            System.out.println("Cliente salvo com sucesso.");
        }
    }

}
