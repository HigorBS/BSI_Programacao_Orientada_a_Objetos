package Exercicio2;

import javax.swing.JOptionPane;

public class Main_Salario {
    public static void main(String[] args){
        Salario calcularSalario = new Salario();
        
        double salario, porcentagem;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite aqui o seu salário atual: "));
        porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do aumento: "));
        
        calcularSalario.calcularAumento(salario, porcentagem);
    }
}
