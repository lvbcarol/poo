//Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
//E = 1 + 1/1! + ½! + 1/3! + ... + 1/N!
import java.util.Scanner;
public class exercicio21103{
    public static void main (String[] args){
        double resultadoE = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N:");
        int valorN = sc.nextInt();
    for (int i = 0; i <= valorN; i++){
        int fatorial = 1;
        for (int j = 1; j <= i; j++){
        fatorial = fatorial * j;
    }
        resultadoE += 1/fatorial;
        // esse += significa a atual da variável + o valor que você quer adicionar 
    }
    System.out.println("O valor de E é" + resultadoE);
    }
}