package Map.operacoesBasicas;
import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //Atributo
    private Map<String , Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
   
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        // Adicionar contatos
    agendaContato.adicionarContato("Camila", 123456);
    agendaContato.adicionarContato("João", 5665);
    agendaContato.adicionarContato("Carlos", 1111111);
    agendaContato.adicionarContato("Ana", 654987);
    agendaContato.adicionarContato("Maria", 1111111);
    agendaContato.adicionarContato("Camila", 44444);
    
    agendaContato.exibirContatos();

    //agendaContato.removerContato("Maria");

    //agendaContato.exibirContatos();
    String nomePesquisa = "João";
    Integer numeroPesquisa = agendaContato.pesquisarPorNome(nomePesquisa);
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaContato.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);



}
    
}
