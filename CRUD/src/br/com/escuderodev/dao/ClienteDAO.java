package br.com.escuderodev.dao;

import br.com.escuderodev.dto.Cliente;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    public void cadastrarCliente(Cliente cliente) {
        String sql = "insert into cliente (nome, telefone, endereco, detalhe) values (?, ?, ?, ?)";

//        Preparando a conexão e envio dos dados
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getTelefone());
            pstm.setString(3, cliente.getEndereco());
            pstm.setString(4, cliente.getDetalhe());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ClienteDAO" + erro);
        }
    }
}
