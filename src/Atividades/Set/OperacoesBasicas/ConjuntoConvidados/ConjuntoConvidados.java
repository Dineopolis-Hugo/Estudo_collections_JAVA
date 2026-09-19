package Atividades.Set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    //Constructor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
        //Cria um conjunto vazio [do tipo HashSet]
    }

    //Métodos
    public void adicionarConvidado(String nome,int codigoConvite ){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            else {
                System.out.println("Não há convidado com esse código");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
        //esse método retorna a quantidade de itens no set em um INT
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
        //printa todo os itens do Set
    }


}
