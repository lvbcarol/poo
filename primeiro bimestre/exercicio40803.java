import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class exercicio40803{
    public static void maid (string [] args){
        //entrada
        Double numeroA = Double.parseDouble(
            JOptionPane. showInputDialog(
                null, "Qual o primeiro número?", "Digite o primeiro número", JOptionPane.OK_OPTION
            )
        );
        // nesse caso, daria para a pergunta ser "Insira dois números e o usuário inserir os dois de uma vez?"
        Double numeroB = Double.parseDouble(
            JOptionPane. showInputDialog(
                null, "Qual o segundo número?", "Digite o segundo número", JOptionPane.OK_OPTION
            )
        );
        if (numeroA > numeroB){
            JOptionPane.showMessageDialog(null, numeroA "é maior");
            //está certa essa estrutura para inserir o valor da variável?
        else 
            JOptionPane.showMessageDialog(null, numeroB "é maior ");
        }
           
    }
}