package Atividades.List.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    //métodos
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if (!numeros.isEmpty()){
            for (Integer num : numeros) {
                soma += num;
            }
            return soma;
        }
        else throw new RuntimeException("A lista está vazia");
        //lançar a exceção é mais recomendado pois o programa para
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numeros.isEmpty()){
            maiorNumero = numeros.getFirst();
            //Se a lista não estiver vazia o maior número será o primeiro do arrayList
            for (Integer num : numeros){
                if (num >= maiorNumero){
                 maiorNumero = num;
                }
            }
            return maiorNumero;
        }
        else throw new RuntimeException("A lista está vazia");
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!numeros.isEmpty()){
            menorNumero = numeros.getFirst();
            for (Integer num : numeros ){
                if (num <= menorNumero){
                    menorNumero = num;
                }
            }
            return menorNumero;
        }
        else throw new RuntimeException("A lista está vazia");
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        }
        else System.out.println("A lista está vazia");
    }
}
