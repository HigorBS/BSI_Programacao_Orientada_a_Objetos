package Exercicio6;

import javax.swing.JOptionPane;

public class PrincipalInteiros {
    public static void main(String[] args){
        Inteiros objNumeros = new Inteiros();
        int numero;
        
        for(int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            objNumeros.calculoMenorMaior(numero);  
        }
        JOptionPane.showMessageDialog(null, objNumeros.mostrarResultado());
    }
}
