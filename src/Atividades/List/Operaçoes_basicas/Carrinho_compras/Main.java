package Atividades.List.Operaçoes_basicas.Carrinho_compras;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        Carrinho_Compra carrinhoCompra = new Carrinho_Compra();

        // Adicionando itens ao carrinho
        carrinhoCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoCompra.adicionarItem("Caderno", 35d, 1);
        carrinhoCompra.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoCompra.exibirItens();

        // Removendo um item do carrinho
        carrinhoCompra.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoCompra.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoCompra.calcularValorTotal());
    }
}
