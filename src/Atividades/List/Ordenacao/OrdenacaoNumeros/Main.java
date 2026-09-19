package Atividades.List.Ordenacao.OrdenacaoNumeros;

public class Main {  public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoNumeros
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    // Adicionando números à lista
    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    // Exibindo a lista de números adicionados
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem ascendente
    System.out.println("LISTA ASCENDENTE");
    System.out.println(numeros.ordenarAscendente());

    // Exibindo a lista
    System.out.println("LISTA NORMAL");
    numeros.exibirNumeros();

    // Ordenando e exibindo em ordem descendente
    System.out.println("LISTA DESCENDENTE");
    System.out.println(numeros.ordenarDescendente());

    // Exibindo a lista
    System.out.println("LISTA NORMAL");
    numeros.exibirNumeros();
}
}
