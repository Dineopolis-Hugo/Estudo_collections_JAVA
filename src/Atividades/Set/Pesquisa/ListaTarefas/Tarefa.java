package Atividades.Set.Pesquisa.ListaTarefas;

import java.util.Objects;

public class Tarefa {
    //atributo
    private String descricao;
    private Boolean concluida = false;

    public String getDescricao() {
        return descricao;
    }

    public Boolean getSituacao() {
        return concluida;
    }

    public void setSituacao(Boolean concluida) {
        this.concluida = concluida;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }

    //Equals pra caso eu for comparar as tarefas pra não deixaar com a mesma descrição
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }
}
