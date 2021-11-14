package Exercicio7;

import javax.swing.JOptionPane;

public class Letras {
    private int a, e, i, o, u, consoantes;
    private String resultado;
    
    public void verificarLetras(String letra){
        if(letra.equalsIgnoreCase("a")){
            this.a++;
        }else if(letra.equalsIgnoreCase("e")){
            this.e++;
        }else if(letra.equalsIgnoreCase("i")){
            this.i++;
        }else if(letra.equalsIgnoreCase("o")){
            this.o++;
        }else if(letra.equalsIgnoreCase("u")){
            this.u++;
        }else{
            if(!letra.equalsIgnoreCase("0")){
                this.consoantes++;   
            }    
        }
    }
    
    public String mostrarResultado(){
        this.resultado = "*Quantidade de letras digitadas*\n A: " + this.a + "\n E: " + this.e
                + "\n I: " + this.i + "\n O: " + this.o + "\n U: " + this.u +
                "\n Consoantes: " + this.consoantes;
        return this.resultado;
    }  
}
