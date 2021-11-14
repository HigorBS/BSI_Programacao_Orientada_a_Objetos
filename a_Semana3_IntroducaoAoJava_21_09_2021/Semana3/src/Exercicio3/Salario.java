package Exercicio3;

import javax.swing.JOptionPane;

public class Salario {
    private double comissao, salFinal;
    
    public void calcularSalFinal(double salFixo, double valorVendas){
        this.comissao = valorVendas * 4 / 100;
        this.salFinal = salFixo + comissao;
        
        JOptionPane.showMessageDialog(null, "Comissão: R$" + this.comissao
                + "\nSalário final: R$" + this.salFinal);
    }
}
