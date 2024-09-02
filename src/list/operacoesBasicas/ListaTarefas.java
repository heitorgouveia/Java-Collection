package list.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;
import list.operacoesBasicas.Tarefas;

public class ListaTarefas {

    private List <Tarefas> tarefaslList;

    public ListaTarefas(){
        this.tarefaslList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaslList.add(new Tarefas(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas t:tarefaslList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }

        }

        tarefaslList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaslList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaslList);
    }
    
}
