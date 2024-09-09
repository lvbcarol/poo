import javax.swing.JOptionPane;
public class exercicio30803{
    public static void maid (String [] args){
        //entrada
         int numeroA = Integer.parseInt(
            JOptionPane.showInputDialog(
                null, "Qual o primeiro número?", "Digite o primeiro número", JOptionPane.OK_OPTION
            )
         );
         int numeroB = Integer.parseInt(
            JOptionPane.showInputDialog(
                null, "Qual o segundo número?", "Digite o segundo número", JOptionPane.OK_OPTION
            )
         );
         if (numeroA > numeroB){
            JOptionPane.showMessageDialog(null, "Primeiro maior que segundo.");
         else 
            JOptionPane.showMessageDialog(null, "Segundo maior que primeiro");

         }


    }
}
