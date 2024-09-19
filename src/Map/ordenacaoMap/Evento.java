package Map.ordenacaoMap;

public class Evento {

    private String nome;
    private String Atracao;

    public Evento (String nome, String Atracao){
        this.nome = nome;
        this.Atracao = Atracao;
    }

    public String getNome (){
        return nome;
    }
    
    public String getAtracao(){
        return Atracao;
    }

    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", Atracao=" + Atracao + "]";
    }

    
    

    
}
