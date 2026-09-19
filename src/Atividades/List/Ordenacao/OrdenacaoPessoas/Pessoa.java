package Atividades.List.Ordenacao.OrdenacaoPessoas;

import java.util.Comparator;

//Implementando comparable para ordenar a lista de pessoas
public class Pessoa implements Comparable<Pessoa> {
    //atributos

    private String nome;
    private int idade;
    private double altura;
    //GETTERS
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    //Constructor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //to string
    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +'\'' +
                ", altura=" + altura +'\'' +
                '}';
    }

    @Override
    //Método comparable
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
        //compara a idade atual com a idade do objeto
    }
}

    //Class comparator
class comparatorPorAltura implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(),p2.getAltura());
    }
}

