package Atividades.Set.OperacoesBasicas;

public class Convidado {
    //Atributos
    private String nome;
    private int codigoConvite;


    //Constructor

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //getters

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    //ToString

    @Override
    public String toString() {
        return "Convidado{" +'\'' +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}' + '\'' ;
    }
}
