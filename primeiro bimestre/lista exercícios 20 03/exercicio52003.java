import java.util.Scanner;
public class exercicio52003 {
    public static void maid (String[] args) {
        var leitor = new Scanner(System.in);
        System.out.println("Quantos termos?");
        int numeroTermos = leitor.nextInt();
        int denominador = 1;
        boolean incrementandoDenominador = true;
        for (int i = 1; i <= numeroTermos; i++){
            if(denominador % 4 == 0)
            addDenominador = false;
            else if(denominador == 1)
            addDenominador = true;
            System.out.print(denominador + " ");
            if(addDenominador)
                denominador++;
            else
                denominador--;
        }
    }
}