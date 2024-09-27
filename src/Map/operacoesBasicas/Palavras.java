package Map.operacoesBasicas;

public class Palavras {

    private String nome;
    private String definicao;

    public Palavras(String nome, String definicao){
        this.nome = nome;
        this.definicao = definicao;
    }

    public String getNome(){
        return nome;
    }

    public String getDefinicao(){
        return definicao;
    }

    @Override
    public String toString() {
        return "Palavras [nome=" + nome + ", definicao=" + definicao + "]";
    }

    
    
}
