import java.util.Random;
public class Vetores2 {
    public static void main (String[] args){
        var gerador = new Random();
        var v = new int[4];
        System.gc(); 
        //gc é garbage collector

        //v.lengh é o tamanho do vetor
        //array é um vetor
        for(int i = 0; i < v.length; i++){
            v[i] = gerador.nextInt(6) + 1;
        }

        int i = 0;
        while (i < 4){
            System.out.println(v[i]);
            i++;
        }

        int menor = v[0];
        for(i = 1; i < v.length; i++){
            if (v[i] < menor)
                menor = v[i];
                //refazer com ternário
                menor = v[i] < menor ? v[i] : menor;
        }
        System.out.println("Menor: " + menor);

        //achar a média    
        var media = 0d;
        //esse "d" informa que esse 0 é double (para dar resultado com vírgula lá na frente.)
        //for each / enhanced for
        for (int e : v){
            media = media + e;
        }
        media = media / v.length;
        System.out.println("Média: " + media);
    }
}
