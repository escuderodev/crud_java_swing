package br.com.escuderodev.dao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection bd = null;
        String user = "root";
        String pass = "1403";

        try {
            String url = "jdbc:mysql://localhost:3306/crud";
            bd = DriverManager.getConnection(url, user, pass);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return bd;
    }
}
