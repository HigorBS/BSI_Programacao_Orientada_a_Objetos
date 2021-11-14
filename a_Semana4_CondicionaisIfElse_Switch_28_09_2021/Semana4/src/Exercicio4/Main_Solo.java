package Exercicio4;

import javax.swing.JOptionPane;

public class Main_Solo {
    public static void main(String[] args){
        Solo amostra = new Solo();
        int pontosDeAgua;
        
        pontosDeAgua = Integer.parseInt(JOptionPane.showInputDialog("Digite a pontuação de água da amostra: "));
        JOptionPane.showMessageDialog(null, amostra.classificarSolo(pontosDeAgua));
    }
}
