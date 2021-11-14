package Exercicio6;

import javax.swing.JOptionPane;

public class Inteiros {
    private int menor = 99999, maior = 0;
    private String resultado = "";
    
    public void calculoMenorMaior(int numero){
        if(numero > this.maior){
            this.maior = numero;
        }
        if(numero < this.menor){
            this.menor = numero;
        }
    }
    
    public String mostrarResultado(){
        this.resultado = "Maior número: " + this.maior + "\nMenor número: " + this.menor;
        return resultado;
    }
}
