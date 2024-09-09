import javax.swing.JOptionPane;
public class 0503exercicio1{
    public static void main (String[] args) {
        //entrada 
          int numeroInteiro = Integer.parseInt(
            JOptionPane.showInputDialog(
                null, "Qual é o número inteiro?", "Digite o número inteiro:", JOptionPane.OK_OPTION
            )
          );
          float  numeroReal = Float.parseFloat(
            JOptionPane.showImputDialog(
                null, "Qual é o número real?", "Digite o número real:", JOptionPane.OK_OPTION
            )
          );
        //processamento 
        //saída
         if (numeroInteiro < numeroReal){
            JOptionPane.showMessageDialog(null, "O número inteiro é menor que o número real.");
         }
        
        
}