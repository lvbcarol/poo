public class jovoV1 {
    public static void main(String[] args){
        //1. construir um objeto Personagem (usando operador de inferência de tipo)
        var p = new Personagem();
        p.nome = "Jack";
        //2.chamar o método hunt
        p.hunt();
        //3.chamar o método comer
        p.comer();
        //4.chamar o método dormir 
        p.dormir();
    }
}
