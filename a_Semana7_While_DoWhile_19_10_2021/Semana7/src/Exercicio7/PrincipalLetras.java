package Exercicio7;

import javax.swing.JOptionPane;

public class PrincipalLetras {
    public static void main(String[] args){
        Letras objetoLetras = new Letras();
        String letra = "1";
        
        while(!letra.equalsIgnoreCase("0")){
            letra = JOptionPane.showInputDialog("Digite uma letra (o número 0 finaliza o programa): ");
            objetoLetras.verificarLetras(letra);
        }
        JOptionPane.showMessageDialog(null, objetoLetras.mostrarResultado());
    }
}
