package br.com.escuderodev.view;

import br.com.escuderodev.dao.ClienteDAO;
import br.com.escuderodev.dto.ClienteDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConsulta extends JFrame {
    public JPanel panelConsulta;
    private JTextField txtPesqTelefone;
    private JButton pesquisarButton;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEndereco;
    private JTextField txtDetalhe;
    private JButton excluirButton;
    private JButton alterarButton;

    public TelaConsulta() {
    pesquisarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String telefone = txtPesqTelefone.getText();
            ClienteDAO clienteDAO = new ClienteDAO();

//            chamando metodo para pesquisar no banco
            ClienteDTO clienteDTO = clienteDAO.pesquisarCliente(telefone);

//            carregando os dados retornados na tela
            txtNome.setText(clienteDTO.getNome());
            txtTelefone.setText(clienteDTO.getTelefone());
            txtEndereco.setText(clienteDTO.getEndereco());
            txtDetalhe.setText(clienteDTO.getDetalhe());
        }
    });

    alterarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = txtNome.getText();
            String telefone = txtTelefone.getText();
            String endereco = txtEndereco.getText();
            String detalhe = txtDetalhe.getText();

            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setNome(nome);
            clienteDTO.setTelefone(telefone);
            clienteDTO.setEndereco(endereco);
            clienteDTO.setDetalhe(detalhe);

            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.alterarCliente(clienteDTO);

            limpaCampos();

            }
        });
    excluirButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String telefone = txtPesqTelefone.getText();

            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setTelefone(telefone);

            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.excluirCliente(clienteDTO);

            limpaCampos();

            }
        });
    }

    private void limpaCampos() {
        txtPesqTelefone.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtDetalhe.setText("");
    }
}
