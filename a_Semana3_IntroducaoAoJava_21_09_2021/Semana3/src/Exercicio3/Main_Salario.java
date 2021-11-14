package Exercicio3;

import javax.swing.JOptionPane;

public class Main_Salario {
    public static void main(String[] args){
        Salario sal = new Salario();       
        double salFixo, vendas;
        
        salFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário fixo: "));
        vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das vendas do mês: "));
        
        sal.calcularSalFinal(salFixo, vendas);
    }
}
