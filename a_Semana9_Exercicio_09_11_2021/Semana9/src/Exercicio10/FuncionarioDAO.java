package Exercicio10;

public class FuncionarioDAO {
    public String mostrarInformacoes(FuncionarioDTO funcionarioDTO){
        return "Código: " + funcionarioDTO.getCodigo()
                + "\nTelefone: " + funcionarioDTO.getTelefone();
    }
}
