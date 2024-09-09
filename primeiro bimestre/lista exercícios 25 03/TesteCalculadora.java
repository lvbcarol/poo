public class TesteCalculadora{
    public static void main(String[] args){
        Calculadora minhaCalculadora = new Calculadora();
        System.out.println("Começando...");

        int r1 = minhaCalculadora.somar(2,7);
        System.out.println(r1);
        //não estamos "puxando", mas sim "chamando" o método somar
        int r2 = minhaCalculadora.somar(2,2);
        System.out.println(r2);

        System.out.println("Terminando...");
    }
}