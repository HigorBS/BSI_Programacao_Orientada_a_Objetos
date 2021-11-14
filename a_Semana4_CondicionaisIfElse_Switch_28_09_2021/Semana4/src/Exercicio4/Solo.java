package Exercicio4;

import javax.swing.JOptionPane;

public class Solo {
    private int pontosAgua;
    private String mensagem;
    
    public String classificarSolo(int pontuacao){
        this.pontosAgua = pontuacao;
        
        if(this.pontosAgua <= 10){
            this.mensagem = "Amostra rochosa";
        }else if(this.pontosAgua > 10 && this.pontosAgua <= 40){
            this.mensagem = "Amostra firme";
        }else if(this.pontosAgua > 40 && this.pontosAgua <= 80){
            this.mensagem = "Amostra pantanosa";
        }else{
            this.mensagem = "Quantidade de água inválida";
        }
        
        return this.mensagem;
    }
}
