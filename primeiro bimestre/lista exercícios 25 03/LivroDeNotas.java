public class LivroDeNotas {
    //variável de instância
    //instância é sinônimo de objeto
    private String nomeDisciplina;

    //setter
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    //getter
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    void exibirMensagem(){
        System.out.printf(
            "Bem vindo ao livro de notas %s/n",
            this.nomeDisciplina
            );
    }
}

/*$s/n é parasubstituir a palavra que vc vai colocar
void define que não retorna nenhum valor
var define o tipo de uma variável*/
//chamar um método significa colocá-lo em execução
//o "this" é usado para diferenciar duas variáveis com 
//o mesmo nome