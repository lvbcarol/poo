import java.util.Random;
;public class jogoV2 {
    public static void main (String[] args) throws Exception{
        var gerador = new Random();
        var meuPersonagem = new Personagem();
        meuPersonagem.nome = "Empadinha";
        //0: hunt
        //1: comer
        //2: dormir
        while (true){
            //cria um loop infinito
            int oQueFazer = 1 + gerador.nextInt(3);
            switch(oQueFazer){
                case 1:
                meuPersonagem.hunt();
                break;
                case 2:
                meuPersonagem.comer();
                break;
                case 3:
                meuPersonagem.dormir();
            }
            System.out.println(meuPersonagem);
            System.out.println("______________________________");
            Thread.sleep(5000);
        }
    }
}
