package Atividades.Set.Pesquisa.AgendaContatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;


    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    //Método equals pra checar se um contato é igual o outro (pelo nome nesse caso)
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }
    //Hashcode é um código que determina em que região do Set vai ser armazenado o objeto
    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
