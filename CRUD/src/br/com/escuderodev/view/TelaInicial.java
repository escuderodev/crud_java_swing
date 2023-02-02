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
            telaCadastro.setSize(700,500);
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
        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaConsulta telaConsulta = new TelaConsulta();
                telaConsulta.setContentPane(telaConsulta.panelConsulta);
                telaConsulta.setTitle("Cadastro de Cliente");
                telaConsulta.setSize(700,500);
                telaConsulta.setVisible(true);
                telaConsulta.setLocationRelativeTo(null);
                telaConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
