package br.com.escuderodev.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame{
    public JPanel painelPrincipal;
    private JButton cadastrarButton;
    private JButton consultarButton;
    private JButton sairButton;

    public TelaInicial() {
    cadastrarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            TelaCadastro telaCadastro = new TelaCadastro();
            telaCadastro.setContentPane(telaCadastro.panelMain);
            telaCadastro.setTitle("Cadastro de Cliente");
            telaCadastro.setSize(600,400);
            telaCadastro.setVisible(true);
            telaCadastro.setLocationRelativeTo(null);
            telaCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
