package Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoTelefone){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 123312333);
        System.out.println("Contato Atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();

    }



    
    
}
