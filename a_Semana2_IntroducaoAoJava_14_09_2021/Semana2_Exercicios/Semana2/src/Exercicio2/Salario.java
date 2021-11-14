package Exercicio2;

import javax.swing.JOptionPane;

public class Salario {
    private double salarioAumentado;
    
    public void calcularAumento(double salario, double porcentagem){
        this.salarioAumentado = salario + (salario * porcentagem / 100);
        JOptionPane.showMessageDialog(null, "O salário com aumento é de: R$" + this.salarioAumentado);    
    }
}
