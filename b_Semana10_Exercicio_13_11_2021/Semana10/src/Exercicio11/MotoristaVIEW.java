package Exercicio11;

import javax.swing.JOptionPane;

public class MotoristaVIEW {
    public static void main(String[] args){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
        
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade em anos: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.consultarResposta(motoristaDTO));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro encontrado: " + e.getMessage());
        }
        
    }
}
