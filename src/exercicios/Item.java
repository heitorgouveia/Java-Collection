package exercicios;

public class Item {

    String nome;
    double valor;
    int quantidade; 

    public Item(String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public double getValor(){
        return valor;
    }

    public int getQuantidade(){
        return quantidade;
    }
    
}
