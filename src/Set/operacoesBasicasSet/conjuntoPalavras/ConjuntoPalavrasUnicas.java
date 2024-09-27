package Set.operacoesBasicasSet.conjuntoPalavras;
import java.util.*;

public class ConjuntoPalavrasUnicas{

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void exibirPalavras(){
        if(!palavraSet.isEmpty()){
        System.out.println(palavraSet);
        } else 
        System.out.println("O Hash está vazio");
    }

    public void removerPalavra(String palavraRemover){
        String palavraTirar = null;
        if(!palavraSet.isEmpty()){
            for(String p : palavraSet){
                if(p.equals(palavraRemover)){
                    palavraTirar = p;
                    break;
                }
                
            }
        }
        palavraSet.remove(palavraTirar);
    }

    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }
    
    
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.adicionarPalavra("amor");
        conjuntoPalavrasUnicas.adicionarPalavra("porta");
        conjuntoPalavrasUnicas.adicionarPalavra("carro");

        conjuntoPalavrasUnicas.exibirPalavras();


        conjuntoPalavrasUnicas.removerPalavra("porta");

        conjuntoPalavrasUnicas.exibirPalavras();

       System.out.println(conjuntoPalavrasUnicas.verificarPalavra("carro"));




    }

    
}