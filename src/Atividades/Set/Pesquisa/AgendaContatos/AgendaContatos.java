package Atividades.Set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        //Cria novo hashSet  vazio pra filtrar
        for(Contato c: contatoSet){
            if (c.getNome().startsWith(nome)){
                //Pra cada contato ele vai ver se o nome do contato começa com o nome passado no parâmetro
                //StartsWith
                contatoPorNome.add(c);
                //Se começar com o nome do parâmetro ele add no Set filtrado
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome ,  int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet ){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;

            }
        }
        return contatoAtualizado;
        }
    }

