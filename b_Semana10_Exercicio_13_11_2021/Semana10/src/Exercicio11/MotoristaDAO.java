package Exercicio11;

public class MotoristaDAO {
    public String verificarIdade(MotoristaDTO motoristaDTO){
        int idade = motoristaDTO.getIdade();
        
        if(idade >= 18){
            return "O indivíduo já pode obter sua CNH.";
        }else{
            return "O indivíduo ainda não pode obter sua CNH.";
        }
    }
}
