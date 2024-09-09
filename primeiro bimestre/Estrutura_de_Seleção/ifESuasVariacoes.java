import javax.swing.JOptionPane;
public class ifESuasVariacoes{
     public static void main(String[] args) {
      //declaração de variáveis
        final double VALOR_MINIMO = 0;
        final double VALOR_MAXIMO = 10;
        double notaFinal;
      //entrada
        notaFinal = Double.parseDouble(
            JOptionPane.showInputDialog(
             null,
            "Digite a nota?",
            "Qual a nota?",
            JOptionPane.OK_OPTION
            )
        );
      //processamento
      //saída
      if (notaFinal >= VALOR_MINIMO && notaFinal <= VALOR_MAXIMO){
           if (notaFinal >= 9){
           JOptionPane.showMessageDialog(null, "A");
           JOptionPane.showMessageDialog(null, "Parabéns!");
      }
           else if (notaFinal >= 8)
           JOptionPane.showMessageDialog(null, "B");
           else if (notaFinal >= 6)
           JOptionPane.showMessageDialog(null, "C");

           else 
           JOptionPane.showMessageDialog(null, "Recuperação");
       } 
      else 
      JOptionPane.showMessageDialog(null, "Nota Inválida");
    }
}