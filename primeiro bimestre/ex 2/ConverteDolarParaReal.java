import java.util.Scanner; //<---(AGRUPAMENTO DE PACOTE java.pacote.itemdopacote)
public class ConverteDolarParaReal{
    //identação(ident)
    static public void main (String...args){
        //declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        float cotacaoDolar, quantidadeDolar, valorEmReal;
        //entrada
        System.out.println("Digite a cotação");
        cotacaoDolar = leitor.nextFloat();
        System.out.println("Digite a quantidade de dólares");
        quantidadeDolar = leitor.nextFloat();
        //processamento
        valorEmReal = (cotacaoDolar * quantidadeDolar);
        //saída
        //O resultado é: 500
        System.out.printf("O resultado é: %f, valorEmReal");
        //10 * 50 = 500 
        System.out.printf("%f x %f = %f", cotacaoDolar, quantidadeDolar, valorEmReal);
 

    }
}


