/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wolf.dao.jdbc;

import com.wolf.dao.ClienteDAO;
import com.wolf.dao.DAOFactory;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDAOFactory extends DAOFactory {

    private Connection connection;

    public JdbcDAOFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente",
                    "root", "root");
        } catch (Exception e) {
            throw new RuntimeException("Erro recuperando conexão com o banco", e);
        }
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new JdbcClienteDAO(connection);
    }

}
