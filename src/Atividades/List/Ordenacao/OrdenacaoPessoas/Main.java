package Atividades.List.Ordenacao.OrdenacaoPessoas;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoa
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoa.getPessoaList());
        System.out.println();

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoa.compararPorIdade());
        System.out.println();

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println();
    }
}

