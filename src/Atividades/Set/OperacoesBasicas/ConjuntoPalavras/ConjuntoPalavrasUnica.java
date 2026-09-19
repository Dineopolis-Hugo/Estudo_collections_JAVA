package Atividades.Set.OperacoesBasicas.ConjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnica {
    //Atributos
    private Set<String> palavrasSet;

    //Constructor
    public ConjuntoPalavrasUnica() {
        this.palavrasSet = new HashSet<>();
    }

    //Métodos
    public void adicionarPalavra(String palavra){
        palavrasSet.add((palavra));
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
       if (!palavrasSet.isEmpty()){
        for (String str:palavrasSet){
            //↑ Ele verifica se a palavra digitada é igual a alguma palavra do conjunto
            if(palavra.equals(str) ){
                palavraParaRemover = str;
                //Se fpr igual ele coloca essa palavra no Objeto para remover
                break;
            }
        }
        if (palavraParaRemover == null){
            System.out.println("palavra não encontrada");
            //Se não achar a palavra ele fala
        }else {
            palavrasSet.remove(palavraParaRemover);
            //Se achar remove a palavra do Set
        }
       }
       else {
           System.out.println("O conjunto está vazio");
       }
    }
    //OUTRA FORMA DE FAZER ↓
    /*
    * public void removerPalavra(String palavra) {
    if (!palavrasUnicasSet.isEmpty()) {
      if (palavrasUnicasSet.contains(palavra)) {
        palavrasUnicasSet.remove(palavra);
      } else {
        System.out.println("Palavra não encontrada no conjunto!");
      }
    } else {
      System.out.println("O conjunto está vazio!");
    }
    *
    *  public boolean verificarPalavra(String palavra) {
    return palavrasUnicasSet.contains(palavra);
  }
  }*/
    public boolean verificarPalavra(String palavra) {
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasSet.isEmpty()) {
            System.out.println(palavrasSet);
        }
        else {
            System.out.println("O conjunto está vazio");
        }
    }

}
