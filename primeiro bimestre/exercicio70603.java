import java.util.Scanner;
public class exercicio20503{
    public static void main (String [] args){
var Leitor = new java.util.Scanner(System.in);
System.out.println("0-A vista 1-Parcelar no cartão 2-Pareclar no crediário");
System.out.println("1-Parcelar no cartão");
System.out.println("2-Parcelar no crediário");
var opcao = Leitor.nextInt();
System.out.println("Digite o valor da roupa:");
var valorDaRoupa = Leitor.nextDouble();
switch(opcao){
case 0:{
    System.out.println("Digite o valor com 10% de desconto:" + (valorDaRoupa * 0.9));
break;
}
     case 1:{
        System.out.println(("Digite o número de parcelas:"));
        int numeroParcelas = Leitor.nextInt();
        System.out.println("Valor da parcela:" + valorDaRoupa / numeroParcelas);
        break;
}
     case 2:{
        System.out.println(("Digite o número de parcelas"));
        int numeroParcelas = Leitor.nextInt();
        System.out.println("Valor da parcela" + ((valorDaRoupa * 1.1) / numeroParcelas));
        break;
     }
     default:
        System.out.println("Opção inválida.");
        break;

       }
        
    }
}

    

