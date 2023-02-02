package br.com.escuderodev.view;

import br.com.escuderodev.dao.ClienteDAO;
import br.com.escuderodev.dto.ClienteDTO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaConsulta extends JFrame {
    public JPanel panelConsulta;
    private JTextField txtCodigo;
    private JButton pesquisarButton;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEndereco;
    private JTextField txtDetalhe;

public TelaConsulta() {
    pesquisarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int idcliente = Integer.parseInt(txtCodigo.getText());
            ClienteDAO clienteDAO = new ClienteDAO();

//            chamando metodo para pesquisar no banco
            ClienteDTO clienteDTO = clienteDAO.pesquisarCliente(idcliente);

//            carregando os dados retornados na tela
            txtNome.setText(clienteDTO.getNome());
            txtTelefone.setText(clienteDTO.getTelefone());
            txtEndereco.setText(clienteDTO.getEndereco());
            txtDetalhe.setText(clienteDTO.getDetalhe());
        }
    });
}
}
