import java.util.Random;
public class TesteVetorDinamico {
    public static void main(String[] args)throws Exception{
        var v = new VetorDinamico();
        var gerador = new Random();
        while(true){
            var valor = gerador.nextInt(6) + 1;
            v.add(valor);
            System.out.println(v);
            System.out.println("---------------------------");
            Thread.sleep(5000);
            System.gc();
            //está fazendo ele "dormir"(aguardar) 5000 milisegundos(5 seg)


        }
    }
}
