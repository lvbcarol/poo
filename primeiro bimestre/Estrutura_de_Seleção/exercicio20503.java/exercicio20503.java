import javax.swing.JOptionPane;
public class exercicio20503{
    public static void maid (String [] args){
        //entrada
        float numeroRealA = Float.parseFloat(
            JOptionPane.showInputDialog(
              null, "Qual o primeiro número real?", "Digite o primeiro número real:", JOptionPane.OK_OPTION
              
            )
        );
        float numeroRealB = Float.parseFloat(
            JOptionPane.showInputDialog(
                null, "Qual o segundo número real?", "Digite o segundo número real:", JOptionPane.OK_OPTION
            )
        );
        //processamento
        //saída
        if (numeroRealA == numeroRealB)
            JOptionPane.showMessageDialog(null, "O número A e B são iguais.");
        
    }
}