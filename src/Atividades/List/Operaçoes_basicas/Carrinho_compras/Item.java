package Atividades.List.Operaçoes_basicas.Carrinho_compras;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString(){
        return "Item{ " + " Nome: " + nome + '\"' +" Preço: " + preco +
        " Quantidade: " + quantidade + "}\n";
        //configurando ToString
    }
}
