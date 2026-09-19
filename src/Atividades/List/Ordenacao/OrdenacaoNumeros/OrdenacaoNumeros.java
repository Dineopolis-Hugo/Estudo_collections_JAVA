package Atividades.List.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numlist;

    public OrdenacaoNumeros() {
        this.numlist = new ArrayList<>();
        //Crianndo arrayList vazio
    }

    //métodos

    public void adicionarNumero(int numero){
            numlist.add(numero);
    //ADD número na list
    }

    List<Integer> ordenarAscendente() {
        //Copiando numlist ↓
        List<Integer> ordenarAscendente = new ArrayList<>(numlist);
        //Verificando se list ta vazia ↓
        if(!numlist.isEmpty()){
            Collections.sort(ordenarAscendente);
            //como a list é de um INTEGER ele ja possui o comparable
            // e não precisa implementar na classe
        return ordenarAscendente;}
        else {
            throw new RuntimeException("a lista está vazia");
        }
    }


    List<Integer> ordenarDescendente(){
        if(!numlist.isEmpty()){
            //copiando arrayList de números ↓
        List<Integer> ordenarDescendente = new ArrayList<>(this.numlist);
        //Ordenando pelo método do comparator ↓
        Collections.sort(ordenarDescendente,new comparatordescendente());
        return ordenarDescendente;}
        else throw new RuntimeException("A lista está vazia");

    }

    public void exibirNumeros(){
        if (!numlist.isEmpty()) {
            System.out.println(this.numlist);
        }
        else {
            throw new RuntimeException("A lista está vazia");
        }
    }
}
//Criando comparator
class comparatordescendente implements Comparator<Integer>{
    @Override
    public int compare(Integer num1, Integer num2) {
        //Comparando números de forma DESCENDENTE (maior para menor) 10<9<8<7<6
        return Integer.compare(num2,num1);
        //A forma de comparar é ascendente pois o 1 parâmetro é o num 2, que pe comparado com o proximo num da list
    }


}

