package Atividades.List.Operaçoes_basicas.Carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho_Compra {
    //atributo
    private List <Item> itemList;

    public Carrinho_Compra() {
        this.itemList = new ArrayList<>();
        //quando criar a lista de itens cria um array list vazio
    }

    //Métodos

    public void adicionarItem(String nome,double preco,int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
        //chama o objeto lista de itens e cria um novo item
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        //cria uma nova arraylist chamada itemParaRemover
    if(!itemList.isEmpty()) {
        //Se a lista não estiver vazia executa o codigo abaixo
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(item);
                /*para cada item da lista de item checa se o nome dele é igual,
                  se for o nome digitado é add na list "itemsParaRemover" */
            }
        }
        itemList.removeAll(itemParaRemover);
        /*após percorrer toda a list e add os itens para remover ele vai remover da [itemlist]
         *todos os itens que estão na list [itemParaRemover]*/
    }
    else {
        System.out.println("A lista está vazia");
    }
    }

    public double calcularValorTotal() {
        double total = 0.00;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                // pra cada item da lista ele aplica o método de calcular
                // e soma com o total
                total += calculatotal(item.getQuantidade(), item.getPreco());
            }
            return total;
        }
        else
            throw new RuntimeException("A lista tá vazia");

    }

    public double calculatotal(int quantidade, double preco){
        return quantidade * preco;
        //método pra calcular o total de um produto
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        }
        else
            System.out.println("A lista está vazia");
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';}
}
