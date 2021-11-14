package Exercicio10;

import javax.swing.JOptionPane;

public class FuncionarioVIEW {
    public static void main(String[] args){
        try{
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarDados(funcionarioDTO));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no sistema. " + e.getMessage());
        }
    }
}
