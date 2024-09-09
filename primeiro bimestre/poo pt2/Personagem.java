public class Personagem{
    //variáveis de instância(Instância é sinônimo de objeto)
    String nome;//variável de referência
    private int energia = 10, fome = 0, sono = 0;
    //variáveis primitivas

    //método: tipo de retorno, nome, lista de parâmetros e corpo
    void hunt(){
        if (energia >= 2){
            System.out.println(nome + "caçando");
            energia -= 2;
        }
        else{
            System.out.println(nome + "Sem energia para caçar");  
        }
        fome = Math.min(fome + 1, 10);
        sono = sono == 10 ? sono : sono + 1;
    }
    void comer(){
        if (fome>0){
            System.out.printf("%s comendo\n", nome);
            fome--;
            switch(energia){
                //lógica em queda (fall-through)
                case 10:
                    break;
                default:
                    energia++;
            }
        }
        else{
            System.out.println(nome + " sem fome.");
        }
    }
    void dormir(){
        if (sono >0){
            System.out.printf("%s dormindo\n", nome);
            if (energia < 10){
            energia++;
            sono--; 
            }
        }
        else{
            System.out.println(nome + " sem sono.");
        }
        
    }
    public String toString(){
        return String.format(
            "Energia: %d, Fome: %d, Sono: &d",
            energia, fome, sono);
    }
}
//if operador ternário