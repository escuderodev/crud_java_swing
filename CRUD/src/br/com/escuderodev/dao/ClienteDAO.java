package br.com.escuderodev.dao;

import br.com.escuderodev.dto.ClienteDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO clienteDTO) {
        String sql = "insert into cliente (nome, telefone, endereco, detalhe) values (?, ?, ?, ?)";

//        Preparando a conexão e envio dos dados
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, clienteDTO.getNome());
            pstm.setString(2, clienteDTO.getTelefone());
            pstm.setString(3, clienteDTO.getEndereco());
            pstm.setString(4, clienteDTO.getDetalhe());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ClienteDAO - método cadastrar" + erro);
        }
    }

    public ClienteDTO pesquisarCliente(String telefone) {
        String sql = "select * from cliente where telefone = ?";
        ClienteDTO clienteDTO = new ClienteDTO();
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, telefone);
            rs = pstm.executeQuery();

            rs.first();
            clienteDTO.setNome(rs.getString("nome"));
            clienteDTO.setTelefone(rs.getString("telefone"));
            clienteDTO.setEndereco(rs.getString("endereco"));
            clienteDTO.setDetalhe(rs.getString("detalhe"));

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
        return clienteDTO;
    }

    public void alterarCliente(ClienteDTO clienteDTO) {
        String sql = "update cliente set nome = ?, telefone = ?, endereco = ?, detalhe = ? where telefone = ?";
    //        Preparando a conexão e envio dos dados
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, clienteDTO.getNome());
            pstm.setString(2, clienteDTO.getTelefone());
            pstm.setString(3, clienteDTO.getEndereco());
            pstm.setString(4, clienteDTO.getDetalhe());
            pstm.setString(5, clienteDTO.getTelefone());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null,"Cadastro alterado com sucesso!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ClienteDAO - método alterar" + erro);
        }
    }

    public void excluirCliente(ClienteDTO clienteDTO) {
        String sql = "delete from cliente where telefone = ?";
        //        Preparando a conexão e envio dos dados
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, clienteDTO.getTelefone());

            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null,"Cadastro excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null,"Nenhuma exclusão realizada!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ClienteDAO - método deletar" + erro);
        }
    }
}
