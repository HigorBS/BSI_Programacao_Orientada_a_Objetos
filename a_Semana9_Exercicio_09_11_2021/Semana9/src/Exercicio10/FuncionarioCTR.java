package Exercicio10;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostrarDados(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarInformacoes(funcionarioDTO);
    }
}
