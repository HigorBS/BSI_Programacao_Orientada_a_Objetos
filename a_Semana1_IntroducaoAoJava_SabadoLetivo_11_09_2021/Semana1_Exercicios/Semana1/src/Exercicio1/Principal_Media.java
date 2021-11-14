package Exercicio1;

import javax.swing.JOptionPane;

public class Principal_Media {
    public static void main(String[] args){
        Media mediaPonderada = new Media();
        
        float nota1, nota2, nota3;
        int peso1, peso2, peso3;
        
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
        peso1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro peso: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
        peso2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo peso: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
        peso3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro peso: "));
        
        mediaPonderada.calcularMedia(nota1, nota2, nota3, peso1, peso2, peso3);
        
    }//fecha main
}//fecha classe
