package Atividades.Set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributos

    private Set<Tarefa>tarefaSet;

    //Costructor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    //Métodos

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    //No set como não tem elementos repetidos posso buscar com uma variável só invés de criar outro set
    public void removerTarefa(String descricao){
    Tarefa tarefaRemover = null;
    //VAR da tarefa para remover
    for(Tarefa t:tarefaSet ){
        if (t.getDescricao().equalsIgnoreCase(descricao)){
            //Checa em cada item do set se a descrição bate com a escrita pelo user

            tarefaRemover = t;
            //Se a descrição for igual joga a tarefa pra a VAR para]a remover
            break;
        }
    }
        if (tarefaRemover != null){
            tarefaSet.remove(tarefaRemover);
        }
        else{
            System.out.println("Tarefa não encontrada");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
      return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                //Checa cada tarefa do set e se estiver TRUE (Concluída) ele add na lista
                if (t.getSituacao() == Boolean.TRUE) {
                    tarefasConcluidas.add(t);
                }

            }
        }
        else {
            System.out.println("Não há tarefas concluídas no momento");
            }
                return tarefasConcluidas;

    }


    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                //Checa cada tarefa do set e se estiver FALSE (Pendente) ele add na lista
                if (t.getSituacao() == Boolean.FALSE) {
                    tarefasPendentes.add(t);
                }
            }
        }
        else {
            System.out.println("Não há tarefas Pendentes no momento");
        }
        return tarefasPendentes;

    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefamarcada =null;

        for (Tarefa t:tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                //verifica as tarefas e se a descrição da tarefa bater com a digitada coloca ela como concluida
                t.setSituacao(Boolean.TRUE);
                tarefamarcada = t;
                break;
            }
        }
        if (tarefamarcada != null){
        System.out.println("A tarefa com descrição: " + tarefamarcada  + " foi concluída");
        }
        else {
            System.out.println("Nenhuma tarefa com essa descrição foi encontrada");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefamarcada =null;

        for (Tarefa t:tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setSituacao(Boolean.FALSE);
                tarefamarcada = t;
                break;
            }
        }
        if (tarefamarcada != null){
            System.out.println("A tarefa com descrição: " + tarefamarcada  + " foi marcada como pendente");
        }
        else {
            System.out.println("Nenhuma tarefa com essa descrição foi encontrada");
        }
    }

    public void limparListaTarefas(){
        if (!tarefaSet.isEmpty()){
        tarefaSet.clear();
        //Clear mais recomendado para limpar tudo
        }
        else System.out.println("A lista já está vazia");
    }

}
