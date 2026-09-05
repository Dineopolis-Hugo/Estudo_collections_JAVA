package Comparable_Comparator;

import java.util.Comparator;

// Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;
    //atributos

    // Construtor
    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }
//COMPARABLE

    // Usado para ordenar livros por ano
    public int compareTo(Livro l) {
        //com o compareTo compara o objeto "livro" nomeado de "l"
        return titulo.compareTo(l.titulo);
        //retorna a comparação de "l"(livro) pelo titulo
    }

    // Métodos getters para acessar os dados privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}
//COMPARATOR

// Classe para comparar Livro por autor
//no comparator cria uma classe apenas pra comparar

class CompararAutor implements Comparator<Livro> {
//passa o objeto a ser comparado dentro de "<>" (diamonds)
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

// Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
		/*
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
		 */
    }
}

class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0)
        //Se o ano do livro for igual (retorna 0) então ele ordena pelo proximo atributo
        //senão ordena pelo atributo atual
            return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0)
            return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
