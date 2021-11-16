//HERANCA


import javax.swing.*;
public class UsaVeiculo {
    
    public static void main(String args[]) {
        
       Veiculo1 v = new Veiculo1();
       v.liga();
       v.setNome(JOptionPane.showImputDialog("Digite o nome: "));
       v.setVelocidade(Integer.parseInt(JOptionPane.showImputDialog("Digite a Velocidade: ")));
       JOptionPane.showMessageDialog(null,"Velocidade Atual: " + v.getVelocidade());
       v.acelera();
       JOptionPane.showMessageDialog(null,"Velocidade Atual: " + v.getVelocidade() );
       v.frea();
       JOptionPane.showMessageDialog(null,"Velocidade Atual: " + v.getVelocidade() );
       v.desliga();
       
    }
}