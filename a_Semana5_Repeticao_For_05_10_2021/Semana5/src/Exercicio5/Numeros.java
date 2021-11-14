package Exercicio5;

import javax.swing.JOptionPane;

public class Numeros {
    private int soma = 0;
    private String numeros = "Números: ";
    
    public void somarNumeros(){
        int numero;
        
        for(int i = 1; i <= 10; i++){
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
          this.soma = this.soma + numero;
          this.numeros = this.numeros + numero + "  ";   
        }
    }
    
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null, this.numeros + "\nA soma dos números é: " + this.soma);
    }
}
