package Atividades.List.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atriburto
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    //criando arrayList vazio

    //Método add Pessoa
     public void adicionarPessoa(String nome ,int idade ,double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));

     }

     public List<Pessoa> compararPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        //Copia a lista de pessoas
         Collections.sort(pessoaPorIdade);
         //Lista de acordo com a idade
         //compara a list através do método feito na classe pessoa
         return pessoaPorIdade;
     }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        //Copiando lista de pessoas
        Collections.sort(pessoaPorAltura,new comparatorPorAltura());
        //Listando de acordo com a altura (Metodo comparator)
        return pessoaPorAltura;
    }
}
