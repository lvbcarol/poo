public class calculadora{
    //sobrecarga de métodos
    //overload
    //polimorfismo estático
    //estático: feito pelo compilador
    public int somar(int a, int b){
        return a + b;
    }

    public float somarFloats(float a, float b){
        return a + b;
    }

    public int somar(String a, String b){
        return Integer.parseInt(a) +
        Integer.parseInt(b);
    }

    public int somar(int a, String b){
        //tentando fazer sem usar +
        return somar(a, Integer.parseInt(b));
    }

    public int somar(String a, int b){
        return somar(b, a);
    }

    public int somar(String a, String b, String c){
        return (somar(a,b), c);
    }





}
