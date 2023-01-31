package br.com.escuderodev.view;

import br.com.escuderodev.dao.ClienteDAO;
import br.com.escuderodev.dto.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
    private JTextField textTelefone;
    private JTextField textNome;
    private JButton salvarButton;
    public JPanel panelMain;
    private JTextField textEndereco;
    private JTextField textDetalhe;

    public TelaCadastro() {

        salvarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = textNome.getText();
            String telefone = textTelefone.getText();
            String endereco = textEndereco.getText();
            String detalhe = textDetalhe.getText();

            if(!isCamposValidos(nome,telefone)) {
                JOptionPane.showMessageDialog(null, "Existem campos obrigatórios não preenchidos.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Cliente cliente = new Cliente(nome, telefone, endereco, detalhe);
                limpaCampos();
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");

//                criando a DAO e enviando os objetos criados
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.cadastrarCliente(cliente);

            }
        }
    });

    }

    private void limpaCampos() {
        textNome.setText("");
        textTelefone.setText("");
        textEndereco.setText("");
        textDetalhe.setText("");
    }

    private boolean isCamposValidos(String ...campos) {
        for (String campo : campos) {
            if (campos == null || "".equals(campo)) {
                return false;
            }
        }
        return true;
    }

    public void fecharCadastro(JFrame jFrame) {
        jFrame.setVisible(false);
    }

}
