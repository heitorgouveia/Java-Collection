package list.operacoesBasicas;

public class Tarefas{

    private String descricao;


    public Tarefas(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public String toString(){
        return "Tarefas{" + 
        "descricao ='" + descricao + '\'' + 
        '}';
    }

}
