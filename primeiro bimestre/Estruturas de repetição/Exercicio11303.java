import java.util.Scanner;
public class Exercicio11303 {
    public static void main (String[] args){
        //var: operador de inderência de tipo desde o Java 10
        var leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        var idade = leitor.nextInt();
        //com if/else, exibir sim, se o usuário tiver pelo menos 18 anos, e não caso contrário
        //if (idade >= 18)
          //System.out.println("sim.");
        //else
          //System.out.println("não.");
        System.out.println(idade >=18? "Sim" : "Não.");
    }
}

