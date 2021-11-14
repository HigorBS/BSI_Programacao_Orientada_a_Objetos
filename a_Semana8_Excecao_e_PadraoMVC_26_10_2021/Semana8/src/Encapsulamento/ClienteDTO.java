package Encapsulamento;

public class ClienteDTO {
    private String nome, rg;
    private int idade;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}
