package Exercicio10;

public class FuncionarioDTO {
    private String telefone;
    private int codigo;
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
}
