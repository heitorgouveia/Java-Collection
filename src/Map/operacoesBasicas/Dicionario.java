package Map.operacoesBasicas;
import java.util.*;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario(){
        dicionarioMap = new HashMap<>();
    }

    public void adicinarPalavra(String nome, String definicao){
        dicionarioMap.put(nome, definicao);
    }

    public void exibirPalavra(){
        System.out.println(dicionarioMap);
    }

    public void removerPalavra(String nome){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(nome);
        }

    }

    public String pesquisarPalavra (String nome){
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(nome);
        }

        return definicaoPorPalavra;

    }
    



    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicinarPalavra("chave", "para abrir porta");
        dicionario.adicinarPalavra("porta", "dar acesso");
        dicionario.adicinarPalavra("computador", "aparelho digital");
        dicionario.adicinarPalavra("celular", "aparelho comunicação");




        dicionario.exibirPalavra();

        dicionario.removerPalavra("chave");

        dicionario.exibirPalavra();

        String cacaPalavra = dicionario.pesquisarPalavra("computador");
        System.out.println(cacaPalavra);
    }

    
}
