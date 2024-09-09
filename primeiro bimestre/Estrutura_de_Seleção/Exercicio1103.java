import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class Exercicio1103{
    public static void main (String[] args) {
        double nota1, nota2, media;

        int numeroAlunos;
        do{
            numeroAlunos = parseInt(showInputDialog("Digite o número de alunos (tem que ser positivo)"));
            if (numeroAlunos <= 0)
               showMessageDialog(null, "JOvem, tem que ser positivo");
        }while (numeroAlunos <= 0);

    for(int cont = 1; cont <= 3; cont++){
        nota1 = parseDouble(showImputDialog("Digite a nota 1"));
        nota2 = parseDouble(showImputDialog("Digite a nota 2"));
        media = (nota1 + nota2) / 2;
        showMessageDialog(null, "Média" + media);
        if (media >= 6){
            showMessageDialog(null, "Aprovado");
        }
        else {
            showMessageDialog(null, "Prova SUB");
        }
        /* cont = cont + 1 */
    }
    }
}