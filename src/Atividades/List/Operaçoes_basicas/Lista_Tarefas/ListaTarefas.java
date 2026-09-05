package Atividades.List.Operaçoes_basicas.Lista_Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List <Tarefa> tarefaList;
    //define que na list eu so posso guardar objetos do tipo tarefa


    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }
    //quando criar a lista de tarefas cria um array list vazio

    //criação método add tarefa com o parâmetro descrição
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
        //chama o objeto lista de tarefas e cria uma nova tarefa
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //cria uma nova arraylist chamada tarefasParaRemover
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
                /*para cada tarefa da lista de tarefa checa se a descrição dela é igual
                  a descrição digitada e add na list "tarefasParaRemover" */
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        /*após percorrer toda a list e add as tarefar para remover ele vai remover da [tarefalist]
         *todas as tarefas que estão na list [tarefasParaRemover]

         * È interessante usar esse método pois se tiver tarefas duplicadas ele apaga as duas,
         * se usasse só remove ele ia deletar apenas uma tarefa, mesmo que tivesse duas iguais
         */
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
        //o método "size" retorna em um INT o número de elementos na list, nesse caso, a tarefalist
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
        //vai printar toda a list
    }
}


