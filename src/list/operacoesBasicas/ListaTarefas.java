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

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total de tarefas é :" + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");

        listaTarefas.removerTarefa("Tarefa 3");
        

            System.out.println("O numero total de tarefas é :" + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
        
    }
    
}
