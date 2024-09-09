import java.util.Scanner;

public class exercicio70603 {
    public static void main(String[] args) {
        // declaração de variáveis
        // inferência de tipo
        var leitor = new java.util.Scanner(System.in);
        System.out.println("0-A vista 1-Parcelar no crediario");
        var opcao = leitor.nextInt();
        System.out.println("Digite o valor da roupa");
        var valorDaRoupa = leitor.nextDouble();
        switch (opcao) {
            case 0: {
                System.out.println("Valor com 10 % de desconto: " + (valorDaRoupa * 0.9));
            }
                break;
            case 1: {
                System.out.println("Digite o número de parcelas:");
                int numeroParcelas = leitor.nextInt();
                System.out.println("Valor da parcela: " + valorDaRoupa / numeroParcelas);
                break;
            }
            case 2: {
                System.out.println("Digite o número de parcelas:");
                int numeroParcelas = leitor.nextInt();
                System.out.println("Valor da parcela:" + ((valorDaRoupa * 1.1) / numeroParcelas));
                break;

            }
        }   
    }
}
