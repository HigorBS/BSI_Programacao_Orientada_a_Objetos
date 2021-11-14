package Encapsulamento;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args){
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe um nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe um rg: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
