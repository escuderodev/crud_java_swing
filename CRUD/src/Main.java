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

    }
}