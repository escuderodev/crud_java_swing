import br.com.escuderodev.view.TelaCadastro;
import br.com.escuderodev.view.TelaInicial;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        iniciando telas
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setContentPane(telaInicial.painelPrincipal);
        telaInicial.setTitle("Home");
        telaInicial.setSize(600,400);
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        TelaCadastro telaCadastro = new TelaCadastro();
//        telaCadastro.setContentPane(telaCadastro.panelMain);
//        telaCadastro.setTitle("Cadastro de Cliente");
//        telaCadastro.setSize(600,400);
//        telaCadastro.setVisible(true);
//        telaCadastro.setLocationRelativeTo(null);
//        telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        chamando métodos

    }
}