package Exercicio1;

import javax.swing.JOptionPane;

public class Media {
    private float mediaPonderada;
    
    public void calcularMedia(float nota1, float nota2, float nota3, int peso1, int peso2, int peso3){
        int pesos = peso1 + peso2 + peso3;
        
        this.mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / pesos;
        JOptionPane.showMessageDialog(null, "Média das notas: " + this.mediaPonderada);
    }
}
