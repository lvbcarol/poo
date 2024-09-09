public class VetorDinamico {
    private int[] elementos;
    private int quantidade;
    private int capacidade;

    //construtor
    //blco de código que executa quando falamos new 
    VetorDinamico(){
        quantidade = 0;
        capacidade = 4;
        elementos = new int[capacidade];
    }

    //escreva um método que responda se o método está cheio
    //ou seja, escreva as 4 partes (tipo de retorno, nome, lista de parâmetros e corpo)
    boolean full(){
        return quantidade == capacidade;
    }

    void add(int elemento){
        if (full())
        //não há "":" depois do "if" no java, só no python CUIDADO PARA NÃO CONFUNDIR
            redimensionar();
            elementos[quantidade] = elemento;
            quantidade++;
    }

    private void redimensionar(){
        capacidade = capacidade * 2;
        var aux = new int[capacidade];
        for(int i = 0; i < quantidade; i++){
            aux[i] = elementos[i];
        }
        elementos = aux;
    }

    //escreva um método que responde se o vetor está vazio
    boolean empty(){
        return quantidade == 0;
    }

    public String toString(){
        var sb = new StringBuilder("");
        //sb significa String builder qu é uma classe que permite a utilização do append
        sb.append("Quantidade:").append(quantidade).append("\n");
        sb.append("Capacidade:").append(capacidade).append("\n");
        //este append está adicionando, juntando strings, concatenando (equivalente ao "+", melhor performance)
        if(!empty()){
            sb.append("Itens:").append("\n");
            //for each ("for" melhorado)
            //esse "e" muda de valor à cada iteração, passando de caractere por caractere/ valor por valor
            for(int e: elementos){
                sb.append(e).append("");
            }
        }
        return sb. toString();
        // esse to String converte para string
        // esse pontinho "." depois do sb mostra que o que vem depois dele pertence a ele
        //exemplo: sb.toString -> toString é acessado apartir de sb
        //na linha 31 não tem pq ele está sendo declarado, e não estamos acessando nada dele.
    }
}
