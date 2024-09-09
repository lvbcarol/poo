import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class ex212003 {
    public static void main (String[] args) {
        //byte (1), short (2), int(4), long(8)
        long soma = 0; //acumulador
        long qtDeDigitados = 0; //contador e acumulador
        //float(4bytes)
        float media = 0; //acumulador
        long maior;
        long menor;
        float mediaPares = 0;
        float percentualImpares = 0;
        long valorDigitado;
        do{
            valorDigitado = parseLong (showInputDialog("Digite um valor"));
            if(valorDigitado != 30000){
                soma = soma + valorDigitado;
                qtDeDigitados++; //qtDeDigitados + qtDeDigitados + 1;
                media += valorDigitado; // media = media + valorDigitado;
                if (maior < 0)
                    maior = valorDigitado;
                else if (valorDigitado > maior) //else if é o elif do java
                    menor = valorDigitado;

                if(valorDigitado % 2 == 0)
                    mediaPares += valorDigitado;
                //mediaPares = valorDigitado % 2 == 0 ? mediaPares + valorDigitado : mediaPares;
                // % vê o resto, ? faz uma pergunta, : faz papel de "se não"

                if (valorDigitado % 2 == 1)
                    percentualImpares++;
            }
        }while(valorDigitado != 30000);
        showMessageDialog(null, "Soma:" + soma);
        showMessageDialog(null, "Quantidade de valores digitados:" + qtDeDigitados);
        showMessageDialog(null, "Média:" + (media / qtDeDigitados));
        showMessageDialog(null, "Maior" + maior);
        showMessageDialog(null, "Menor:" + menor);
        //media dos pares
        showmessageDialog(null, "Media pares:" + (MediaPares / (qtDeDigitados - percentualImpares)));

        showMessageDialog(null, "Percentual ímpares:" + (percentualImpares / qtDeDigitados));
    }
}

