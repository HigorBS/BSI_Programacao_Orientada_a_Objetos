package Exercicio11;

public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String consultarResposta(MotoristaDTO motoristaDTO){
        return motoristaDAO.verificarIdade(motoristaDTO);
    }
}
