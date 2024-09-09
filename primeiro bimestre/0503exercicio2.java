import javax.swing.JOptionPane;
public class 0503exercicio2{
    public static void maid (String [] args){
        //entrada
        numeroRealA = float.parseFloat(
            JOptionPane.showImputDialog(
              null, "Qual o primeiro número real?", "Digite o primeiro número real:", JOptionPane.OK_OPTION
              //porque eu tenho que escrever duas casas perguntando quase a mesma coisa?

            )
        );
        numeroRealB = float.parseFloat(
            JOptionPane.showImputDialog(
                null, "Qual o segundo número real?", "Digite o segundo número real:", JOptionPane.OK_OPTION
            )
        );
        //processamento
        //saída
        if (numeroRealA == numeroRealB)
            JOptionPane.showMessageDialog(null, "O número A e B são iguais.")
        else
        JOptionPane.ERROR_MESSAGE
    }
}