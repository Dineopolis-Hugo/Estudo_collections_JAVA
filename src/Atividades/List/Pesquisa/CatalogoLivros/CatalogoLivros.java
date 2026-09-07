package Atividades.List.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atibuto
    private List <Livro> livroList;

    //constructor da arrayList Vazia
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Métodos

    public void adicionarLivro(String titulo,String autor,int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    //o método retorna uma list
    public List<Livro> pesquisarPorAutor(String autor){
      List<Livro> livrosPorAutor = new ArrayList<>();
      if (!livroList.isEmpty()){
          for (Livro l:livroList){
              if (l.getAutor().equalsIgnoreCase(autor)){
                  livrosPorAutor.add(l);
              }
          }
      }
      else System.out.println("A lista está vazia");
      return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial,int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        else System.out.println("A lista está vazia");
        return livrosPorIntervaloAnos;
    }

    //Nessa function retorna apenas o primeiro livro encontrado com mesmo nome, por isso o tipo do retorno é um livro
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo));{
                livroPorTitulo = l;
                break;
                //Break para parar o FOR quando o livro é achado
                }
            }
        }
        else System.out.println("A lista está vazia");
        return livroPorTitulo;
    }

}
